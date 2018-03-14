package Encapsulation;

public class StudentTest{
    private static final String Irving = null;

	public static void main(String args[]){
        Studentdata sd = new Studentdata();
        sd.setSName("Hari Chandra Prasad");
        sd.setSAge(25);
        sd.setSaddr(Irving);
        sd.setssn(75038);
        System.out.println("Student Name: " + sd.getSName());
        System.out.println("Student Address : " + sd.getSaddr());
        System.out.println("Student SSN: " + sd.getssn());
        System.out.println("Student Age: " + sd.getAge());
   } 
}


