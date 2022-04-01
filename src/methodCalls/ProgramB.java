package methodCalls;

public class ProgramB {
	public void method2() {
		System.out.println("2");
		ProgramC pc=new ProgramC();
		pc.method3();
		System.out.println("2 exit");
	}
}
