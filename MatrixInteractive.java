//package org.eu5.learn_pisio;

import java.util.Scanner;

/**
 * @author Драган Ћајић <cajic_dragan@yahoo.com>
 * @datetime 3:35 AM April 9, 2021
 * @modified 3:01 PM April 11, 2021
 * @description Minimal element of individual row of matrix.
 */
public class MatrixInteractive {
	
	public static void main(String[] args) {
		/*
		int[][] matrix = {
			{1, 9, 3, 4, 1},
			{3, 2, 7, 6, 1},
			{4, 5, 7, 9, 3},
			{3, 2, 9, 5, 6}
		};
		
		System.out.println("matrix: " + matrix.length + " x " + matrix[0].length);
		*/
		
		//~ add interactivity and make program more general and useful
		//~- ~- ~- ~- ~- ~- ~- ~- ~- ~- ~- ~- ~- ~- ~- ~- ~- ~- ~- ~-/
		Scanner reader = new Scanner(System.in);
		
		// give dimension of your matrix (row x column)
		System.out.print("Enter number of rows _ : ");
		int row = Integer.valueOf(reader.nextLine());
		
		System.out.print("Enter number of columns: ");
		int column = Integer.valueOf(reader.nextLine());
		
		System.out.println(); // empty line
		
		// initialize empty matrix
		int[][] matrix = new int[row][column];
		
		// fill matrix with elements
		for (int i = 0; i < row; i++) {
			
			// try to be clever ;-)
			String suffix = "th";
			
			if (i == 0) {
				suffix = "st";
			} else if (i == 1) {
				suffix = "nd";
			} else if (i == 2) {
				suffix = "rd";
			}
			
			System.out.println("Input elements for " + (i + 1) + suffix + " row: ");
			for (int j = 0; j < column; j++) {
				matrix[i][j] = reader.nextInt();
			}
			
			if (i == (row - 1)) {
				System.out.println("End of Matrix (EOM)! Thank You!");
			} else {
				System.out.println("End of Row (EOR)! Proceed to next.");
			}
		}
		
		System.out.println(); // empty line
		
		//~ let's see the matrix that you have chosen to work with
		//~- ~- ~- ~- ~- ~- ~- ~- ~- ~- ~- ~- ~- ~- ~- ~- ~- ~- ~-/
		System.out.println("You've entered matrix " + row + " x " + column + ":");
		
		// output header of matrix
		System.out.print("-");
		for (int blank = 0; blank < column; blank++ ) {
			System.out.print("  ");
		}
		System.out.print(" -\n");
		
		// output elements of matrix
		for (int i = 0; i < row; i++) {
			System.out.print("| ");
			for (int j = 0; j < column; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println("|");
		}
		
		// output footer of matrix
		System.out.print("-");
		for (int blank = 0; blank < column; blank++ ) {
			System.out.print("  ");
		}
		System.out.print(" -\n");
		
		System.out.println(); // empty line
		
		//~ find minimal element of every single row and print it to the console
		//~- ~- ~- ~- ~- ~- ~- ~- ~- ~- ~- ~- ~- ~- ~- ~- ~- ~- ~- ~- ~- ~- ~- /
		System.out.println("minimal element for");
		
		for (int i = 0; i < matrix.length; i++) {
			int min = matrix[i][0];
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] < min) {
					min = matrix[i][j];
				}
			}
			
			// try to be clever ;-)
			String suffix = "th";
			
			if (i == 0) {
				suffix = "st";
			} else if (i == 1) {
				suffix = "nd";
			} else if (i == 2) {
				suffix = "rd";
			}
			
			System.out.println((i + 1) + suffix + " row : " + min);
		}
	}
}
