package Sum;

public class Caluculator {
	public int add(int a, int b) {
		int c = a + b;
		return c;
	}

	public static void main(String args[]) {
		Caluculator c = new Caluculator();
		int sum = c.add(2, 4);
		System.out.println("Sum of the numbers " + sum);

	}
}
