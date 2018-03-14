package exceptions;

public class OrderValidations {
	public static void main(String[] args) throws Exception {
		Order ob = new Order();
		String Name = ob.name("Hari");
		String Address = ob.address("Irving");
		String Order = ob.order(" ");

		if (Name.isEmpty() || Address.isEmpty() || Order.isEmpty()) {
			throw new Exception("Data Missing Exception");
		} else {
			System.out.println("Name is " + Name + " \nAddress is " + Address + " \nOrder is " + Order);
		}

	}

}
