import java.util.Scanner;

public class IT24103965Lab5Q1 {
    public static void main(String[] args) {
        // Create a Scanner object for keyboard input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter three different integers
        System.out.println("Enter three different integers:");
        System.out.print("First integer: ");
        int num1 = input.nextInt();
        System.out.print("Second integer: ");
        int num2 = input.nextInt();
        System.out.print("Third integer: ");
        int num3 = input.nextInt();

        // Compute the smallest and largest numbers
        int smallest = Math.min(num1, Math.min(num2, num3));
        int largest = Math.max(num1, Math.max(num2, num3));

        // Display the results
        System.out.println("The smallest number is: " + smallest);
        System.out.println("The largest number is: " + largest);

        // Close the scanner
        Scanner close;
    }
}
