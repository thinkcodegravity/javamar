package methodCalls;

public class ProgramA {
	public void method1() {
		System.out.println("1");
		ProgramB pb=new ProgramB();
		pb.method2();
		System.out.println("1 exit");
	}
}
