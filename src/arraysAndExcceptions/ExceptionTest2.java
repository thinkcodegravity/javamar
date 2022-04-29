package arraysAndExcceptions;

import java.io.IOException;

public class ExceptionTest2 {

	public static void main(String[] args) {
		System.out.println("main");
		TestExce te=new TestExce();
		try {
			te.method1();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("main end");
		
	}

}
