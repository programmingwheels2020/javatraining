
public class LoopDemo {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			
			if(i%2==1) {
				continue;
			}
			System.out.println("Square of" + i + "is" + i * i);
		}

		int j = 0;

		while (j < 10) {
			System.out.println("Cube of " + j + "is" + j * j * j);
			j++;
		}

		int k = 1;
		do {
			System.out.println("Thisi s the value " + k);
			k++;
		} while (k < 10);

	}

}
