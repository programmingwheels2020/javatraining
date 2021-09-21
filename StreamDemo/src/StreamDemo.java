import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Book {
	String title;
	String author;

	Double price;

	public Book(String title, String author, Double price) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", price=" + price + "]";
	}
	
	

}

public class StreamDemo {

	public static void main(String[] args) {

		Integer a[] = new Integer[] { 34, 23, 4, 5, 66, 42, 65, 23, 67 };

		List<Integer> arrList = Arrays.asList(a);

		List<Integer> b = new ArrayList<Integer>();
		/*
		 * for(Integer i : arrList) {
		 * 
		 * if(i %2==0) { b.add(i); }
		 * 
		 * }
		 * 
		 * for(Integer j : b) { System.out.println(j); }
		 */

		/*
		 * arrList.stream().map((x)->{ return x*x; }).forEach(System.out::println);
		 */

		Predicate<Integer> pr = (x) -> {
			return x % 2 == 0;
		};

		arrList.stream().filter(pr).forEach(System.out::println);

		List<Book> bookList = new ArrayList<Book>();

		bookList.add(new Book("Hundred Years of Solitude", "Gabriel Marques Garcia", 101.00));

		bookList.add(new Book("The Pilgrimage", "Paulo Choelo", 200.00));
		bookList.add(new Book("The Monk who sold Ferrari", "Robin Sharma", 150.00));
		bookList.add(new Book("The Subtle art of not giving F", "Robin Sharma", 160.00));

		bookList.stream().filter((book) -> {
			return book.price > 150.0;
		}).forEach(x-> System.out.println(x));

	}

}
