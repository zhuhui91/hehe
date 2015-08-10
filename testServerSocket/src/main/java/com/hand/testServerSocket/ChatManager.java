package com.hand.testServerSocket;

import java.util.Vector;

public class ChatManager {

	//类的单例化
	private ChatManager(){} //构造方法
	private static final ChatManager cm=new ChatManager();
	public static ChatManager getChatManager() { //static方法z=只能调用static方法和变量
		return cm;
		
	}
		
	Vector<ChatSocket> vector=new Vector<ChatSocket>();
	
	public void add(ChatSocket cs) {
		vector.add(cs);
	}
	
	public void remove(ChatSocket cs) {
		vector.remove(cs);
	}

	
	//发送消息
    public void publish(ChatSocket cs,String out) {
    	for (int i = 0; i <vector.size(); i++) {
    		ChatSocket csChatSocket=vector.get(i);
    		if(!cs.equals(csChatSocket)){
    			csChatSocket.out(out);
    			
    		}
			
		}
		
	}
    
}
