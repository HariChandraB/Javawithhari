package Sum;

public class ScientificCal {
	public int squareof(int a) {
		int square = a * a;
		return square;

	}

	public static void main(String args[]) {
		ScientificCal c = new ScientificCal();
		int result = c.squareof(25);
		System.out.println("Square of the given Number = " + result);

	}

}
