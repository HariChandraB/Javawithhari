package Cell;

public class Cellphone {
	public String OperatingSystem;
	public String brand;
	public String model;
	public int memory;
	public String displaysize;
	public String price;

	public void printDetails() {
		System.out.println(" OperatingSystem= " + OperatingSystem + "\n brand= " + brand + " \n model= " + model
				+ "\n memory=" + memory + "\n displaysize =" + displaysize + "\n price =" + price + "");
	}

	public static void main(String[] args) {
		Cellphone cs = new Cellphone();
		cs.OperatingSystem = "Android Nougat";
		cs.brand = "Motorola";
		cs.model = "Nexus";
		cs.memory = 4;
		cs.displaysize = "6.0 inches";
		cs.price = "$300";

		cs.printDetails();
	}
}
