package a;

public class Test {

	public static void main(String[] args) {
		Person p1 = new Person(101, "aaa", 22);
		Person p2 = new Person(102, "bbb", 33);
		Person p3 = new Person(101, "aaa", 23);

		System.out.println(p1);
		System.out.println(p2);

		System.out.println(p1 == p3);
		System.out.println(p1.equals(p3));

		String s1 = new String("aaa");
		String s2 = new String("aaa");

		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));

	}

}
