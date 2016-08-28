package in.co.collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayT {
	public static void main(String[] args) {
		ArrayList l = new ArrayList();
		l.add("zero");
		l.add("one");
		l.add("two");
		l.add("three");
		l.add("five");
		l.add(4, "four");
		//l.set(3, "ten");
		//l.remove(2);
		//System.out.println(l.indexOf("three"));
		//String val = (String) l.get(1);
		//System.out.println("1 index value is:" + val);
		//for (Object ele : l) {
			//String str = (String) ele;
			//System.out.print(str+"\t");
		//}
		Collections.sort(l);
		System.out.println(l);
		ArrayList subList = new ArrayList(l.subList(1,4));
		System.out.println(subList);
		Object [] nums=l.toArray();

	}

}