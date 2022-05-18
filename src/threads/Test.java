package threads;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("hi");
		
		// timed waiting
		// 1000 milli sec = 1 second
		Thread.currentThread().sleep(10000);
		
		System.out.println("bye");

	}

}
