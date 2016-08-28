public class Hero {
	private int a;
	private int b;
	private int c;

	public Hero(int a, int b) {
		this.a = a;
		this.b = b;
		System.out.println("hi");
	}

	public Hero(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
		System.out.println("jaanu ji kaha");
	}

	public static void main(String[] args) {
		Hero h = new Hero(2, 4, 6);
		// System.out.println(h);

	}
}
