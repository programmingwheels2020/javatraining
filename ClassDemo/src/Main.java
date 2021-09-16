
public class Main {

	public static void main(String[] args) {
		
		
		Person person= new Person("Lenin Lawrence",33,"Kochin");
		
		Person per = person;
		
		person.greet();
		
		Person person2 = new Person("Lionell Messi", 34, "Paris");
		
		person2.greet();
		
		Person person3 = new Person("Cristian Ronaldo", 36);
		
		person3.setLocation("Manchenster");
		
		System.out.println(person3.getName());
		System.out.println(person3.name);
		

	}

}
