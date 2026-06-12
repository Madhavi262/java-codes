package com.gqt.javacodes.FileHandling;

import java.io.IOException;
import java.io.File;

public class FileBuiltInclasses {

	public static void main(String[] args) throws IOException {
		String p1 = "C:\\File Handling\\File1.txt";
		File f1 = new File(p1);
		f1.createNewFile(); // creates the file specified in the path
		System.out.println(f1.exists());
		System.out.println(f1.canExecute());// checks if the file in the path can execute or not
		System.out.println(f1.canWrite()); // checks if the file is have the acces to write or not
		System.out.println(f1.canRead()); // checks if the file is have the read rights or not
		System.out.println(f1.getAbsoluteFile()); // display the file path
		System.out.println(f1.getCanonicalPath()); // display the file path
		System.out.println(f1.getFreeSpace());// display the space unallocated in the byte
		System.out.println(f1.getName()); // display the file name
		System.out.println(f1.getParent()); // display the root path
		System.out.println(f1.getPath()); // display the file path
		System.out.println(f1.getTotalSpace()); // display the space availanle in byetes
		System.out.println(f1.getUsableSpace()); // sipalay the usable space
		System.out.println(f1.hashCode()); // unique value for the file object
		System.out.println(f1.isAbsolute()); // checks if it an absolute path
		System.out.println(f1.isDirectory()); // checks if the path point to the directory
		System.out.println(f1.isFile()); // checks if the path points to the file
		System.out.println(f1.isHidden()); // check if the path points to hidden file
		File f2 = new File("C:\\File Handling\\hidden.txt");
		System.out.println(f1.isHidden());
		System.out.println(f1.lastModified()); // last modified value in terms of long
		System.out.println(f1.length()); // prints the total number of characters in the file
		File f3 = new File("C:\\File Handling\\File2.txt");
		System.out.println(f1.renameTo(f3));
		System.out.println(f1.exists());

	}

}
