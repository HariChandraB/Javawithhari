package New;

public class Printingpaper {

	public static void main(String[] args) {
		Printer p = new Laserprinter();
		p.printPaper();
		p.loadPaper();
		Laserprinter laserp = (Laserprinter) p;
		laserp.scanPaper();
	}

}
