
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Implement a program that reads user input until the user enters 9999.
		// After that, the program prints the smallest number and its index
		//  -- the smallest number might appear multiple times.
		ArrayList<Integer> numbers = new ArrayList<>();
		
		System.out.print("Enter integers (9999 for EXIT): ");
		
		while (true) {
			int number = scanner.nextInt();
			
			if (number == 9999) {
				break;
			}
			numbers.add(number);
		}
		
		System.out.println(); // empty line
		
		int smallest = findSmallest(numbers);
		System.out.println("Smallest number: " + smallest);
		findIndex(numbers, smallest);
	}

	// implement finding the smallest number in the list
	public static int findSmallest(ArrayList<Integer> list) {
		if (list.isEmpty()) {
			System.out.println("No numbers! :-O");
			return -1;
		}
		
		int min = list.get(0);
		
		int index = 0;
		while (index < list.size()) {
			if (list.get(index) < min) {
				min = list.get(index);
			}
			index++;
		}
		return min;
	}

	// implement finding the index of smallest number
	public static void findIndex(ArrayList<Integer> list, int value) {
		for (int index = 0; index < list.size(); index++) {
			if (list.get(index) == value) {
				System.out.println("Found at index: " + index);
			}
		}
	}
}
