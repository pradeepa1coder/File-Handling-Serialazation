package org.file_handling;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("./sample.txt");

		int no;
		while ((no = fr.read()) != -1) {
			System.out.print((char) no);
		}

	}
}
