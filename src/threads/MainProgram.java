package threads;

public class MainProgram {
// sequential
	public static void main(String[] args) throws InterruptedException {
		System.out.println("main entered");
		// reference/connection/pointer
		// to the ProgramA
// 1) New Stage in thread life cycle		
		ProgramA pa = new ProgramA();
		// start() = instruction
		// to run ProgramA code parallely
// 2) 		
		pa.start(); // method call
		// CPU time will be higher for programA
		//pa.setPriority(Thread.MAX_PRIORITY);
		// upon control transfered
		// pause at this line
		// before the program is complete
		
		ProgramB pb = new ProgramB();
		Thread t=new Thread(pb);
		t.start();
		
		// timed waiting
		// main program will wait
		// for programA to complete
		// however if it does not complete
		// in 5 seconds .. i will resume
		pa.join( 5000 );
		// pa.join(); indefinite waiting
		System.out.println("Main exit");
		pa.stop();
		//t.setPriority(Thread.MIN_PRIORITY);
		/*
		ProgramC pc = new ProgramC();
		pc.start();

		ProgramD pd = new ProgramD();
		pd.start();

		ProgramE pe = new ProgramE();
		pe.start();

		ProgramF pf = new ProgramF();
		pf.start();

		pe.setPriority(Thread.MAX_PRIORITY);
		*/
		
	}

}
