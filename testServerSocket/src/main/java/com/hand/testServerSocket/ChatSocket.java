package com.hand.testServerSocket;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.net.Socket;

public class ChatSocket extends Thread {
	
	Socket socket;
	
	public ChatSocket(Socket socket) {  //构造方法
		this.socket=socket;
		
	}
	
	public void out(String out) {
		try {
			//socket.getOutputStream().write(out.getBytes("UTF-8"));
			socket.getOutputStream().write((out+"\n").getBytes("UTF-8")); //换行
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("断开了一个客户端链接");
			ChatManager.getChatManager().remove(this);
			e.printStackTrace();
		}
		
		
	}
	
	public void run() {
		int count=0;
		out("你已经连接到本服务器了");
		try {
			BufferedReader br=new BufferedReader(
					new InputStreamReader(
							socket.getInputStream(),"UTF-8"));
			String line=null;
			while( (line=br.readLine())!=null ){
				System.out.println(line);
				ChatManager.getChatManager().publish(this, line);
			}
			br.close();
			
			System.out.println("断开了一个客户端链接");
			ChatManager.getChatManager().remove(this);
			
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("断开了一个客户端链接");
			ChatManager.getChatManager().remove(this);
			e.printStackTrace();
		}
		
	}

}
