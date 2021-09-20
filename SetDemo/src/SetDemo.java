import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class SetDemo {

	public static void main(String args[]) {
		//HashSet<String> hSet = new HashSet<String>();
		LinkedHashSet<String> hSet = new LinkedHashSet<String>();
		hSet.add("ONE");
		hSet.add("TWO");
		hSet.add("THREE");
		hSet.add("FOUR");
		hSet.add("FIVE");
		hSet.add("SIX");
		hSet.add("SEVEN");
		hSet.add("EIGHT");
		hSet.add("NINE");
		Iterator<String> itr = hSet.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
	

}
