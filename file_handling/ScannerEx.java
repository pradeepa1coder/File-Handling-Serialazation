package org.file_handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerEx {
	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("./sample.txt");
		Scanner sc = new Scanner(file);

//		while (sc.hasNext()) {
//			System.out.println(sc.next());
//		}

		while (sc.hasNextLine()) {
			System.out.println(sc.nextLine());
		}
	}
}
