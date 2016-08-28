package in.co.clone;

public class Customer implements Cloneable {
	int custId;
	String name;
	Account acc;

	public static void main(String[] args) throws Exception{
		/*Customer c1 = new Customer();
		Customer c2 = c1;//copy only the referenc of object
*/	
	/*Customer c1=new Customer();
	Customer c3=(Customer)c1.clone();*///shallow cloning
	}
}
