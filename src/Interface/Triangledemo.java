package Interface;

public class Triangledemo {
	public static void main(String[] args) {
		Triangle tref = new Equilateral(5);

		System.out.println("Area of Equilateral Triangle is :" + tref.getArea());

		System.out.println("Perimeter of Equilateral Triangle is :" + tref.getPerimeter());

		Triangle rat = new Rightangled(5, 6);

		System.out.println("Area of Rightangled Triangle is :" + rat.getArea());

		System.out.println("Perimeter of Rightangled Triangle is :" + rat.getPerimeter());

	}

}
