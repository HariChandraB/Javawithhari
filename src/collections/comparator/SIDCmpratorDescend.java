package collections.comparator;

import java.util.Comparator;

public class SIDCmpratorDescend implements Comparator {
	@Override
	public int compare(Object o1, Object o2) {
		StudentDetails student_1 = (StudentDetails) o1;
		StudentDetails student_2 = (StudentDetails) o2;

		if (student_1.studentID > student_2.studentID)
			return -1;
		else if (student_1.studentID < student_2.studentID)
			return 1;
		else
			return 0;

	}

}
