package Arrays;

public class Wallet {
	public static void main(String[] args) {

		String[] ccNames = { "PNC", "BOFA", "Chase", "WellsFargo" };
		String[] digitalPay = { "Android Pay", "Microsoft Wallet", "Apple Pay" };
		String[] ccNumbers = { "12356", "123569", "789654", "456987" };
		String[] ccCVV = { "236", "456", "789", "258" };

		System.out.println("Credit Card Names:" + ccNames[2] + "\nDigital Wallet Payment:" + digitalPay[1]
				+ "\nCreditCard Numbers:" + ccNumbers[3] + "\nCreditCard CVV :" + ccCVV[1]);

	}

}
