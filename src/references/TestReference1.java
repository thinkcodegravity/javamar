package references;

public class TestReference1 {

	public static void main(String[] args) {
		ShoppingCenter sc=new ShoppingCenter();
		Product p=new Product();
		int x=20;
		System.out.println(p.name);
		System.out.println(p.quantity);
		System.out.println(x);
	
		
		sc.method1(p, x);
	
		System.out.println(p.name);
		System.out.println(p.quantity);
		System.out.println(x);
		
	}

}
