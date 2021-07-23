// ~ Cyclically shifting elements
// ~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-
// cyclically shift the elements of the array to the right

import java.util.Scanner;

/**
 * £ Dragan Ćajić @ JetBrains Academy
 *
 * @author Драган Ћајић <cajic_dragan@yahoo.com>
 * @datetime 11:57 PM July 23, 2021
 * @description Cyclically shifting elements.
 */
class ShiftingElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int size = scanner.nextInt();
        
        int[] a = new int[size];
        
        for (int i = 0; i < size; i++) {
            a[i] = scanner.nextInt();
        }
        /*
        for (int element : a) {
            System.out.print(element + " ");
        }
        */
        //System.out.println();
        
        int temp = a[size - 1];
        int[] b = new int[size];
        b[0] = temp;
        /*
        for (int i = 1; i < size; i++) {
            b[i] = a[i - 1];
        }
        */
        System.arraycopy(a, 0, b, 1, size - 1);
        
        for (int element : b) {
            System.out.print(element + " ");
        }
    }
}
