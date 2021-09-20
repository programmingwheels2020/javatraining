
public class Student {

	String name;
	String course;

	public Student(String name, String course) {
		super();
		this.name = name;
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", course=" + course + "]";
	}

}
