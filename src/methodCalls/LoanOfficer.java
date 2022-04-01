package methodCalls;

public class LoanOfficer {
	String name="jane";
	String title="loan officer";

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
