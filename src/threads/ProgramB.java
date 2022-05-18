package threads;

import java.util.Date;
//ProgramB does not inherited start() from Thread
public class ProgramB extends Stock implements Runnable{
	public void run() {
		System.out.println("Program B entered");
		long i=0;
		while(true) {
			i++;
			if(i%1000000000 ==0)
				System.out.println("program B counted a "+i);
			if(i==5000000000l)
				break;
		}
		System.out.println("program B ends:"+new Date());
	}
}
