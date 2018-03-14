package Encapsulation;

public class Student {
	private String SSN;
	
	public Student(String studentSSN){
		SSN = studentSSN;
	}
	
	public String getSSN(){
		return SSN;
	}
	
	Student st= new Student("harichandra");
	
}
	
	


