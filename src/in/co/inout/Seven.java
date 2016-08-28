package in.co.inout;

import java.io.FileWriter;
import java.io.*;

public class Seven {
	public static void main(String[] args)throws Exception {
		FileWriter writer=new FileWriter("d:/temp/a.txt");
		PrintWriter printWriter=new PrintWriter(writer);
		for(int i=0;i<5;i++){
			printWriter.println(i+":line");
		}
		printWriter.close();
		writer.close();
		System.out.println("file is successfully written,PI checkd:/temp.txt");
		
		
		}
		
	}

