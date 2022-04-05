package constructorAndInheritane;

public class Parent extends GrandParent {
	int x=10;
	int y=20;
	int w=30;
	public Parent() {
		super();
		System.out.println("constructing parent");
	}
	public int add(int a, int b) {
		return a+b;
	}
}
