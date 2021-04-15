
//import java.util.Scanner;

public class DivisibleByThree {

	public static void main(String[] args) {
		//Scanner scanner = new Scanner(System.in);

		//divisibleByThreeInRange(3, 6);
		//divisibleByThreeInRange(2, 10);
		divisibleByThreeInRange(-10, 5);
	}

	// Write a method that prints all the numbers divisible by three in
	// the given range. The numbers are to be printed in order from the
	// smallest to the greatest.
	public static void divisibleByThreeInRange(int beginning, int end) {
		while (beginning <= end) {
			if (beginning % 3 == 0) {
				System.out.println(beginning);
			}
			beginning++;
		}
	}
}
