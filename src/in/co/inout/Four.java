package in.co.inout;

import java.io.File;

public class Four {
	public static void main(String[] args) {
		File directory = new File("E:/song's/bhojpuri/video");
		File[] list = directory.listFiles();
		for (int i = 0; i < list.length; i++) {
			if (list[i].isFile()) {
				System.out.println((i + 1) + ":" + list[i].getName());
			}
		}

	}
}
