package in.constractor;

import java.util.Date;

public class Persion {
	private String name = null;
	private String address = null;
	private Date dateOfBirth = null;

	public Persion() {
		System.out.println("1st");
	}

	public Persion(String name, String address) {
		this.name = name;
		this.address = address;
		System.out.println("2nd");
	}

	public Persion(String n, String a, Date d) {
		name = n;
		address = a;
		dateOfBirth = d;
		System.out.println("3rd");
	}

	public static void main(String[] args) {
		Persion p = new Persion("g","h");
	}
}
