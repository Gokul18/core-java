package in.co.inout;

import java.io.File;

public class Two {
	public static void main(String[] args) {
		File directory = new File("E:/song's/bhojpuri/video");
		// File directory =new File(args[0]);
		String[] list = directory.list();
		for (int i = 0; i < list.length; i++) {
			System.out.println((i + 1) + ":" + list[i]);
		}
	}

}
