package org.file_serialazable;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationEx {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream("./bikedata.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Bike b = (Bike) ois.readObject();
		System.out.println(b.name + " " + b.cost);
		System.out.println(Bike.noofwheels + " " + b.weight);

	}
}
