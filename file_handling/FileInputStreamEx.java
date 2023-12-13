package org.file_handling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamEx {
	public static void main(String[] args) throws IOException {

		File file = new File("./sample.txt");
//		if (file.exists()) {
//			System.out.println("file is aready exists,I'm deleting ");
//			file.delete();
//
//		} else {
//			System.out.println("yeah created a new file,with name : " + file);
//			file.createNewFile();
//		}

		// Now we can read from that file if anything is available
		FileInputStream fis = new FileInputStream(file);
		int no;
		while ((no = fis.read()) != -1) {
			System.out.print((char) no);
		}

		fis.close();

	}
}
