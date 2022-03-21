package b.objects;

public class PersonTest {

	public static void main(String[] args) {

		// create an int variable
		int x = 5;

		// create a Person object
		Person p = new Person();

		// set the object state
		p.setId(101);
		p.setName("Dan");
		p.setAge(33);

		// print the object state
		System.out.println(p.getId());
		System.out.println(p.getName());
		System.out.println(p.getAge());

		Person p2 = new Person(102, "Lea", 33);
		System.out.println(p2.getId());
		System.out.println(p2.getName());
		System.out.println(p2.getAge());

	}

}
