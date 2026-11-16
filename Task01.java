
import java.util.Scanner;

public class Task01 {

    public static void main(String[] args) {

        // Create Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Declare an integer array with 10 elements
        int[] arr = new int[10];

        // Ask the user to enter 10 integers
        System.out.println("Enter 10 integers:");

        // Store the 10 integers in the array
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }

        // Display the elements of the array in normal order
        System.out.println("\nArray elements in normal order:");

        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i] + " ");
        }

        // Display the elements of the array in reverse order
        System.out.println("\n\nArray elements in reverse order:");

        for (int i = 9; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }

        // Close the Scanner
        sc.close();
    }
}
