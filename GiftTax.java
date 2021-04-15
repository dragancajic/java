
import java.util.Scanner;

public class GiftTax {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// Write a program that calculates the gift tax for a gift from a close
		// relative or a family member.
		// 
		// "A gift is a transfer of property to another person against no compensation or payment.
		// If the total value of the gifts you receive from the same donor in the course of 3 years
		// is €5,000 or more, you must pay gift tax."
		// https://www.vero.fi/en/individuals/property/gifts/
		// 
		// When a gift is given by a close relative or a family member,
		// the amount of gift tax is determined by the following table
		// (source vero.fi):
		// https://www.vero.fi/en/individuals/property/gifts/gift-tax-calculator/#gifttaxtables
		
		System.out.println("Value of the gift?");
		int gift = Integer.valueOf(scan.nextLine());
		
		double tax = 0.0;
		
		if (gift < 5000) {
			System.out.println("No tax!");
		} else if (gift >= 5000 && gift < 25000 ) {
			// Tax at the lower limit €100, tax rate 8 %
			tax = 100 + (gift - 5000) * 0.08;
		} else if (gift >= 25000 && gift < 55000 ) {
			// Tax at the lower limit €1700, tax rate 10 %
			tax = 1700 + (gift - 25000) * 0.10;
		} else if (gift >= 55000 && gift < 200000 ) {
			// Tax at the lower limit €4700, tax rate 12 %
			tax = 4700 + (gift - 55000) * 0.12;
		} else if (gift >= 200000 && gift < 1000000 ) {
			// Tax at the lower limit €22100, tax rate 15 %
			tax = 22100 + (gift - 200000) * 0.15;
		} else {
			// Tax at the lower limit €142100, tax rate 17 %
			tax = 142100 + (gift - 1000000) * 0.17;
		}
		
		if (gift >= 5000) {
			System.out.println("Tax: " + tax);
		}
		
		// prevent resource leak
		scan.close();
	}
}
