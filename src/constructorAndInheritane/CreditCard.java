package constructorAndInheritane;
// concrete/Complete program
public class CreditCard extends AbstractPayment{
	public void payment() {
		System.out.println("credit card payment processing");
	}
	public void ccFeature() {
		System.out.println("credit card feature");
	}
}
