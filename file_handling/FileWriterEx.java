package org.file_handling;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {
	public static void main(String[] args) throws IOException {

		FileWriter fw = new FileWriter("./out.txt");
		String str = "CHANDU In the heart of the bustling city, hidden amidst the skyscrapers and crowded streets, there lies a quaint little bookstore. Its shelves are lined with a treasure trove of books, each whispering tales of adventure, romance, and mystery. The scent of aged paper and ink permeates the air, creating a nostalgic ambiance that transports visitors to another world. The creaking wooden floors tell stories of countless footsteps that have tread upon them, each leaving behind a trace of curiosity and wonder. As sunlight filters through the dusty windows, illuminating the literary treasures within, time seems to stand still in this oasis of knowledge and imagination";

		fw.write(str);
		fw.flush();
	}
}
