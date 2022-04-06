package accessAndPoly.samePack;

public class Parent {
	public 		int a=1; // ANYONE can access this variable
		   		int b=2; // PACKAGE level access
	protected 	int c=3; // PACKAGE level OR ANY RELATED program in other package
	private 	int d=4; // NO ONE outside current program
	
	public Parent() {
		
	}
	
	protected void test() {
		
	}
}
