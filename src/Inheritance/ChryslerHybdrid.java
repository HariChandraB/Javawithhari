package Inheritance;

public class ChryslerHybdrid extends ChryslerLx {
	public String collisonControl = "collisonControl";

	public void printChryslerHybridFeatues() {
		
		printChryslerLxFeatures();

		System.out.println("Features of Chrysler Hybrid are : Collision Control Warning" + collisonControl);
	}

}
