package collections.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Student {

	public static void main(String args[]) {

		List<StudentDetails> student = new ArrayList<StudentDetails>();
		student.add(new StudentDetails(4, "hari"));
		student.add(new StudentDetails(3, "chandra"));
		student.add(new StudentDetails(5, "prasad"));
		student.add(new StudentDetails(6, "rajendra"));
		student.add(new StudentDetails(7, "purna"));
		// System.out.println(student);
		Comparator compDes = new StudentIDComparatorDesc();
		Collections.sort(student, compDes);
		System.out.println("Descending order");
		System.out.println(student);

		Comparator compAssen = new StudentIDComparatorAssen();
		Collections.sort(student, compAssen);
		System.out.println("Asscending order");

		System.out.println(student);

	}

}
