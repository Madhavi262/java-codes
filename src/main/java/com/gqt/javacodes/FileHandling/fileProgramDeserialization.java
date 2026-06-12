package com.gqt.javacodes.FileHandling;

import java.io.*;

class Cricketer2 implements Serializable {
	String name;
	String country;
	int runs;
	int wickets;
	int catches;

	public Cricketer2(String name, String country, int runs, int wickets, int catches) {
		super();
		this.name = name;
		this.country = country;
		this.runs = runs;
		this.wickets = wickets;
		this.catches = catches;
	}

	void display() {
		System.out.println(name);
		System.out.println(country);
		System.out.println(runs);
		System.out.println(wickets);
		System.out.println(catches);

	}
}

public class fileProgramDeserialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		String p1 = "C:\\File Handling\\Cricketer.txt";
		FileInputStream fis = new FileInputStream(p1);
		ObjectInputStream ois = new ObjectInputStream(fis);
		Cricketer2 c1 = (Cricketer2) ois.readObject();
		c1.display();

	}

}
