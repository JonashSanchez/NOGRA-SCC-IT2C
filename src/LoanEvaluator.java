import java.util.Scanner;

public class LoanEvaluator {

    // Method to evaluate loan based on user input
    public void evaluateLoan() {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object to read input from the console

        // Collecting user inputs
        System.out.print("Enter Credit Score (0-850): ");
        int creditScore = scanner.nextInt(); // Read an integer input for credit score

        System.out.print("Enter Annual Income (in PHP): ");
        double annualIncome = scanner.nextDouble(); // Read a double input for annual income

        System.out.print("Enter Existing Debt (in PHP): ");
        double existingDebt = scanner.nextDouble(); // Read a double input for existing debt

        // Checking if all criteria are met
        if (creditScore >= 700 && annualIncome >= 300000 && existingDebt <= (0.5 * annualIncome)) {
            System.out.println("Loan Approved"); // Loan is approved if all criteria are met
        } else {
            System.out.println("Loan Denied"); // Loan is denied if any criterion is not met
        }
    }
}
