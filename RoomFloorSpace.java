/* * *
 * Floor-space of the room
 * ~-~-~-~-~-~-~-~-~-~-~-~
 * Residents of the country of Malevia often experiment with the plan of their rooms.
 * Rooms can be triangular, rectangular, and round.
 *
 * Write a program that calculates the floorage of the rooms.
 *
 * Input data format
 * The type of the room shape and the relevant parameters.
 *
 * Output data format
 * The area of the resulting room.
 *
 * Note that the value of 3.14 is used instead of the number π in Malevia.
 *
 * ~-~-~-~-~-~-~-~-~-~-~|~-~-~-~-~-~-~-~-~-~-|-~-~-~-~-~-~-~-~-~-~-
 * |   Sample Input 1:  |   Sample Input 2:  |   Sample Input 3:  |
 * |   rectangle        |   circle           |   triangle         |
 * |   4                |   5                |   3                |
 * |   10               |                    |   4                |
 * |                    |                    |   5                |
 * |--------------------|--------------------|--------------------|
 * |   Sample Output 1: |   Sample Output 2: |   Sample Output 3: |
 * |   40.0             |   78.5             |   6.0              |
 * ~-~-~-~-~-~-~-~-~-~-~|~-~-~-~-~-~-~-~-~-~-|-~-~-~-~-~-~-~-~-~-~-
 */
//package org.eu5.learn_pisio;

import java.util.Scanner;

/**
 * £ Dragan Ćajić @ JetBrains Academy
 *
 * @author Драган Ћајић <cajic_dragan@yahoo.com>
 * @datetime 11:47 PM June 14, 2021
 * @description Floor-space of the room.
 */
class RoomFloorSpace {
	public static void main(String[] args) {
		// put your code here
		Scanner scanner = new Scanner(System.in);
		
		String shape = scanner.next();
		
		double area = 0.0;
		
		// triangle (a, b, c) & rectangle (a, b)
		double a = 0.0;
		double b = 0.0;
		double c = 0.0;
		
		// circle
		double radius = 0.0;
		
		switch (shape) {
			case "triangle":
				a = scanner.nextDouble();
				b = scanner.nextDouble();
				c = scanner.nextDouble();
				// Heron's Formula
				// https://mathworld.wolfram.com/HeronsFormula.html
				double s = (a + b + c) / 2;
				area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
				break;
			case "rectangle":
				a = scanner.nextDouble();
				b = scanner.nextDouble();
				area = a * b;
				break;
			case "circle":
				radius = scanner.nextDouble();
				area = 3.14 * radius * radius;
				break;
			default:
				System.out.println("Unknown floor-space!");
				break;
		}
		
		if (area != 0.0) {
			System.out.println(area);
		} else {
			System.out.println("Room doesn't exist! :o)");
		}
	}
}
