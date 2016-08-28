package in.co.comparator;

import java.util.Comparator;

public class ShortByName implements Comparator<Customer> {
	public int compare(Customer c1, Customer c2) {
		return c1.name.compareTo(c2.name);
	}

}
