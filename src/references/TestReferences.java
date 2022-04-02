package references;

public class TestReferences {

	public static void main(String[] args) {
		
		// primitive/simple data
		int a=10;
		
// class 	 	v/s object
// blue print 	=  	digital instance of things
// design paper	=  	real instance of things

		// object/complex data
		Product p1=new Product();		
		p1.name="iphone";		
		p1.quantity=5;		
		Product p2=new Product();		
		p2.name="samsung";		
		p2.quantity=p1.quantity;		
		p1=p2;		
		p2=new Product();		
		p1.quantity=p2.quantity;		

		
		System.out.println(p1.name);
		System.out.println(p2.name);
		System.out.println(p1.quantity);
		System.out.println(p2.quantity);
		
	}

}
