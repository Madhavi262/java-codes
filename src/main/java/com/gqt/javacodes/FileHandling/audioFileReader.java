package com.gqt.javacodes.FileHandling;

import java.io.IOException;
import java.io.FileReader;
import java.io.FileWriter;

public class audioFileReader {
	public static void main(String[] args) throws IOException {
		String p1 = "C:\\File Handling\\audio.ogg";
		String p2 = "C:\\File Handling\\audioFileReader.ogg";
		FileReader fr = new FileReader(p1);
		int temp;
		FileWriter fw = new FileWriter(p2);
		while ((temp = fr.read()) != -1) {
			fw.write(temp);
		}
		fw.close();
		fr.close();
	}
}
