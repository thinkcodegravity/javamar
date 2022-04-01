package methodCalls;

public class BankCustomer {
	int salary=100000;
	String name="john";
	int creditScore=750;
	
	public void applyLoan(   ) {
		LoanOfficer loa=new LoanOfficer();
		// IN METHOD CALL = passing input AND reciving output
		// WE PASS BY VALUE
		boolean result=loa.processLoan(name,salary,creditScore,1000000,30); // method call
		//loa.processLoan("john",100000,750,1000000,30); // method call
		/*
		 PASSING INPUT RULES
		 1) number of inputs should match = 5
		 2) type should match = 4 numbered type and 1 char/string type
		 3) order should match
		 
		 HANDLING RESPONSE RULES
		 1) declare variable that has matching data type as the return type
		 
		 */
		
		System.out.println( loa.title ); // dot operator & refere vari to access outside program
		System.out.println(salary); // direct access within same program
		System.out.println(creditScore);
		
	}
}
