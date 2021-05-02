package kodlamaIOProje;

public class Main {

	public static void main(String[] args) {
		Student student1 = new Student(1,20,"EA�","Ahmet","BALKAYA");
		Student student2 = new Student(2,20,"B�","Haluk","G�LTEK�N");
		Student student3 = new Student(3,20,"�T�","Kenan","DUR");
		
		StudentManager studentManager = new StudentManager();
		studentManager.displayInfo(student1);
		studentManager.displayInfo(student2);
		studentManager.displayInfo(student3);
		
		Instructor instructor = new Instructor();
        instructor.setFirstName("Engin");
        instructor.setLastName("Demirog");
        instructor.setLessons("Java");
        
        InstructorManager instructorManager = new InstructorManager();
        instructorManager.displayInfo(instructor);
        
        UserManager userManager = new UserManager();
        userManager.add(student1);
        userManager.add(student2);
        userManager.add(student3);
        
        
        
	}

}
