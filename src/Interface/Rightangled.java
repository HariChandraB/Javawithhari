package Interface;

public class Rightangled implements Triangle{
	public double base;
	public double height;

	public Rightangled(double base, double height) {
		this.base = base;
		this.height = height;
	}

	public double getBase() {
		return base;
	}

	public double getHeight() {
		return height;
	}

	public double getArea() {
		return this.base * (this.height * 0.5);

	}

	public double getPerimeter() {
		return this.base + this.height + (Math.sqrt(base * base + height * height));
	}

}
