package org.file_serialazable;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerialzationEx {
	public static void main(String[] args) throws IOException {

		Bike b = new Bike();
		b.name = "splendor";
		b.cost = 10000;

		File f = new File("./bikedata.txt");
		if (!f.exists()) {
			f.createNewFile();
			System.out.println("bikedata file created succesfully");
		}
		FileOutputStream fos = new FileOutputStream(f);
		ObjectOutputStream oops = new ObjectOutputStream(fos);

		oops.writeObject(b);
		System.out.println("data converted&saved succefully");
		oops.close();
		fos.close();
	}
}

class Bike implements Serializable {

	String name;
	int cost;
	static int noofwheels = 2;
	transient int weight = 90;

}