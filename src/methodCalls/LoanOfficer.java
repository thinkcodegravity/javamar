package methodCalls;

public class LoanOfficer {
	String name="jane";
	String title="loan officer";
	
	// default constructor
	// only provided if no construct exists
	// take 0 parameter and does nothing
	public LoanOfficer() {
		
	}
	
	public boolean processLoan(String customerName, int sal , 
		int cs, int loanAmount, int years) {
		System.out.println(customerName);
		System.out.println(sal);
		System.out.println(cs);
		System.out.println(loanAmount);
		System.out.println(years);
		return true;
	}
}
