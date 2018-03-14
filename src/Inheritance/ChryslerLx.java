package Inheritance;

public class ChryslerLx extends ChryslerSx{
	public String blindSpotwarning = "blindSpotwarning";
	
	public void printChryslerLxFeatures(){
		
		printChryslerSxFeatures();
		
		System.out.println("Features of ChryslerLx are : Blind Spot Warning Included" + blindSpotwarning);
	}

}
