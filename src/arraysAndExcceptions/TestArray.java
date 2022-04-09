package arraysAndExcceptions;

public class TestArray {

	public static void main(String[] args) {
		
		// [] = group of primitive or object data types
		// [5] = group contains 5 values of data type
		
		// group of primitive data type (int)
		// array declaration
		// size of array fixed
		int [] numbers=new int[5];
		System.out.println( numbers[4] );// prints 0
		
		// group of object data type (FacebookCustomer)
		FacebookCustomer[] allCustomers=new FacebookCustomer[1000000];
		System.out.println( allCustomers[0] ); // prints null
		allCustomers[0]=new FacebookCustomer();
		System.out.println( allCustomers[0] ); // print [0] address
		System.out.println( allCustomers[1] ); // print null
		
		
		allCustomers[1]=new FacebookCustomer();
		allCustomers[2]=new FacebookCustomer();
		allCustomers[3]=new FacebookCustomer();
		allCustomers[4]=new FacebookCustomer();
		allCustomers[5]=new FacebookCustomer();
		
		// allCustomers[0],allCustomers[2],allCustomers[4]
		
		for(int i=1;i<7;i=i+2) {
			if(i==3 || i==4)
				continue;
			else if (i==2)
				break;
			else
				allCustomers[i]=new FacebookCustomer();
		}
		
		for(FacebookCustomer fb: allCustomers)
			fb=new FacebookCustomer();
		// 1 loop... it will copy allCustomers[0] into fb variable
		// 2 loop... it will copy allCustomers[1] into fb variable
		// 3 loop... it will copy allCustomers[2] into fb variable
		// 4 loop... it will copy allCustomers[3] into fb variable
		// 5 loop... it will copy allCustomers[4] into fb variable
		
		
		
		FacebookCustomer[][] mulDimFB=new FacebookCustomer[3][2];
		for(int i=0;i<mulDimFB.length;i++)
			for(int j=0;j<mulDimFB[i].length;j++)
				mulDimFB[i][j]=new FacebookCustomer();
		
		
		// num1 has 4 size
		// predefine size...  assign values later
		int [] num1=new int[4];
		num1[0]=123;
		num1[1]=124;
		num1[2]=125;
		num1[3]=126;
		System.out.println( num1[2]);
		
		// num2 has 4 size
		// if u have values but dont know the size
		int[] num2= {123,124,125,126};
		System.out.println( num2[1]   );
		
		
		int[] num3= {12,33,56,11,18};
		int[] num4=new int[3];
		System.arraycopy(num3, 1, num4, 0, 2);
	
		for(int i=0;i<num3.length;i++)
			System.out.println( num3[i] );
		
		// enhanced for loop.... for-each
		for(int x: num3)
			System.out.println(x);
		
	}

}
