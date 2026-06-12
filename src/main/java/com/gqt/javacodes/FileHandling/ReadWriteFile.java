//package File;
//
//import java.io.FileReader;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.util.Scanner;
//
//public class ReadWriteFile {
//
//	public static void main(String[] args) {
//    try {
//    	String p1="C:\\File Handling\\File1.txt";
//    	FileWriter fw=new FileWriter(p1);
//    	fw.write("Hello, Welcome to gqt");
//    	fw.close();
//    	System.out.println("Reading the data from the file:");
//    	FileReader fr=new FileReader(p1);
//    	Scanner sc= new Scanner(fr);
//    	while(sc.hasNext()) {
//    		String temp=sc.next();
//    		System.out.print(temp);
//    	}
//    	sc.close();
//    	fr.close();
//    }
//    catch(IOException e) {
//    	e.printStackTrace();
//    }
//	}
//
//}

package com.gqt.javacodes.FileHandling;

import java.io.File;
import java.io.IOException;

public class ReadWriteFile {

	public static void main(String[] args) {

		try {

			String p1 = "C:\\File Handling\\File1.txt";

			File file = new File(p1);

			if (file.exists()) {

				if (file.delete()) {
					System.out.println("File deleted successfully.");
				} else {
					System.out.println("Unable to delete the file.");
				}

			} else {
				System.out.println("File does not exist.");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
