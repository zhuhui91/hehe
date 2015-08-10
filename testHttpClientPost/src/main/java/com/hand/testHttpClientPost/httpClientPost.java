package com.hand.testHttpClientPost;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

public class httpClientPost {

	public static void main(String[] args) {
		//http://fanyi.youdao.com/openapi.do
		//keyfrom=JKXY-lianxi&key=1155021050&type=data&doctype=<doctype>&version=welcome
       new ClientPost().start();
		
	}

}

class ClientPost extends Thread{
	
	HttpClient client=HttpClients.createDefault();
	
	public void run() {
		
		HttpPost post=new HttpPost("http://fanyi.youdao.com/openapi.do");
		try {
			
			//keyfrom=JKXY-lianxi&key=1155021050&type=data&doctype=xml&version=1.1&q=welcome
			
			List<BasicNameValuePair> parameters=new ArrayList<BasicNameValuePair>();
		    parameters.add(new BasicNameValuePair("keyfrom", "JKXY-lianxi"));
		    parameters.add(new BasicNameValuePair("key", "1155021050"));
		    parameters.add(new BasicNameValuePair("type", "data"));
		    parameters.add(new BasicNameValuePair("doctype", "xml"));
		    parameters.add(new BasicNameValuePair("version", "1.1"));
		    parameters.add(new BasicNameValuePair("q", "welcome"));
		    
		    
		    
			post.setEntity(new UrlEncodedFormEntity(parameters, "UTF-8"));
			HttpResponse response=client.execute(post);
			HttpEntity entity=response.getEntity();
			String line=EntityUtils.toString(entity, "UTF-8");
			
			System.out.println(line);
			
		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}	