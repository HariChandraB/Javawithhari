
package Arrays;

public class Minandmax {
	public static void main(String[] args) {
		int a[] = { 12, 4, 34, 2 };
		int min = a[0];
		int max = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
			}
			if (a[i] > max) {
				max = a[i];
			}
		}
		System.out.println("Minimum value:" + min);

		System.out.println("Maximum Value:" + max);

	}
}