package com.gqt.javacodes.FileHandling;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class program3 {

	public static void main(String[] args) throws IOException {
		String p1 = "C:\\File Handling\\Input3.txt";
		String p2 = "C:\\File Handling\\Output3 .txt";
		FileReader fr = new FileReader(p1);
		BufferedReader br = new BufferedReader(fr);
		int temp;
		FileWriter fw = new FileWriter(p2);
		BufferedWriter bw = new BufferedWriter(fw);

		while ((temp = br.read()) != -1) {
			bw.write(temp);
		}
		bw.close();
		br.close();
		fw.close();
		fr.close();
	}
}
