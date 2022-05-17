package threads;

public class MainProgram {
// sequential
	public static void main(String[] args) {
		System.out.println("main entered");
		// reference/connection/pointer
		// to the ProgramA
		ProgramA pa = new ProgramA();
		pa.start(); // method call
		// upon control transfered
		// pause at this line
		// before the program is complete
		
		ProgramB pb = new ProgramB();
		pb.start();
		
		ProgramC pc = new ProgramC();
		pc.start();

		ProgramD pd = new ProgramD();
		pd.start();

		ProgramE pe = new ProgramE();
		pe.start();

		ProgramF pf = new ProgramF();
		pf.start();

		pe.setPriority(Thread.MAX_PRIORITY);
		
		System.out.println("Main exit");
	}

}
