package staticFinal;

public class ChaseBankAccount {
	static String bankName="Chase";	
	String name;	
	int accountNumber;	
// if method uses non-static member
//	(non-static variable/method call)
// method has to be non-static
	
	public static void method1() {
		// no access to non-static
		// bankName is not Non-static
		System.out.println(bankName);
	}
	public void method2() {
		// access non-static variable
		System.out.println(name);
	}
	public void method3() {
		// access non-static method
		method2();
	}
	public static void method4() {
		// no access to non-static
		// method1 is not Non-static
		method1();
	}
	public static void method5() {
		// no access to non-static
		System.out.println("hi");
	}
	
	
	
	public ChaseBankAccount(String n,int a) {	
		name=n;
		accountNumber=a;
	}	
}
