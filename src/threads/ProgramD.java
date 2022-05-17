package threads;

import java.util.Date;

public class ProgramD extends Thread{
	public void run(  ) {
		System.out.println("Program D entered");
		long i=0;
		while(true) {
			i++;
			if(i%1000000000 ==0)
			//	System.out.println("program D counted a "+i);
			if(i==20000000000l)
				break;
		}
		System.out.println("Program D end:"+new Date());
	}
}
