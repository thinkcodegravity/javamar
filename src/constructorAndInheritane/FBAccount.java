package constructorAndInheritane;

public class FBAccount {
	String name = "john";
	int age = 25;
	String school = "A B C School";

	public FBAccount(String n, int a, String s) {
		name=n;
		age=a;
		school=s;
	}
	public FBAccount(String n, int a) {
		name=n;
		age=a;
	}
	public FBAccount(String n) {
		name=n;
	}
	public int add(int a, int b,String c) {
		return 1;
	}
}
