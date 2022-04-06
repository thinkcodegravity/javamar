package constructorAndInheritane;

public class TestInheritance2 {

	public static void main(String[] args) {
		// abstract prpgram cannot be
		// initialized with "new"
		/*
		 	1) LHS and RHS same inheritance chain
			2) RHS has to be concrete program
			3) RHS should be child of LHS
		 */
		
		IPayment ip=new CreditCard();
		// methods accessible 
		// restricted to LHS data type
		ip.collectContactInfo();
		ip.collectShippingAddress();
		ip.payment();
		// typecasting unlocks hidden feature
		((CreditCard)ip).ccFeature(); // hidden feature
	}

}
