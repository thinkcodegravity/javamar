package constructorAndInheritane;

// abstract = incomplete
public abstract interface ICar {
	// variable hold information
	// values are UNCHANGEABLE/ FINAL
	int a=10;
	
	// methods take action on information
	// capable to change information
	public void start();
	public void stop();
	public void drive();
	default void playMusic() {
		System.out.println("basic music");
	}	
	
}
/*
Abstraction - hiding internal details
from end users
*/