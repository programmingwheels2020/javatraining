

 public class Person {

	protected String name ;
	private int age;
	private String location;
	
	//constructor 
	
	Person(String name, int age, String location){
		
		this.name = name;
		this.age = age;
		this.location= location;
	}
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
		
	}
	
	
	public void greet() {
		System.out.println("Hi!! I am "+name);
	}
	
	public void readBooks() {
		System.out.println("He read 1 book per week");
	}
	
	public void readBooks(String bookname) {
		System.out.println("");
	}
	
	public int getAge() {
		return age;
	}
	
	
	public void setLocation(String location) {
		this.location = location;
	}
	
	
	
	
	public String getName() {
		return this.name;
	}
	

	
}
