package d.interfaces;

public class Dog extends Animal implements Navigator {

	@Override
	public void speak() {
		System.out.println("woof");

	}

	@Override
	public void navigate() {
		System.out.println("navigate like a dog");

	}

}
