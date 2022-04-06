package accessAndPoly;

public class Car {
	// run-time polymorphism
	// overriding
	// same method name and same input
	// can occur in child and parent class
	public void drive() {
		System.out.println("basic driving");
	}
	
	// compile-time polymorphism
	// overloading
	// same method name different input
	// can occur in same class or child and parent
	public void turn(int i) {
		System.out.println("taking left turn");
	}
	public void turn(float f) {
		System.out.println("taking right turn");
	}
	
}
