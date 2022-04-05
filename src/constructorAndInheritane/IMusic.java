package constructorAndInheritane;

public interface IMusic {
	default void playMusic() {
		System.out.println("beats music");
	}
}
