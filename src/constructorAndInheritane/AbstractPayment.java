package constructorAndInheritane;
// abstract/partial incomplete program
public abstract class AbstractPayment implements IPayment{
	public void collectShippingAddress() {
		System.out.println("collecting shipping address");
	}
	public void collectContactInfo() {
		System.out.println("collecting contact info");
	}
	
}
