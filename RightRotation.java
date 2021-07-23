// ~ Right Rotation
// ~-~-~-~-~-~-~-~-
// Write a program that performs a right rotation on an array by a given number.

//import java.util.Arrays;
import java.util.Scanner;

/**
 * £ Dragan Ćajić @ JetBrains Academy
 *
 * @author Драган Ћајић <cajic_dragan@yahoo.com>
 * @datetime 12:19 AM July 24, 2021
 * @description Right rotation of an array by a given number.
 */
class RightRotation {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        
        //int[] a = {1, 2, 3, 4, 5}; // enumerated elements
        
        // How to determine the size of an arbitrary array?
        // Try this trick: numbers as strings
        // ~ hint by angelikaPawluk
        // https://hyperskill.org/profile/44380353
        
        System.out.println("Enter array of numbers:");
        String[] numbers = scanner.nextLine().split(" ");
        int size = numbers.length;
        //System.out.println("array size: " + size);
        
        int[] a = new int[size];
        
        for (int i = 0; i < size; i++) {
            a[i] = Integer.parseInt(numbers[i]);
        }
        /*
        // output created array of ints (int[] a)
        for (int number : a) {
            System.out.print(number + " ");
        }
        
        //System.out.println(); // empty line
        */
        // get number of rotations
        System.out.print("number of rotations: ");
        int numberOfRotations = scanner.nextInt();
    
        // hint by maherovic
        // https://hyperskill.org/profile/55934502
        numberOfRotations = numberOfRotations % size; // to pass all tests!
        
        // Right Rotation -> WORKS for known size of int[] a!
        //int size = a.length;
        int[] b = new int[size];
        
        for (int i = 0; i < numberOfRotations; i++) {
            
            for (int j = 1; j < size; j++) {
                int temp = a[size - 1];
                b[0] = temp;
                b[j] = a[j - 1];
            }
            System.arraycopy(b, 0, a, 0, size);
            //System.out.println("a: " + Arrays.toString(a));
        }
    
        System.out.println("right-shifted array:");
        
        // output right-shifted array of ints (int[] a)
        for (int number : a) {
            System.out.print(number + " ");
        }
    }
}
