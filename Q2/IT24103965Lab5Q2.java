import java.util.Scanner;

public class IT24103965Lab5Q2 {
    public static void main(String[] args) {
        // Create a Scanner object for keyboard input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to input the number of new members
        System.out.print("Enter the number of new members introduced: ");
        int newMembers = scanner.nextInt();

        // Validate the input
        if (newMembers < 0) {
            System.out.println("Invalid input. The number of new members should be 0 or more.");
        } else {
            // Determine the prize using a switch statement
            String prize;
            switch (newMembers) {
                case 0:
                    prize = "No Prize";
                    break;
                case 1:
                    prize = "Pen";
                    break;
                case 2:
                    prize = "Umbrella";
                    break;
                case 3:
                    prize = "Bag";
                    break;
                case 4:
                    prize = "Travelling Chair";
                    break;
                default:
                    prize = "Headphone";
            }

            // Display the prize
            System.out.println("You are entitled to: " + prize);
        }

        // Close the scanner
        scanner.close();
    }
}
