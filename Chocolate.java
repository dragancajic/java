/**
 * Conditional statement → Chocolate
 * https://hyperskill.org/learn/step/2170
 *
 * Imagine a chocolate bar. Remember how it is usually split into smaller
 * bits by a special grid?
 *
 * Now think of chocolate as an N x M rectangle divided into little segments:
 * N segments in length and M in width. Each segment is 1x1 and unbreakable.
 *
 * Find out whether it is possible to break off exactly K segments
 * from the chocolate with a single straight line: vertical or horizontal.
 */
package org.eu5.learn_pisio;

import java.util.Scanner;

/**
 * £ Dragan Ćajić @ JetBrains Academy
 *
 * @author Драган Ћајић <cajic_dragan@yahoo.com>
 * @datetime 10:25 PM May 2, 2021
 * @description Do you want some chocolate? YES or NO? :-)
 */
public class Chocolate {

	public static void main(String[] args) {
		// put your code here
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int k = scanner.nextInt();

		if (n * m > k && (k % n == 0 || k % m == 0)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}
