package arraysAndExcceptions;

import java.io.File;
import java.io.IOException;

public class TestExce {
	public void method1() throws IOException {
		System.out.println(1);
		method2();
	}

	public void method2() throws IOException {
		System.out.println(2);
		method3();
	}

	public void method3() throws IOException {
		System.out.println(3);
		File f=new File("S:/test.txt");
		f.createNewFile();
		
	}
}
