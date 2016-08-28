package in.co.inout;

public class Catch {
	public static void main(String[] args) {
		String name ="Vijay";
		try {
			System.out.println("length of name is" + name.length());
			System.out.println("charater at 7 position is" + name.charAt(6));
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("String abhi choti h");
		} catch (NullPointerException e) {
			System.out.println("sunder sa naam nahi hai");
		} finally {
			System.out.println("panshit hu me");

		}
	}

}
