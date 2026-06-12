package com.gqt.javacodes.FileHandling;


import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client2 {
	public static void main(String[] args) throws IOException {
		Socket csoc = new Socket("192.168.0.171", 4000);
		OutputStream os = csoc.getOutputStream();
		DataOutputStream dos = new DataOutputStream(os);
		InputStream is=csoc.getInputStream();
		DataInputStream dis=new DataInputStream(is);
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<=5;i++) {
			
	    System.out.println("Enter the message from client:");
		String message = sc.nextLine();
		dos.writeUTF(message);
		System.out.println("===============================");
		String rec_message=dis.readUTF();
		System.out.println(rec_message);
		}
	}
}
