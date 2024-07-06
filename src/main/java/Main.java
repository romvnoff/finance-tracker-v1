import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        FinanceTracker tracker = new FinanceTracker();


        while (true) {
            System.out.println("\nPersonal Finance Tracker");
            System.out.println("1. Add Income");
            System.out.println("2. Add Expense");
            System.out.println("3. View Balance");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter income amount");
                    double income = scanner.nextDouble();
                    tracker.addIncome(income);
                    break;
                case 2:
                    System.out.println("Enter expense");
                    double expence = scanner.nextDouble();
                    tracker.addExpence(expence);
                    break;
                case 3:
                    tracker.printBalance();
                    break;
                case 4:
                    System.out.println("See you later");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}

