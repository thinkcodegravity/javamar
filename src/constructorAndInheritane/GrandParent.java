package constructorAndInheritane;

public class GrandParent {
	int k=20;
	int l=30;
	String address="ny";
	
	public void changeAddress() {
		address="ca";
	}
	
	public GrandParent() {
		System.out.println("constructing GrandParent");
	}
	public int div(int a, int b) {
		return a/b;
	}
}
