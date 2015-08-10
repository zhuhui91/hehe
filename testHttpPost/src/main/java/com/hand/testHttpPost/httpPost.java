package com.hand.testHttpPost;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class httpPost {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      new ReadPost().start();
		
	}
	
}

class ReadPost extends Thread{
	public void run() {
		try {
			
			URL url=new URL("http://fanyi.youdao.com/openapi.do");
		   HttpURLConnection connection=(HttpURLConnection) url.openConnection();
		   connection.addRequestProperty("encoding", "UTF-8");
		   connection.setDoInput(true);;
		   connection.setDoOutput(true);
		   connection.setRequestMethod("POST"); //应在流前设定所有参数
		   
//		  InputStream is=connection.getInputStream();  //此位置不对
//		  InputStreamReader isr=new InputStreamReader(is);
//		  BufferedReader br=new BufferedReader(isr);
		  
		  OutputStream os=connection.getOutputStream();
		  OutputStreamWriter osw=new OutputStreamWriter(os);
		  BufferedWriter bw=new BufferedWriter(osw);
		  
//		  connection.setRequestMethod("POST"); //此位置不对
		  
		  bw.write("keyfrom=JKXY-lianxi&key=1155021050&type=data&doctype=xml&version=1.1&q=welcome");
		  bw.flush(); //强制输出
		  
		  InputStream is=connection.getInputStream();  //应在发送消息后输入流
		  InputStreamReader isr=new InputStreamReader(is);
		  BufferedReader br=new BufferedReader(isr);
		  
		  
		  String line;
		  StringBuilder builder=new StringBuilder();
		  while((line=br.readLine())!=null){
			  builder.append(line);
			 
		  }
		  bw.close();
		  osw.close();
		  os.close();
		  br.close();
		  isr.close();
		  is.close();
		  
		  System.out.println(builder.toString());
		  
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
