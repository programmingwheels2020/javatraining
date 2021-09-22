import java.util.Map;

public  class Student {
	String name;
	String school;
	Map<String, Integer> marks;

	public Student(String name, String school, Map<String, Integer> marks) {
		super();
		this.name = name;
		this.school = school;
		this.marks = marks;
	}
	
	public String getStudentName() {
		return this.name;
	}

}
