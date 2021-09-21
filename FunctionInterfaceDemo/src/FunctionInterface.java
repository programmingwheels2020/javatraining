import java.util.function.Function;

class Test {
	public static Boolean checkOddOrEven(Integer x) {
		return x % 2 == 0 ? true : false;
	}
	
	public Integer getCube(Integer x) {
		return x*x*x;
	}
}



@FunctionalInterface
interface Printable{
	public void print();
}

@FunctionalInterface
interface PrintableWithParam{
	public Integer getSquare(Integer x);
}

@FunctionalInterface
interface SumInterface{
	public Integer sum(Integer x, Integer y);
}

public class FunctionInterface {

	
	
	public static void main(String[] args) {

		Function<Integer, Boolean> myFunc = Test::checkOddOrEven;
		
		System.out.println(myFunc.apply(11));
		
		Test t = new Test();
		
		Function<Integer, Integer> myTestFunc = t::getCube;
		
		System.out.println(myTestFunc.apply(100));
		
	
		
		/*Printable pr = new Printable() {
			
			@Override
			public void print() {
				System.out.println("Hi There");
				
			}
		};*/
	
		//with lambda expression
		
		Printable pr = ()->{
		    System.out.println("Hi There");	
		};
		
		pr.print();
		
		
		PrintableWithParam prp = (x)->{
			return x*x;
		};
		
		
		
		System.out.println(prp.getSquare(112));
		
		SumInterface si =(x,y)->{
			return x+y;
		};
		
		Function<Integer, Integer> prp1 =  (x)->{
			return x*x;
		};
		
		System.out.println(si.sum(20, 30));
		
		System.out.println(prp1.apply(12));
		
		
		
		

	}

}
