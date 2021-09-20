import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		//
		
		LinkedList<Student>  stuList = new LinkedList<Student>();
		
		stuList.add(new Student("ONE","1"));
		stuList.add(new Student("TWO","2"));
		stuList.add(new Student("THREE","3"));
		
		
		
		stuList.addFirst(new Student("FOUR","4"));
		System.out.println(stuList.toString());
		System.out.println(stuList.peek());
		

	}

}
