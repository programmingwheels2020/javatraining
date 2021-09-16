
public class Student extends Person {

	Book book;

	public Student(String name, int age, Book book) {
		super(name, age);
		this.book = book;

	}

	public void printName() {

		System.out.println("Printed from Student");
	}

}
