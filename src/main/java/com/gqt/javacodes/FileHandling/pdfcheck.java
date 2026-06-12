package com.gqt.javacodes.FileHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import java.io.*;

public class pdfcheck {
	public static void main(String[] args) throws IOException {

		String p1 = "C:\\File Handling\\madhavi_markscard.pdf";
		String p2 = "C:\\File Handling\\madhaviM.pdf";

		FileInputStream fis = new FileInputStream(p1);

		FileOutputStream fos = new FileOutputStream(p2);
		int temp;
		while ((temp = fis.read()) != -1) {
			fos.write(temp);
		}
		fos.close();
		fis.close();
	}
}