
import java.util.Scanner;

public class SumOfASequence {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Implement a program, which calculates the sum
		// 1 + 2 + 3 + 4 + ... + n
		// where n is given as user input.
		// https://en.wikipedia.org/wiki/1 + 2 + 3 + 4 + ...
		// 1 + 2 + 3 + 4 + ... + n = (n * (n + 1)) / 2
		// n = 3 -> (3 * 4) / 2 = 6
		// n = 7 -> (7 * 8) / 2 = 28
		System.out.print("Last number? ");
		int number = Integer.valueOf(scanner.nextLine());
		
		int sum = 0;
		
		for (int i = 1; i <= number; i++) {
			sum += i;
		}
		
		System.out.println("The sum is " + sum);
	}
}
