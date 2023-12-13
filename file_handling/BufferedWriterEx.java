package org.file_handling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterEx {
	public static void main(String[] args) throws IOException {
		File f = new File("./out.txt");
		String str = "pradeep yadavgnp";

		BufferedWriter w = new BufferedWriter(new FileWriter(f));
		w.write(str);
		w.flush();
		w.close();

	}
}
