package b.objects;

public class CarTest {

	public static void main(String[] args) {

		Car redCar = new Car();
		Car yellowCar = new Car();

		redCar.color = "red";
		yellowCar.color = "yellow";

		System.out.println(redCar.color);
		System.out.println(yellowCar.color);

	}

}
