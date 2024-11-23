import java.util.Scanner;

public class IT24103965Lab5Q3 { 
    public static void main(String[] args) {
        // Constants
        final double ROOM_CHARGE = 48000.0;
        final int DISCOUNT_DAYS_1 = 3;
        final int DISCOUNT_DAYS_2 = 5;
        final double DISCOUNT_RATE_1 = 10.0; // 10%
        final double DISCOUNT_RATE_2 = 20.0; // 20%

        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter start date (1-31): ");
        int startDate = scanner.nextInt();
        System.out.print("Enter end date (1-31): ");
        int endDate = scanner.nextInt();

        // Validations
        if (startDate < 1 || startDate > 31 || endDate < 1 || endDate > 31) {
            System.out.println("Error: Dates must be between 1 and 31.");
            return;
        }
        if (startDate >= endDate) {
            System.out.println("Error: Start date must be less than end date.");
            return;
        }

        // Calculate days and discount
        int days = endDate - startDate;
        double discountRate = (days >= DISCOUNT_DAYS_2) ? DISCOUNT_RATE_2 : 
                              (days >= DISCOUNT_DAYS_1) ? DISCOUNT_RATE_1 : 0.0;

        // Calculate total cost
        double totalCost = days * ROOM_CHARGE;
        double discount = totalCost * (discountRate / 100);
        double finalCost = totalCost - discount;

        // Output
        System.out.println("Days reserved: " + days);
        System.out.println("Total cost: Rs " + totalCost);
        System.out.println("Discount: Rs " + discount);
        System.out.println("Amount to pay: Rs " + finalCost);

        scanner.close();
    }
}
