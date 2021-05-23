/* * *
 * The product of numbers from a to b
 * ~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-
 * Write a program that prints the product of all integer numbers from a to b (a < b).
 * Include a and exclude b from the product.
 *
 * ~-~-~-~-~-~-~-~-~-~-~|~-~-~-~-~-~-~-~-~-~-~
 * |   Sample Input:    |   Sample Input:    |
 * |   1 2              |   100 105          |
 * |--------------------|--------------------|
 * |   Sample Output:   |   Sample Output:   |
 * |   1                |   11035502400      |
 * ~-~-~-~-~-~-~-~-~-~-~|~-~-~-~-~-~-~-~-~-~-~
 */
//package org.eu5.learn_pisio;

import java.util.Scanner;

/**
 * £ Dragan Ćajić @ JetBrains Academy
 *
 * @author Драган Ћајић <cajic_dragan@yahoo.com>
 * @datetime 11:06 PM May 23, 2021
 * @description The product of numbers from a to b.
 */
class ProductAtoB {
	public static void main(String[] args) {
		// put your code here
		Scanner scanner = new Scanner(System.in);
		
		// TODO: Implement check for a < b
		System.out.print("Enter boundaries of [a, b): ");
		int a = scanner.nextInt(); // 100
		int b = scanner.nextInt(); // 105
		
		long sum = 1; // <-- long for ... [100, 105)
		
		for (int i = a; i < b; i++) {
			sum *= i;
		}
		
		System.out.println("Product of numbers from [a, b): " + sum); // 11035502400!
	}
}
