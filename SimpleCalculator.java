import java.util.Scanner;

class SimpleCalculator {
	public static void main(String[] args) {
		// put your code here
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter expression:");
		try {
			long operand1 = scanner.nextLong();
			String operator = scanner.next();
			long operand2 = scanner.nextLong();
			
			long result = 0L;
			
			// is result defined or not?
			boolean isDefined = true;
			
			switch (operator) {
				case "+":
					result = operand1 + operand2;
					break;
				case "-":
					result = operand1 - operand2;
					break;
				case "/":
					if (operand2 == 0L) {
						System.out.println("Division by 0!");
						isDefined = false; // don't print...
						// result because it is not defined!
					} else {
						result = operand1 / operand2;
					}
					break;
				case "*":
					result = operand1 * operand2;
					break;
				default:
					System.out.println("Unknown operator");
					isDefined = false; // don't print...
					// result because it is not defined!
					break;
			}
			
			if (isDefined) {
				System.out.println("Result: " + result);
			}
			
		} catch (Exception e) {
			//e.printStackTrace();
			System.out.println("INCORRECT DATA TYPE!");
		}
		
		scanner.close();
	}
}
