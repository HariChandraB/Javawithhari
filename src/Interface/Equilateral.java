package Interface;

public class Equilateral implements Triangle {
	public double side;

	public Equilateral(double side) {
		this.side = side;
	}

	public double getSide() {
		return side;
	}

	public double getArea() {
		return (Math.sqrt(3) / 4) * Math.pow(this.side, 2);

	}

	public double getPerimeter() {
		return 3 * this.side;
	}
}
