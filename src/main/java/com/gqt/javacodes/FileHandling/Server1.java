package com.gqt.javacodes.FileHandling;

import java.io.DataInputStream;

import java.io.IOException;
import java.io.InputStream;

import java.net.ServerSocket;
import java.net.Socket;

public class Server1 {
	public static void main(String[] args) throws IOException {
		ServerSocket listener = new ServerSocket(4000);
		System.out.println("Enter the response");
		java.net.Socket csoc = listener.accept();
		InputStream is = csoc.getInputStream();
		DataInputStream dis = new DataInputStream(is);
		String message = dis.readUTF();
		System.out.println(message);
	}
}