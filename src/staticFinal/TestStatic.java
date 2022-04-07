package staticFinal;

public class TestStatic {

	public static void main(String[] args) {
		ChaseBankAccount cust1=new ChaseBankAccount ("john",12345);			
		ChaseBankAccount cust2=new ChaseBankAccount ("jane",12346);
		
		cust1.name="andy";
		ChaseBankAccount.bankName ="JP Morgan & Chase";
		
		System.out.println(cust1.name);
		System.out.println(cust1.bankName);
		System.out.println(cust2.name);
		System.out.println(cust2.bankName);
		
	}

}
