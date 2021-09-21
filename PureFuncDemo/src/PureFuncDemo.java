
class Demo {
    int result;
	public int getSquare(int x) {
		//result = x*x;
		//return result;
        return x*x;
	}
}

class DemoTwo{
	int result;
    
	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}

	@Override
	public String toString() {
		return "DemoTwo [result=" + result + "]";
	}
	
	
}

public class PureFuncDemo {

	public static void main(String[] args) {
		
		DemoTwo d2 = new DemoTwo();
		d2.setResult(10);
		System.out.println(d2.toString());
		

	}

}
