package com.hand.testServerSocket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JOptionPane;

public class ServerListener extends Thread {

	public void run(){

		//port:1-65535
		try {
			ServerSocket serverSocket=new ServerSocket(12345);
			while(true){
				//block s阻塞 
				Socket socket= serverSocket.accept();
				//建立链接
				JOptionPane.showMessageDialog(null, "有客户端链接到了本机12345端口");
				//将socket传递给新的线程
           //     new ChatSocket(socket).start(); //匿名对象调用,在此处不可取
               ChatSocket cs=new ChatSocket(socket);
               cs.start();
               ChatManager.getChatManager().add(cs);

			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
