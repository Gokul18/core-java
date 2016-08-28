package in.co.collection;

import java.util.ArrayList;

public class Testone {
	public static void main(String[] args) {
		ArrayList<String> I = new ArrayList<String>();
		I.add("one");
		I.add("two");
		//I.add(3);
		String str = I.get(2);
		System.out.println(str);
	}

}
