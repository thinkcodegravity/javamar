package threads;

import java.util.Date;
// ProgramA inherited start() from Parent Thread
public class ProgramA extends Thread {
	public void run(  ) {
		System.out.println("Program A entered");
		long i=0;
		while(true) {
			i++;
			if(i%1000000000 ==0)
				System.out.println("program A counted a "+i);
			if(i==5000000000l)
				break;
		}
		System.out.println("program A ends :"+new Date());
	}
}
