package in.co.inout;

import java.io.File;

public class Three {
	public static void main(String[] args) {
		File directory = new File("D:/temp");
		// File directory =new File(args[0]);
		String[] list = directory.list();
		for (int i = 0; i < list.length; i++) {
			File f = new File("d:/temp", list[i]);
			if (f.isFile()) {
			}
			System.out.println((i + 1) + ":" + list[i]);
		}

	}
}
