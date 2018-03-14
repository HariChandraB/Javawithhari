package collections;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

class StudentDetails implements Comparable {
	int studentId;
	String studentName;

	public StudentDetails(int i, String string) {
		// TODO Auto-generated constructor stub
	}

	public void StudentDetails(int studentID, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}

	@Override
	public String toString() {
		return "StudentDetails [" + studentId + ", " + studentName + "]";
	}

	@Override
	public int compareTo(Object o) {
		StudentDetails x = (StudentDetails) o;
		if (this.studentId < x.studentId)
			return 1;
		else if (this.studentId > x.studentId)
			return -1;
		else
			return 0;

	}
}

public class StudentTreeSet {

	public static void main(String args[]) {

		Set<StudentDetails> s = new TreeSet<StudentDetails>();
		s.add(new StudentDetails(1, "Hari Chandra"));
		s.add(new StudentDetails(2, "Kali Prasad"));
		s.add(new StudentDetails(3, "kranthi"));
		s.add(new StudentDetails(4, "Thiru"));
		s.add(new StudentDetails(5, "Dinesh"));
		System.out.println(s);
		for (Iterator<StudentDetails> iterator = s.iterator(); iterator.hasNext();) {
			while (iterator.hasNext()) {
				StudentDetails student = (StudentDetails) iterator.next();
				System.out.println(student);
			}

		}
	}
}
