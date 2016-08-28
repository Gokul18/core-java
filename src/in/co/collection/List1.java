package in.co.collection;
import java.util.ArrayList;

public class List1 {
	public static void main(String[] args) {
		ArrayList names = new ArrayList();
		for (int i = 0; i < 10; i++) {
			names.add("no#" + i);
		}
		System.out.println("names=" + names.size());
		Object o = names.get(0);
		String name = (String) o;
		System.out.println("first name is " + name);

	}
}
