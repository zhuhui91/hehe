package com.hand.testHttpClient;

import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class testClientGet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        new ClientGet().start();
	}

}

class ClientGet extends Thread{
	
	HttpClient client=HttpClients.createDefault();
	
	public void run() {
		
		HttpGet get=new HttpGet("http://www.baidu.com");
		try {
			
			HttpResponse response=client.execute(get);
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
