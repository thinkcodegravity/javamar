package constructorAndInheritane;

// implementing program
// Nissan and ICar has an 
// agreement/specification signed
// between both program

// Nissan program has taken responsibility
// to fullfill any missing logic
// 1) either declare yourself as incomplete
//		abstract
// 2) complete/implemnt logic for all methods
//		from ICar
// Nissan is INHERITING
// ICar's responsbility/missing code for methods
public class Nissan implements ICar, IMusic {
	public void start() {
		System.out.println("starting car");
	}
	public void stop() {
		System.out.println("stopping car");
	}
	public void drive() {
		System.out.println("driving car");
	}
	// override = reject parents method/logic
	// Override both parents
	public void playMusic() {
		ICar.super.playMusic();
		IMusic.super.playMusic();
	}	
	
}
