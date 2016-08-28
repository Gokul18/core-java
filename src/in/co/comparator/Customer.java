package in.co.comparator;

import java.util.Comparator;

public class Customer implements Comparable<Customer> {
	String name;
	String LastName;

	public Customer(String name, String LastName) {
		this.name = name;
		this.LastName = LastName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	@Override
	public int compareTo(Customer c) {
		return this.name.compareTo(c.name);
	}

}
