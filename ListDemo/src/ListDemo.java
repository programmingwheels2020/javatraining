import java.util.ArrayList;
import java.util.Iterator;

public class ListDemo {

	public static void main(String[] args) {
		
		//ArrayList
		
		ArrayList<String> arrList = new ArrayList<String>();
		System.out.println(arrList.isEmpty());
		
		arrList.add("ONE");
		arrList.add("TWO");
		arrList.add("THREE");
		
		System.out.println(arrList.isEmpty());
		
		System.out.println(arrList.contains("ONE"));
		System.out.println(arrList);
		
		Iterator<String> itr = arrList.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		ArrayList<Student>  stuList = new ArrayList<Student>();
		
		stuList.add(new Student("Lenin","CS","33"));
		
		stuList.add(new Student("Ruben","EC","22"));
		
		stuList.add(new Student("Kamal","ME","22"));
		
		stuList.size();
		
		stuList.set(0, new Student("Ravi","CS","40"));
		
		
		
		stuList.remove(0);
		
		Student student1 = stuList.get(0);
		System.out.println(student1.toString());
		
		/*for(Student stu : stuList) {
			System.out.println(stu.name);
		}*/
		
		
		

	}

}
