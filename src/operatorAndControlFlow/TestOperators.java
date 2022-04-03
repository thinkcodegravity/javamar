package operatorAndControlFlow;

import methodCalls.ProgramA;

public class TestOperators {// class block
// blocks = defining limit/boundary of program or section of program
	
	public static void main(String[] args) {//method block
		// statements
		int a; // declaration
		int b=10; // initialization (primitive)
		b=30; // assignment
		ProgramA pa=new ProgramA(); // initialiation (object data type)
		pa.method1(); // method call
		
		{// local blocks
			{ // local nested blocks
				
			}
		}
	
		// assignment operator "="
		/*
		 = sign ( assignment ) operator rules
		 1) LHS and RHS data type should match
		 2) LHS should always be a variable
		 3) RHS can be literal value or matching data type variable
		 4) if RHS is a variable... RHS variable value is assigned
		  	to LHS variable
		 */
		int c=10; // variable = something that keep changing
		c=20;
		System.out.println( c );
		c=b;
		// c=30; // most recent value of variable b is 30
		System.out.println( c );
		
		// arithmetic operator
		// can be applied to only numbered data type
		int d=31;
		int e=10;
		System.out.println(  d + e  );// value of d added to value of e
		System.out.println(  d - e  );// value of e sub from value of d
		System.out.println(  d * e  );// value of e mul with value of d
		System.out.println(  d / e  );// value of d div with value of e
		System.out.println(  d % e  );// value of d div with value of e
		
		
		// equality and relational operator
		// recommendation : use it only for primitive data type
		// output of equality and relational operator is BOOLEAN
		int f=10;
		int g=10;
		System.out.println("equality operator");
		System.out.println(  f==g   );
		System.out.println(  f!=g   );
		int h=10;
		int i=15;
		System.out.println("relational operator");
		System.out.println( h > i );// h is greater than i
		System.out.println( h < i );// h is lesser than i
		int j=10;
		int k=10;
		System.out.println( j >= k );// Either j is greater or equal to k
		System.out.println( j <= k );// Either j is lesser or equal to k
		
		int l=5;// + + : + , + - : -, - + : -, - - : +
		System.out.println( +(-l) ); // minus of minus = plus
		
		
		int m=10;
		m++; // add 1 to m's value
		m++;
		m--; // sub 1 from m's value
		System.out.println( m );
		int n=10;
		// pre increment : increment first and then use it for printing
		System.out.println(  ++n  ); // n=11 and print 11
		// post increment : print first and then increment later
		System.out.println(  n++  ); // print 11... then n=12
		System.out.println(  n++  ); // print 12.. then n=13
		System.out.println(  ++n  ); // n=14.. then print 14
		System.out.println(  --n  ); // n=13... then print 13
		System.out.println(  n--  ); // print 13 then n=12
		
		boolean o=true;
		System.out.println( !o  );
		
		// conditional operator
		// LHS or RHS can be a boolean variable or operator that 
		// provides boolean output ( equality/ relational )
		int p=10;
		int q=20;
		boolean r=true;
		System.out.println(  (p<q) && r );// LHS resolves to true , RHS is true
		System.out.println(  (p>q) || r );
		
		System.out.println( 5 & 7);
		System.out.println( 5 | 7);
		System.out.println( 5 ^ 7);
		// complex expression
		System.out.println(1 * (2 + 3 )  > 5 && 4 / (3-1 ) == 2);
		System.out.println((1+2) * 5 - ( 4 -2) * 2 / 2 );
		
	}

}
// no code allowed after class block
//int a;
