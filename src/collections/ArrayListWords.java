package collections;

import java.util.ArrayList;

public class ArrayListWords {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>(5);

		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		list.set(2, "Java");
		System.out.println(list);

	}

}
