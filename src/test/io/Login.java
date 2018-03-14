package test.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Login {
	public static void main(String[] args) {
		// create a file object
		File file = new File("/Eclipse");
		System.out.println();

	}

	public static void writeFile(File file) {
		FileWriter writer = null;
		BufferedWriter buffer = null;
		try {
			// use a File Writer
			writer = new FileWriter(file, true);
			buffer = new BufferedWriter(writer);
			buffer.write("\n data written from file.txt");
			buffer.write("\n data written from file.txt1");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException i) {
			i.printStackTrace();
		}finally{
			
		}
	}
}
