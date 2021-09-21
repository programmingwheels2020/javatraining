import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {

	public static void main(String[] args)  {
		Person p = new Person("Lenin Lawrence",33,"Kochin");
		Address address = new Address("344","Bangalore","Karnataka");
		p.setAddress(address);
		
		try {
			FileOutputStream fout = new FileOutputStream("person.txt");
			ObjectOutputStream out = new ObjectOutputStream(fout);
			
			out.writeObject(p);
			out.flush();
			
			out.close();
			
			ObjectInputStream oin = new ObjectInputStream(new FileInputStream("person.txt"));
			
			Person p1 = (Person) oin.readObject();
			
			System.out.println(p1.name);
			System.out.println(p1.age);
			System.out.println(p1.location);
			
			FileOutputStream sfout = new FileOutputStream("student.txt");
			ObjectOutputStream sout = new ObjectOutputStream(sfout);
			
			sout.writeObject(new Student("Lenin",33,"Bangalore"));
			sout.flush();
			sout.close();
		} catch (Exception e) {
			
			e.printStackTrace();
		}

	}

}
