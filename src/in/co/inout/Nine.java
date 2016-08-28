package in.co.inout;

import java.io.*;

public class Nine {
	public static void main(String[] args) throws Exception {
		String source = "d:/temp/'(366)";
		String target = "d:/temp/baby.jpg";
		FileInputStream reader = new FileInputStream(source);
		FileOutputStream writer = new FileOutputStream(target);
		int ch = reader.read();
		while (ch != -1) {
			writer.write(ch);
			ch = reader.read();
		}
		writer.close();
		reader.close();
		System.out.println(source + "is copied to" + target);

	}
}
