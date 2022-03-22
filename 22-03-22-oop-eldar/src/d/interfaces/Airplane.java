package d.interfaces;

public class Airplane extends Vehicle implements Flyer, Navigator {

	@Override
	public void drive() {
		System.out.println("drive like an airplane");

	}

	@Override
	public void navigate() {
		System.out.println("navigate like an airplane");

	}

	@Override
	public void fly() {
		System.out.println("fly like an airplane");

	}

}
