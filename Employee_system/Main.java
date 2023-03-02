import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Programmer-Manager system");
        String transactions = "Transactions..\n"
                + "1. programmer\n"
                + "2. manager\n"
                + "'q' for quit system";
        System.out.println("******************************");
        System.out.println(transactions);
        System.out.println("******************************");

        while (true) {
            System.out.println("Select the transaction: ");
            String transaction = scanner.nextLine();

            if (transaction.equals("q")) {
                System.out.println("Exiting the system...");
                break;
            } else if (transaction.equals("1")) {
                programmer myProgrammer = new programmer("Sefa", "ALANUR", 2020, new String[]{"Java", "C#", "Python"});
                String programmer_transaction = "1.Format\n"
                        + "2.Display data\n"
                        + "'q' for quit";
                System.out.println(programmer_transaction);
                while (true) {
                    System.out.println("Select transaction: ");
                    String P_transaction = scanner.nextLine();
                    if (P_transaction.equals("q")) {
                        System.out.println("Exiting programmer page..");
                        break;
                    } else if (P_transaction.equals("1")) {
                        System.out.println("Operating System: ");
                        String operatingSystem = scanner.nextLine();
                        myProgrammer.formatIt(operatingSystem);
                    } else if (P_transaction.equals("2")) {
                        myProgrammer.display();
                    } else {
                        System.out.println("Invalid input!");
                    }
                }
            } else if (transaction.equals("2")) {
                manager myManager = new manager("Harun", "ALANUR", 1, 10);
                String programmer_transaction = "1.Raise salary\n"
                        + "2.Display data\n"
                        + "'q' for quit";
                System.out.println(programmer_transaction);
                while (true) {
                    System.out.println("Select transaction: ");
                    String P_transaction = scanner.nextLine();
                    if (P_transaction.equals("q")) {
                        System.out.println("Exiting programmer page..");
                        break;
                    } else if (P_transaction.equals("1")) {
                        System.out.println("How much raise you want?");
                        int raiseAmount = scanner.nextInt();
                        myManager.raiseSalary(raiseAmount);
                    } else if (P_transaction.equals("2")) {
                        myManager.display();
                    } else {
                        System.out.println("Invalid input!");
                    }
                }

            } else {
                System.out.println("Invalid input!");
            }
        }
    }
}