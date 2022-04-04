package operatorAndControlFlow;

import java.util.Scanner;

public class TestControlFlow {

	public static void main(String[] args) {
		int balance=10;
		int withdrawAmount=20;
		boolean c=true;
		// if condition
		// 1) boolean variable or any operator that provides u boolean output
		// relational , conditional , equality
		/*
		 	2) only if is allowed
		 	3) else cannot exist without if
		 	4) else key word should follow immediately after if block
		 		no code between if block and else key word
		 	5) if condition should not end with semicolon unless rquired to take no action
		 	6) 
		 */
		if( balance >= withdrawAmount) {
			System.out.println("successfull withdraw");
			balance=balance-withdrawAmount;
			System.out.println("latest balance is :"+balance);
			// balance=100-20;
			// balance=80;
			// = sign.. RHS is processed first
			// RHS substitue all variable names to its value
			// balance(100) deduct withdraw(20)
			// RHS changes into 80
		}
		else {
			System.out.println("insufficient fund");
		}
		
		int d=10;
		int e=20;
		
		if(d > e){
			System.out.println("d is greater than e");
		}
		
		int option=2;
		if(option == 1) {
			System.out.println("withdraw selected");
			// withdraw code written here
		}
		else if(option == 2) {
			System.out.println("depoit selected");
		}
		else if(option == 3) {
			System.out.println("check balance selected");
		}
		else { // default block
			System.out.println("unknown options please try again with proper input");
		}
		
		System.out.println("bye bye");
		
		for ( int i=0; i<3 ; i ++){
			System.out.println("hi");
		}

		for ( int i=0; i<4 ; i++){
			System.out.println("begin");
			if (i==2)
				break;
			System.out.println("end");
		}
		
		Scanner sc=new Scanner(System.in);
		System.out.println("add to cart , enter true or false");
		boolean choice=sc.nextBoolean();
		// sc.nextBoolean(); = will wait for customer to enter boolean value
		// boolean choice = customer typed boolean value on screen
		//					is stored in choice variable
		// 0 or more tran... since condition check comes first
		while(choice) {
			System.out.println("inside while loop");
			System.out.println("another item add to cart? enter true or false");
			choice=sc.nextBoolean();
		}
		
		// 1 or more loop transaction.. since condtion check comes after
		do{
			System.out.println("inside do while loop");
			System.out.println("processing bank transaction");
			System.out.println("another bank transaction? enter true or false");
			choice=sc.nextBoolean();
		}while(choice) ;
		
		int sw=2;
		switch(sw) {
			case 1:
				System.out.println("inside 1 case");
				break;
			case 2:
				System.out.println("inside 2 case");
				break;
			case 3:
				System.out.println("inside 3 case");
				break;
			case 4:
				System.out.println("inside 4 case");
				break;
			default:
				System.out.println("default case");
				break;
				
		}
		System.out.println("control flow end");
	}

}
