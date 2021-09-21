import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class GenericsDemo {

	public static <E> void printArray(E[] elements) {
		for(E element: elements) {
			System.out.println(element);
		}
	}
	
	//upperbound
	public static void  drawShapes(List<? extends Shape> lists) {
		for(Shape s:lists) {
			s.draw();
		}
	}
	
	//unbounded
	public static void printElement(List<?> lists) {
		for(Object obj : lists) {
			System.out.println(obj);
		}
	}
	
	//Lower bound
	public static void displayObj(List<? super Rectangle> lists) {
		for(Object s:lists) {
			System.out.println(s);;
		}
	}
	
	
	public static void main(String[] args) {
		
		ArrayList arrList = new ArrayList();
		
		arrList.add(1);
		arrList.add(5);
		//arrList.add("Lenin");
		
		
		for(Object a:arrList) {
			int b = (int)a;
			System.out.println(b);
		}
		
		ArrayList<Integer> arrList1 = new ArrayList<Integer>();
		arrList1.add(3);
		arrList1.add(4);
		//arrList1.add("Lenin");
		
		for(Integer a : arrList1) {
			System.out.println(a);
		}
		
		Map<String, String> map = new HashMap<String, String>(); 
		
		map.put("IND", "India");
		map.put("USA", "United States");
		
		Set<Map.Entry<String,String>> set =  map.entrySet();
		
		Iterator <Map.Entry<String, String>> itr = set.iterator();
		
		while(itr.hasNext()) {
			Map.Entry<String, String> entry = itr.next();
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		
		Square<Integer> sqr = new Square<Integer>(36);
		System.out.println(sqr.getSquare());
		
		Square<Double> sqr1 = new Square<Double>(36.76);
		System.out.println(sqr1.getSquare());
		
		System.out.println("----------------------------");
		
		Integer[] a = {40,64,34,566,4,3};
		printArray(a);
		
		Character[] c = {'A','B','C','D'};
		printArray(c);
		System.out.println("------------------------");
		
		ArrayList<Rectangle> list1 = new ArrayList<Rectangle>();
		list1.add(new Rectangle());
		list1.add(new Rectangle());
		
		//drawShapes(list1);
		
		ArrayList<Shape> list2 = new ArrayList<Shape>();
		list2.add(new Circle());
		list2.add(new Circle());
		
		//drawShapes(list2);
		
		printElement(list2);
		
		List<Integer> intList = new ArrayList<Integer>();
		intList.add(23);
		intList.add(45);
		printElement(intList);
		printElement(list1);
		
		System.out.println("---------------");
		
		displayObj(list1);
		
		displayObj(list2);

	}

}
