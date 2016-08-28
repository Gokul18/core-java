package in.co.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Test2 {
	public static void main(String[] args) {
		ArrayList collection = new ArrayList();
		collection.add(1);
		collection.add(2);
		collection.add(11);
		collection.add(33);

		Iterator itr = collection.iterator();

		while (itr.hasNext()) {
			Object v = itr.next();
			System.out.println(v);
		}
		if (itr.equals(11))
			itr.remove();
		System.out.println("All Element are removed");
	}
}