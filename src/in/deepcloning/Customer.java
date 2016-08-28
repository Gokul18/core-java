package in.deepcloning;

public class Customer implements Cloneable {
	Account acc;

	public Object clone() throws CloneNotSupportedException {
		Customer obj = (Customer) super.clone();
		obj.acc = (Account) acc.clone();
		return obj;
	}

	public static void main(String[] args) throws Exception {
		Customer c1 = new Customer();
		Customer c3 = (Customer) c1.clone();// calls the override clone method.
	}

}
