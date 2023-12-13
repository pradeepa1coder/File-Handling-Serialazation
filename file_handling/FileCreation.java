package org.file_handling;

import java.io.File;
import java.io.IOException;

public class FileCreation {
	public static void main(String[] args) throws IOException {

		File file = new File("./sample.txt");
		if (!file.exists()) {
			file.createNewFile();
			System.out.println("file is created");

		} else {
			System.out.println("file is already exists");
		}
	}
}
