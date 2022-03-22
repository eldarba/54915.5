package d.interfaces;

public class Test {

	public static void main(String[] args) {

		Animal[] animals = new Animal[4];
		animals[0] = new Dog();
		animals[1] = new Bee();
		animals[2] = new Dog();
		animals[3] = new Bee();

		for (int i = 0; i < animals.length; i++) {
			animals[i].speak();
			if (animals[i] instanceof Flyer) {
				Flyer flyer = (Flyer) animals[i];
				flyer.fly();
			}
			if (animals[i] instanceof Navigator) {
				Navigator navigator = (Navigator) animals[i];
				navigator.navigate();
			}
			System.out.println("============");
		}

		System.out.println("============================================");

		Flyer[] flyers = new Flyer[4];
		flyers[0] = new Bee();
		flyers[1] = new Airplane();
		flyers[2] = new Bee();
		flyers[3] = new Airplane();

		for (int i = 0; i < flyers.length; i++) {
			flyers[i].fly();
			if (flyers[i] instanceof Navigator) {
				Navigator navigator = (Navigator) flyers[i];
				navigator.navigate();
			}
			System.out.println("============");
		}
	}

}
