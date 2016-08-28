package in.co.inout;

import java.io.FileReader;

public class Five {
	public static void main(String[] args) throws Exception {
		FileReader reader = new FileReader("d:/temp/a.txt");
		int ch = reader.read();
		char chr;
		while (ch != -1) {
			chr = (char) ch;
			System.out.print(chr);
			ch = reader.read();
		}
	}

}
