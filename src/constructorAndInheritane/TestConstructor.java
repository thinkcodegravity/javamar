package constructorAndInheritane;

public class TestConstructor {

	public static void main(String[] args) {
		FBAccount customer1=new FBAccount( "jane" ,26); // constructor call
		FBAccount customer2=new FBAccount("mike");
		FBAccount customer3=new FBAccount("andy",21,"qqq school");
		System.out.println( customer1.name);
		System.out.println( customer2.name);
		System.out.println( customer3.name);
		System.out.println( customer1.age);
		System.out.println( customer2.age);
		System.out.println( customer3.age);
		
	}

}
