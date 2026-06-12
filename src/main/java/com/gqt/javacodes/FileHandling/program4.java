package com.gqt.javacodes.FileHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import java.io.*;

class program4 {
	public static void main(String[] args) throws IOException {

		String p1 = "C:\\File Handling\\Input4.txt";
		String p2 = "C:\\File Handling\\Output4.txt";

		FileInputStream fis = new FileInputStream(p1);
		BufferedInputStream bis = new BufferedInputStream(fis);

		FileOutputStream fos = new FileOutputStream(p2);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		int temp;
		while ((temp = bis.read()) != -1) {
			bos.write(temp);
		}
		bis.close();
		bos.close();
		fos.close();
		fis.close();
	}
}