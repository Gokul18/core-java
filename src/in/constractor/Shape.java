package in.constractor;

public class Shape {
	protected String color = null;
	protected int borderWidth = 0;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getBorderWidth() {
		return borderWidth;
	}

	public void setBorderWidth(int borderWidth) {
		this.borderWidth = borderWidth;
	}

	// default constructor
	public Shape() {
		System.out.println("iam 1st");
	}

	// parametarise constructor
	public Shape(String color, int borderWidth) {
		this.color = color;
		this.borderWidth = borderWidth;
		System.out.println("iam 2nd");
	}

	public static void main(String[] args) {
		Shape s = new Shape();// call default constructor
		Shape s1 = new Shape("red", 5);// call parametarise constructor

		System.out.println(s1.getColor());
	}
}
