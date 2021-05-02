package kodlamaIOProje;

public class InstructorManager extends UserManager{
	
	public InstructorManager() {
		
	}
	
	public void displayInfo(Instructor instructor) {
		
		System.out.println("Name:"+instructor.getFirstName());
		System.out.println("Last Name:"+instructor.getLastName());
		System.out.println("Lesson:"+instructor.getLessons());
		
	}

}
