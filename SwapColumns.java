// ~ Swap the columns
// ~-~-~-~-~-~-~-~-~-
// Swap the columns with entered indexes within the matrix.

import java.util.Scanner;

/**
 * £ Dragan Ćajić @ JetBrains Academy
 *
 * @author Драган Ћајић <cajic_dragan@yahoo.com>
 * @datetime 12:12 AM August 1, 2021
 * @description Swap the columns of the matrix.
 */
class SwapColumns {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
    
        System.out.print("Enter matrix dimensions [n x m]: ");
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        
        int[][] matrix = new int[n][m];
    
        System.out.println("Enter matrix elements [press ENTER for new row!]:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        //printMatrix(matrix);
    
        System.out.println("Enter column indexes for columns to swap:");
        int colon1 = scanner.nextInt();
        int colon2 = scanner.nextInt();
        
        // check / validate entered column indexes
        // TODO You can make function too, e.g. validateColumns(int[][], i, j)
        while (true) {
            if (colon1 >= m || colon2 >= m) {
                System.out.println("Enter columns again!");
                colon1 = scanner.nextInt();
                colon2 = scanner.nextInt();
            } else {
                break;
            }
        }
        
        // TODO Refactor to function, e.g. void swapColumns(int[][], column1, column2)
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (j == colon1) {
                    int tempElement = matrix[i][colon2];
                    matrix[i][colon2] = matrix[i][j];
                    matrix[i][j] = tempElement;
                }
            }
        }
        System.out.println("Matrix with swapped columns is:");
        printMatrix(matrix);
    }
    
    public static void printMatrix(int[][] matrix2D) {
        for (int[] row : matrix2D) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println(); // proceed to next row
        }
    }
}
