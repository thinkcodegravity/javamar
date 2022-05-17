package threads;

import java.util.Date;

public class ProgramF extends Thread  {
	public void run(  ) {
		System.out.println("Program F entered");
		long i=0;
		while(true) {
			i++;
			if(i%1000000000 ==0)
			//	System.out.println("program C counted a "+i);
			if(i==2000000000l)
				break;
		}
		System.out.println("Program F end:"+new Date());
	}
}
