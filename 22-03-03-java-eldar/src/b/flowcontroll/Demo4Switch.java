package b.flowcontroll;

public class Demo4Switch {

	public static void main(String[] args) {

		int machineMode = (int) (Math.random() * 3) + 1; // 1=on, 2=off, 3=stand_by
		// machineMode = 11;
		System.out.println(machineMode);

		switch (machineMode) {
		case 1:
			System.out.println("ON");
			break;
		case 2:
			System.out.println("OFF");
			break;
		case 3:
			System.out.println("STAND_BY");
			break;
		default:
			System.out.println("error: " + machineMode + " is illegal");
		}
	}

}
