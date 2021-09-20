
public class Student {

	String name;
	String course;
	String age;

	public Student(String name, String course, String age) {
		super();
		this.name = name;
		this.course = course;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", course=" + course + ", age=" + age + "]";
	}
	
	

}
