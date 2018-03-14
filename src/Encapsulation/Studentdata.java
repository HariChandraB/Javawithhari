package Encapsulation;

public class Studentdata {
	
	    private int ssn;
	    private String SName;
	    private String Saddr;
	    private int SAge;

	    public int getssn(){
	        return ssn;
	    }

	    public String getSName(){
	        return SName;
	    }
	    public String getSaddr(){
	    	return Saddr;
	    }

	    public int getAge(){
	        return SAge;
	    }

	    public void setSAge(int newValue){
	        SAge = newValue;
	    }

	    public void setSName(String newValue){
	        SName = newValue;
	    }
	    
	    public void setSaddr(String newValue){
	    	Saddr = newValue;
	    }

	    public void setssn(int newValue){
	        ssn = newValue;
	    }
	}
	
