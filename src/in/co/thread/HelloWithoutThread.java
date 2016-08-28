package in.co.thread;

public class HelloWithoutThread {
	String name = null;

	public HelloWithoutThread(String threadName) {
		name = threadName;
	}

	public void run() {
		for (int i = 0; i < 20; i++) {
			System.out.println(i + "hellothread" + name);
		}
	}
}
