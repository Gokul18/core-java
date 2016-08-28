package in.co.thread;

public class Mainthread {
	public static void main(String[] args) {
		HelloWithoutThread t1 = new HelloWithoutThread("tdhoni");
		HelloWithoutThread t2 = new HelloWithoutThread("yuvraj");
		t1.run();
		t2.run();

	}

}
