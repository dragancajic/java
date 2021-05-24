import java.util.Scanner;

class Shape {
	public static void main(String[] args) {
		// put your code here
		Scanner scanner = new Scanner(System.in);
		
		// TODO: Prevent program from crashing when user inputs wrong type of value!
		System.out.println("Select number of shape:");
		System.out.println("1 - square, 2 - circle, 3 - triangle, 4 - rhombus");
		int option = scanner.nextInt();
		String shape = "";
		
		switch (option) {
			case 1:
				shape = "square";
				break;
			case 2:
				shape = "circle";
				break;
			case 3:
				shape = "triangle";
				break;
			case 4:
				shape = "rhombus";
				break;
			default:
				System.out.println("There is no such shape!");
				break;
		}
		
		if (!shape.isEmpty()) {
			System.out.println("You have chosen a " + shape + ".");
		}
		
		scanner.close();
		System.out.println("scanner is closed!");
	}
}
