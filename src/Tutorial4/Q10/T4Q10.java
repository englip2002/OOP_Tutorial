package Tutorial4.Q10;

import java.util.Scanner;

public class T4Q10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        Account acc1 = new Account(909, "Ali Baba", 1000);

        do {
            System.out.println("Main Menu");
            System.out.println("1: Check Balance");
            System.out.println("2: Cash In");
            System.out.println("3: Cash Out");
            System.out.println("4: Interest");
            System.out.println("5: Exit");
            System.out.print("Enter your choice:");
            choice = scanner.nextInt();

            switch (choice) {
                case 1: {
                    System.out.println("The balance is " + acc1.getbalance()+"\n");
                    break;
                }
                case 2: {
                    System.out.print("The amount of cash in: ");
                    acc1.cashIn(scanner.nextDouble());
                    System.out.println("");
                    break;
                }
                case 3: {
                    System.out.print("The amount of cash out: ");
                    acc1.cashOut(scanner.nextDouble());
                    System.out.println("");
                    break;
                }
                case 4: {
                    System.out.println("The amount of interst:" + acc1.calculateInterest()+"\n");
                    break;
                }
                case 5: {
                    break;
                }
                default:{
                    System.out.println("You have entered wrong message! Please Re-input\n");
                }

            }
        } while (choice != 5);

        scanner.close();
    }

}
