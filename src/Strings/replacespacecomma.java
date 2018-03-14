package Strings;

import java.lang.String;
import java.util.Scanner;

public class replacespacecomma {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Sentence to replace spaces with commas");
		String r = sc.nextLine();
		System.out.println(r.replaceAll(" ", ","));

	}

}
