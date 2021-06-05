
import java.util.ArrayList;
//import java.util.Iterator;
import java.util.Scanner;

public class SumOfAList {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		ArrayList<Integer> list = new ArrayList<>();
		while (true) {
			int input = Integer.valueOf(scanner.nextLine());
			if (input == -1) {
				break;
			}
			list.add(input);
		}

		System.out.println("");

		// toteuta listan lukujen summan laskeminen tänne
		// perform the calculation of the sum of the numbers in the list here
		int sum = 0;

		for (int number : list) {
			sum += number;
		}
		// or using these alternatives:
		// ~-~-~-~-~-~-~-~-~-~-~-~-~-~-
		// sum = list.stream().map((number) -> number).reduce(sum, Integer::sum);
		/*
		for (Iterator<Integer> it = list.iterator(); it.hasNext();) {
			int number = it.next();
			sum += number;
		}
		*/
		System.out.println("Sum: " + sum);
	}
}
