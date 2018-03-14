package Arrays;

public class Ascendingorder {

	public static void main(String[] arg) {
		int[] a = { 23, 1, 34 };
		int temp = 0;

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++)
			
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
		
			
		
		System.out.println(" " + a[i]);
		}
	}
}
