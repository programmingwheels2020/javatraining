
public class ArrayDemo {

	public static void main(String[] args) {

		// int nums[];

		// nums = new int[10];

		int nums[] = new int[10];

		// System.out.println(nums[11]);

		int ratings[] = { 12, 13, 24, 535, 645, 334, 6, 6, 745 };
		System.out.println(ratings[5]);

		// int matrix[][] = new int[3][3];

		int matrix[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		System.out.println(matrix[1][1]);

		int n = -19;

		// String OddOrEven = (n%2==0)?"EVEN":"ODD" ;

		String OddOrEven = (n > 0) ? (n % 2 == 0 ? "EVEN" : "ODD") : "Negative";

		System.out.println(OddOrEven);

		// operator precedence

		int n1 = 8 * 9 + 1;
		System.out.println(n1);

		// if

		int a = 18;

		/*
		 * if(a%3==0) { System.out.println("Multiple of 3"); }else {
		 * System.out.println("Not multiple of 3"); }
		 */

		if (a % 3 == 0 && a % 5 == 0) {
			System.out.println("Mulitple of 3 and 5");
		} else if (a % 3 == 0) {
			System.out.println("Mulitple of 3");
		} else if (a % 5 == 0) {
			System.out.println("Multiple of 5");
		}else {
			System.out.println("not multiple of 5 or 3");
		}
	}

}
