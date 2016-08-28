package in.co.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Test {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add("raju");
		Iterator it = c.iterator();
		if (it.hasNext()) {
			Object o = it.next();
			System.out.println(o);
		}
	}

}
