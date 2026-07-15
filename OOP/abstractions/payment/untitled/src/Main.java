//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
import payments.paaymode;
import payments.mode;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        paaymode pay;
        mode mode;

        System.out.println("Select payment method: \n 1. gcash \n 2. maya \n 3. maya \n 4. exit");
        int choice  = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter payment amount: ");
                double amount = scanner.nextDouble();
                mode = new mode();
                mode.payment("gcash", amount);

                break;
            case 2:
                System.out.print("Enter payment amount: ");
                amount = scanner.nextDouble();
                mode = new mode();
                mode.payment("maya", amount);
                break;
            case 3:
                System.out.print("Enter payment amount: ");
                amount = scanner.nextDouble();
                mode = new mode();
                mode.payment("uniondigital", amount);
                break;
            case 4:
                System.out.println("Exiting...");
                System.exit(0);
            default:
                System.out.println("Invalid choice. Please try again.");
        }
        scanner.close();

    }
}