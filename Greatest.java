
public class Greatest {

	public static int greatest(int number1, int number2, int number3) {
		//write some code here
		int maximum = number1;
		/*
		// BE CAREFUL with IF-ELSE-IF statement!
		// This is going to produce the false maximum:
		if (number2 > maximum) {
			maximum = number2; // wrong result: 3!
		} else if (number3 > maximum) {
			maximum = number3;
		}
		*/
		// Follow the path of program execution! / PROGRAM FLOW <- LOOK!
		// The RIGHT CHOICE is 2 IF statements!!
		if (number2 > maximum) {
			maximum = number2;
		}
		
		if (number3 > maximum) {
			maximum = number3;
		}

		return maximum;
	}

	public static void main(String[] args) {
		int result = greatest(2, 3, 7);
		System.out.println("Greatest: " + result);
	}
}
