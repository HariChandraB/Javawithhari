package tostring.override;

public class CCValidation {
	public static void main(String args[]) {
		UniqueCardWallet c1 = new UniqueCardWallet("visa ", 234567);
		UniqueCardWallet c2 = new UniqueCardWallet("visa ", 834567);
		Boolean b1 = c1.equals(c2);
		if (b1 == false) {
			System.out.println("you entered duplicate number");
		} else {
			System.out.println(" card1 details are " + c1.toString() + " " + c1.hashCode());
			System.out.println(" card2 details are " + c2.toString() + " " + c2.hashCode());
		}
	}
}
