package collections;

import java.util.Set;
import java.util.TreeSet;

class Car {
	public static void main(String args[]) {
		Set<CarLicensePlate> car = new TreeSet<CarLicensePlate>();
		car.add(new CarLicensePlate(0));
	}
}

public class CarLicensePlate implements Comparable {

	int carLicense;
	private int carLicence;

	public CarLicensePlate(int carLicense) {
		super();
		this.carLicense = carLicense;

	}

	@Override
	public String toString() {
		return "CarLicensePlate [carLicense=" + carLicense + "]";
	}

	public int compareTo(Object o) {
		CarLicensePlate otherStudent = (CarLicensePlate) o;
		if (this.carLicence > otherStudent.carLicence)
			return -1;
		else if (this.carLicence < otherStudent.carLicence)
			return 1;
		else
			return 0;

	}

}
