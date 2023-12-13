package org.file_handling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferdReaderEx {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("./out.txt");
		BufferedReader br = new BufferedReader(fr);
//		int no;
//		while ((no = br.read()) != -1) {
//			System.out.println((char) no);
//
//		}

		String str;
		while ((str = br.readLine()) != null) {
			System.out.println(str);

		}
	}
}
