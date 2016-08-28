package in.co.thread;

public class HelloWithThread extends Thread{
	private String name = null;

	public HelloWithThread(String threadName) {
		name = threadName;
	}

	public void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println(i + "hello thread " + name);
		}
	}

}
