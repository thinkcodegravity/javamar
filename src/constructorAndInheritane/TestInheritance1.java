package constructorAndInheritane;

public class TestInheritance1 {

	public static void main(String[] args) {
		Child c=new Child();
		c.add(10, 20);
		c.sub(10, 20);
		c.div(10, 20);
		System.out.println( c.x );
		System.out.println( c.y );
		System.out.println( c.k );
		System.out.println( c.l );
		System.out.println( c.p );
		System.out.println( c.q );
		
		
		
		
		Parent p=new Parent();
		p.add(10, 20);
		System.out.println( p.x );
		System.out.println( p.y );
		
		
		
	}

}
