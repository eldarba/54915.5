package d.interfaces;

public class Bee extends Animal implements Flyer {

	@Override
	public void speak() {
		System.out.println("ZOOOMMM");

	}

	@Override
	public void fly() {
		System.out.println("fly like a bee");

	}

}
