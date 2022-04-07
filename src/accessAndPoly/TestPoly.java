package accessAndPoly;

import java.util.Scanner;

public class TestPoly {

	public static void main(String[] args) {
		System.out.println("press 1 for basic car,2 for ferrari, 3 for nissan, 4 for toyota");
		Scanner sc=new Scanner(System.in);
		int option=sc.nextInt();
		if(option==1) {
			Car c=new Car();
			testdrive(c);
		}
		else if(option==2) {
			Ferrari f=new Ferrari();
			testdrive(f); // Ferrari is same inheritnace chain as Car, 
					// Ferrari is child of Car
		}
		else if(option==3) {
			Nissan n=new Nissan ();
			testdrive(n);
		}
		else if(option==4) {
			Toyota t=new Toyota ();
			testdrive(t);
		}
	}
	public static void testdrive(Car c) {
		if(c instanceof Nissan)
			System.out.println("nissan variabel is passed");
		if(c instanceof Ferrari)
			System.out.println("Ferrari variabel is passed");
		c.drive();
	}
}
