
/**
 * @author Драган Ћајић <cajic_dragan@yahoo.com>
 * @datetime 3:35 AM April 9, 2021
 * @description Minimal element of individual row of matrix.
 */
public class Matrix {

	public static void main(String[] args) {
		
		int[][] matrix = {
			{1, 9, 3, 4, 1},
			{3, 2, 7, 6, 1},
			{4, 5, 7, 9, 3},
			{3, 2, 9, 5, 6}
		};
		
		System.out.println("matrix: " + matrix.length + " x " + matrix[0].length);
		
		for (int i = 0; i < matrix.length; i++) {
			int min = matrix[i][0];
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] < min) {
					min = matrix[i][j];
				}
			}
			
			// try to be clever ;-)
			String suffix = "th";
			
			switch (i) {
				case 0:
					suffix = "st";
					break;
				case 1:
					suffix = "nd";
					break;
				case 2:
					suffix = "rd";
					break;
				default:
					break;
			}
			
			System.out.println((i + 1) + suffix + " row : " + min);
		}
	}
}
