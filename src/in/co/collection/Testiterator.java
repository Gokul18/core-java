package in.co.collection;

import java.util.*;

public class Testiterator {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add("raju");
		c.add("ajay");
		c.add("vijay");
		c.add("ramu");
		Iterator it = c.iterator();
		// while (it.hasNext()) {
		// Object o = it.next();
		// System.out.println(o);
		if (it.hasNext()) {
			it.remove();

		}

	}

}
