package collections;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

class StudentDetails1 {
	int sId;
	String sName;

	public StudentDetails1(int sId, String sName) {
		this.sId = sId;
		this.sName = sName;
	}

	@Override
	public String toString() {
		return "StudentDetails [sId=" + sId + ", sName=" + sName + "]";
	}
}

public class StudentHashSet {

	public static void main(String[] args) {

		Set<StudentDetails1> student = new TreeSet<StudentDetails1>();
		student.add(new StudentDetails1(1, "Hari"));
		student.add(new StudentDetails1(2, "Chandra"));
		student.add(new StudentDetails1(3, "Prasad"));
		student.add(new StudentDetails1(4, "Rajendra"));
		student.add(new StudentDetails1(5, "Purna"));
		System.out.println(student);
		for (Iterator<StudentDetails1> i = student.iterator(); i.hasNext();) {
			while (i.hasNext()) {
				StudentDetails1 sd = (StudentDetails1) i.next();
				System.out.println(sd);
			}

		}
	}
}
