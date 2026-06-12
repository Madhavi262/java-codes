package com.gqt.javacodes.FileHandling;

//import java.beans.Transient;
import java.io.*;

class Cricketer1 implements Serializable {
	String name;
	String country;
	transient int runs;
	int wickets;
	transient int catches;

	public Cricketer1(String name, String country, int runs, int wickets, int catches) {
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

public class SelectiveSerialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// Serialization
//		Cricketer1 k2=new Cricketer1("Rohit","IND",19000,20,300);
//		k2.display();
//		FileOutputStream fos=new FileOutputStream("C:\\File Handling\\Cricketer1.txt");
//		ObjectOutputStream oos=new ObjectOutputStream(fos);
//		oos.writeObject(k2);

		// deserialization
		String p1 = "C:\\File Handling\\Cricketer1.txt";
		FileInputStream fis = new FileInputStream(p1);
		ObjectInputStream ois = new ObjectInputStream(fis);
		Cricketer1 c1 = (Cricketer1) ois.readObject();
		c1.display();

	}

}