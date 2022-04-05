package constructorAndInheritane;

public class Child extends Parent {
	int p=30;
	int q=40;
	// conflicting variable with parent
	int w=20;
	public Child() {
		super(); // if program extends
		System.out.println("constructing child");
		System.out.println("child taking its first step");
	}
	
	public int sub(int a, int b) {
		int w=10;
		System.out.println(w);// 10
		System.out.println(this.w);//20
		System.out.println(super.w);//30
		super.add(10, 20);
		add(10, 20);
		return a-b;
	}
	// conflicting method with parent
	public int add(int a, int b) {
		return a+b;
	}
}
