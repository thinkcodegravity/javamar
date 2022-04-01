package methodCalls;

public class TestMethodStack {

	public static void main(String[] args) {
		System.out.println("main");
		ProgramA pa=new ProgramA();
		pa.method1();
		System.out.println("main exit");
	}

}
