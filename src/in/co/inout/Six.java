package in.co.inout;

import java.io.BufferedReader;
import java.io.FileReader;

public class Six {
	public static void main(String[] args) throws Exception {
		FileReader reader = new FileReader("d:/temp/a.txt");
		BufferedReader bufferedReader = new BufferedReader(reader);
		String line = bufferedReader.readLine();
		while (line != null) {
			System.out.println(line);
			line = bufferedReader.readLine();
		}
		reader.close();

	}

}
