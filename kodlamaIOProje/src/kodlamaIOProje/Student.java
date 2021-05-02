package kodlamaIOProje;

public class Student extends User {
	private int id;
	private int age;
	private String schoolName;
	
	public Student() {
		
	}
	
    public Student(int id,int age,String schoolName,String firstName,String lastName) {
    	super(firstName,lastName);
    	this.age = age;
    	this.id = id;
    	this.firstName = firstName;
    	this.lastName = lastName;
    	this.schoolName = schoolName;
    	
    	
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
    
}
