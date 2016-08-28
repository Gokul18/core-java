package in.co.inout;

import java.io.File;

public class One {
	public static void main(String[] args) {
		File f = new File("d:/temp/a.txt");
		// File f=new File("D:/temp" , "a.txt");
		if (f.exists()) {
			System.out.println("name" + f.getName());
			System.out.println("absolute path:" + f.getAbsolutePath());
			System.out.println("is writable" + f.canWrite());
			System.out.println("is readable" + f.canRead());
			System.out.println("is file" + f.isFile());
			System.out.println("is directory" + f.isDirectory());
			System.out.println("length" + f.length() + "bytes long");
		}
	}

}
