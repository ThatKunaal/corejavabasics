import java.util.Scanner;

public class AtmSimulator {

    public static void main(String[] args) {

        long pin = 123456, amountInitial = 20000000, newPin;
        String userName = "Kunal";

        Scanner sc = new Scanner(System.in);

        System.out.println("======[ Welcome To State Bank Of India ]======");
        System.out.print("Enter Your Pin : ");
        long pinUser = sc.nextLong();

        System.out.print("Enter Username : ");
        String name = sc.next();

        if (pinUser == pin && name.equalsIgnoreCase(userName)) {

            System.out.println("---------------------------------------------------");
            System.out.println("Welcome " + name);
            System.out.println();
            System.out.println("=================================================");
            System.out.println("Choose Your Service");
            System.out.println("=================================================");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("5. Change Pin");
            System.out.println("--------------------------------------------------");

            System.out.print("Enter Your Choice : ");
            int choice = sc.nextInt();

            if (choice == 1) {

                // Balance Check
                System.out.println("Your Balance Is : $" + amountInitial);
                System.out.println("Transaction Successful");

            } else if (choice == 2) {

                // Deposit
                System.out.print("Enter Amount : ");
                long amount = sc.nextLong();

                if (amount > 0) {
                    amountInitial += amount;

                    System.out.println("Amount Deposited Successfully");
                    System.out.println("Total Balance Is : $" + amountInitial);
                    System.out.println("Transaction Successful");

                } else {
                    System.out.println("Invalid Amount");
                    System.out.println("Transaction Failed");
                }

            } else if (choice == 3) {

                // Withdraw
                System.out.print("Enter Amount : ");
                long amount = sc.nextLong();

                if (amount > 0 && amount <= amountInitial) {

                    amountInitial -= amount;

                    System.out.println("Amount Withdrawn Successfully");
                    System.out.println("Total Balance Is : $" + amountInitial);
                    System.out.println("Transaction Successful");

                } else {
                    System.out.println("Invalid Amount");
                    System.out.println("Transaction Failed");
                }

            } else if (choice == 4) {

                // Exit
                System.out.println("You Have Been Logged Out");
                System.out.println("Thank You For Visiting SBI Banking Services");

            } else if (choice == 5) {

                // Change PIN
                System.out.print("Enter The Old Pin : ");
                pinUser = sc.nextLong();

                if (pinUser == pin) {

                    System.out.print("Enter The New Pin : ");
                    newPin = sc.nextLong();

                    pin = newPin;

                    System.out.println("Your PIN Has Been Changed Successfully");
                    System.out.println("Your New PIN Is : " + newPin);
                    System.out.println("Transaction Successful");

                } else {

                    System.out.println("Entered PIN Does Not Match Old PIN");
                    System.out.println("Transaction Failed");
                }

            } else {

                System.out.println("Invalid Choice");
            }

        } else {

            System.out.println("Entered PIN or Username Is Incorrect");
            System.out.println("Transaction Failed");
        }

        sc.close();
    }
}
