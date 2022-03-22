package e.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Demo1 {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("Math");
		list.add("Java");
		list.add("Java");
		list.add("English");
		list.add("Java");

		System.out.println(list);

		Set<String> set = new HashSet<>();
		set.add("Math");
		set.add("Java");
		set.add("Java");
		set.add("English");
		set.add("Java");

		System.out.println(set);

	}

}
