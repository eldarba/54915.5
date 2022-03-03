package b.flowcontroll;

public class Demo3IfElseIf {

	public static void main(String[] args) {
		
		int grade = (int) (Math.random()*11);
		System.out.println("grade is: " + grade);
		
		if(grade <= 5) {
			System.out.println("fail");
		} else if(grade <= 7) {
			System.out.println("pass");
		}else if(grade <= 9) {
			System.out.println("good");
		}else {
			System.out.println("great");
		}
		

	}

}
