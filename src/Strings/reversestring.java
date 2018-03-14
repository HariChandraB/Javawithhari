package Strings;

public class reversestring {
	public static void main(String[] args) {
		String string = "Apple";
		String reverse = new StringBuffer(string).reverse().toString();
		System.out.println("Given String: " + string);
		System.out.println("String after Reverse: " + reverse);

	}
}