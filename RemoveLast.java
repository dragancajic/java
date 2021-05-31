
import java.util.ArrayList;

public class RemoveLast {

	public static void main(String[] args) {
		// Try your method in here
		ArrayList<String> strings = new ArrayList<>();
		
		strings.add("First");
		strings.add("Second");
		strings.add("Third");
		
		System.out.println(strings);
		
		removeLast(strings);
		removeLast(strings);
		
		System.out.println(strings);
	}

	public static void removeLast(ArrayList<String> listOfStrings) {
		if (listOfStrings.isEmpty()) {
			return;
		}
		// Usage of '.size() == 0' can be replaced with .isEmpty()!
		/*
		if (listOfStrings.size() == 0) {
			return;
		}
		*/
		listOfStrings.remove(listOfStrings.size() - 1);
	}
}
