package kodlamaIOProje;

public class StudentManager extends UserManager {
	
	public StudentManager() {
		
	}
	
	public void displayInfo(Student student) {
		
		System.out.println("ID: "+student.getId());
		System.out.println("Name:"+student.getFirstName());
		System.out.println("Last Name:"+student.getLastName());
		System.out.println("Age:"+ student.getAge());
		System.out.println("School:"+student.getSchoolName());
			
		
		
	}
	

}
