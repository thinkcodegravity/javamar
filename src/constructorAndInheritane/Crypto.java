package constructorAndInheritane;
// grandparent - 3 incomplete method
// parent - 2 completed methods
// child - responsbility to fullfill
// 1 remaining incomplete method
public class Crypto extends AbstractPayment{
	public void payment() {
		System.out.println("Crypto payment processing");
	}
}
