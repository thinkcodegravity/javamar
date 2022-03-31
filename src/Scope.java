
public class Scope {
	// global variable
	int age=20; // instance variable
	static int grade=2; // class/static  variable
	
	public void test() {
		int age=30;
		// conflict between global and local
		// local wins
		System.out.println(age);// print 30
		System.out.println(this.age);// print 20
		int a=30; // OK = similar variables in different methods
		int p=20;
	}
	// local variable
	// a, b = parametric/input  variable
	public int add(int a, int b) { // method block, 
		System.out.println(a);
		//System.out.println(x);
		System.out.println(age);
		// nested block
		//int a=10;// NO - parameteric and local variable in same method
		int p=10;
		{ // local block
			int q=20;
			{System.out.println( p );
				int r=30;
				{
					int s=40;
					// local variable cannot be RE-declare within scope/range
					// NO = int r=20;
					System.out.println(p );
				}
			}
			int r=20;
		}
		System.out.println(p );
		// p lifecycle begins from the line it was declared
		// 1) which block it belongs to
		// identify immediate opening curly bracket before the declaraiton line
		// 2) where does the block end
		// p lifecycle ends on the closing curly bracket of its block
		int sum=0; // short term memory
		sum=a+b; // local variable
		System.out.println(a);
		return sum;
	}
	
	public int sub(int x, int y) {
		//System.out.println(p);
		System.out.println(x);
		System.out.println(age);
		int su=0; // short term memory
		su=x-y; // local variable
		System.out.println(x);
		return su;
	}
	
	 
}
