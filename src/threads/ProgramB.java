package threads;

import java.util.Date;

public class ProgramB  extends Thread  {
	public void run() {
		System.out.println("Program B entered");
		long i=0;
		while(true) {
			i++;
			if(i%1000000000 ==0)
			//	System.out.println("program B counted a "+i);
			if(i==2000000000l)
				break;
		}
		System.out.println("program B ends:"+new Date());
	}
}
