package in.co.inout;

import java.util.SortedSet;
import java.util.TreeSet;

public class Set {
	public static void main(String[] args) {
		SortedSet s = new TreeSet();
		s.add("one");
		s.add("two");
		s.add("three");
		for (Object ele : s) {
			System.out.println(ele);
			System.out.println(s.first());
			System.out.println(s.last());

		}

	}

}
