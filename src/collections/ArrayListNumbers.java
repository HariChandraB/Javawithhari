package collections;

import java.awt.List;
import java.util.ArrayList;

public class ArrayListNumbers {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<Integer>(10);

		al.add(0);
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		al.add(6);
		al.add(7);
		al.add(8);
		al.add(9);
		System.out.println(al.subList(0, 5));

	}

}
