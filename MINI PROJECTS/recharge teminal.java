import java.util.Scanner;

public class MobileRechargeSimulator {

    public static void main(String[] args) {

        long pin = 1234;
        long phone = 9691803018L;
        long walletBalance = 399;

        Scanner sc = new Scanner(System.in);

        System.out.println("==============================================");
        System.out.println("==========[ Mobile Recharge System ]==========");
        System.out.println("==============================================");

        System.out.print("Enter Your Mobile Number : ");
        long userPhone = sc.nextLong();

        System.out.print("Enter Your Pin : ");
        long userPin = sc.nextLong();

        if (pin == userPin && userPhone == phone) {

            System.out.println("\n======[ Services ]======");
            System.out.println("1. Check Balance");
            System.out.println("2. Recharge Mobile");
            System.out.println("3. Buy Data Pack");
            System.out.println("4. Change Pin");
            System.out.println("5. Exit");

            System.out.print("\nEnter Your Choice : ");
            int choice = sc.nextInt();

            if (choice == 1) {

                System.out.println("Your Wallet Balance : ₹" + walletBalance);
                System.out.println("Thank You For Choosing Airtel. Have A Good Day!");

            } else if (choice == 2) {

                System.out.println("\n===[ Available Recharge Packs ]===");
                System.out.println("1. ₹199");
                System.out.println("   1GB/Day, Unlimited Calling, Netflix For 3 Months");
                System.out.println();

                System.out.println("2. ₹299");
                System.out.println("   1.5GB/Day, Unlimited Calling, Netflix For 4 Months");
                System.out.println();

                System.out.println("3. ₹349");
                System.out.println("   2GB/Day, Unlimited Calling, Netflix For 6 Months");
                System.out.println();

                System.out.println("4. ₹399");
                System.out.println("   2.5GB/Day, Unlimited Calling, Netflix For 3 Months, Jio Hotstar For 2 Months");
                System.out.println();

                System.out.println("5. ₹499");
                System.out.println("   Unlimited 4G + 5G Data, Unlimited Calling, Netflix For 3 Months, Jio Hotstar For 2 Months");

                System.out.print("\nEnter Your Choice : ");
                int choice2 = sc.nextInt();

                if (choice2 == 1 && walletBalance >= 199) {

                    walletBalance -= 199;

                    System.out.println("\n✓ Recharge Successful");
                    System.out.println("Your mobile recharge of ₹199 has been completed.");
                    System.out.println("Updated Balance : ₹" + walletBalance);

                } else if (choice2 == 2 && walletBalance >= 299) {

                    walletBalance -= 299;

                    System.out.println("\n✓ Recharge Successful");
                    System.out.println("Your mobile recharge of ₹299 has been completed.");
                    System.out.println("Updated Balance : ₹" + walletBalance);

                } else if (choice2 == 3 && walletBalance >= 349) {

                    walletBalance -= 349;

                    System.out.println("\n✓ Recharge Successful");
                    System.out.println("Your mobile recharge of ₹349 has been completed.");
                    System.out.println("Updated Balance : ₹" + walletBalance);

                } else if (choice2 == 4 && walletBalance >= 399) {

                    walletBalance -= 399;

                    System.out.println("\n✓ Recharge Successful");
                    System.out.println("Your mobile recharge of ₹399 has been completed.");
                    System.out.println("Updated Balance : ₹" + walletBalance);

                } else if (choice2 == 5 && walletBalance >= 499) {

                    walletBalance -= 499;

                    System.out.println("\n✓ Recharge Successful");
                    System.out.println("Your mobile recharge of ₹499 has been completed.");
                    System.out.println("Updated Balance : ₹" + walletBalance);

                } else {

                    System.out.println("Please Select a Valid Plan or Check Your Wallet Balance.");
                }

            } else if (choice == 3) {

                System.out.println("\n===[ Available Data Packs ]===");
                System.out.println("1. ₹22  - 1GB Valid For 24 Hours");
                System.out.println("2. ₹49  - Unlimited Data For 1 Hour");
                System.out.println("3. ₹98  - Unlimited Data For 24 Hours");
                System.out.println("4. ₹129 - 25GB Data Valid For 10 Days");
                System.out.println("5. ₹449 - 30GB Data + Hotstar (1 Month)");

                System.out.print("\nEnter Your Choice : ");
                int choice3 = sc.nextInt();

                if (choice3 == 1 && walletBalance >= 22) {

                    walletBalance -= 22;

                    System.out.println("\n✓ Recharge Successful");
                    System.out.println("Your Data Pack of ₹22 has been activated.");
                    System.out.println("Updated Balance : ₹" + walletBalance);

                } else if (choice3 == 2 && walletBalance >= 49) {

                    walletBalance -= 49;

                    System.out.println("\n✓ Recharge Successful");
                    System.out.println("Your Data Pack of ₹49 has been activated.");
                    System.out.println("Updated Balance : ₹" + walletBalance);

                } else if (choice3 == 3 && walletBalance >= 98) {

                    walletBalance -= 98;

                    System.out.println("\n✓ Recharge Successful");
                    System.out.println("Your Data Pack of ₹98 has been activated.");
                    System.out.println("Updated Balance : ₹" + walletBalance);

                } else if (choice3 == 4 && walletBalance >= 129) {

                    walletBalance -= 129;

                    System.out.println("\n✓ Recharge Successful");
                    System.out.println("Your Data Pack of ₹129 has been activated.");
                    System.out.println("Updated Balance : ₹" + walletBalance);

                } else if (choice3 == 5 && walletBalance >= 449) {

                    walletBalance -= 449;

                    System.out.println("\n✓ Recharge Successful");
                    System.out.println("Your Data Pack of ₹449 has been activated.");
                    System.out.println("Updated Balance : ₹" + walletBalance);

                } else {

                    System.out.println("Please Select a Valid Data Pack or Check Your Wallet Balance.");
                }

            } else if (choice == 4) {

                System.out.print("Enter Your Old PIN : ");
                long oldPin = sc.nextLong();

                if (oldPin == pin) {

                    System.out.print("Enter New PIN : ");
                    pin = sc.nextLong();

                    System.out.println("PIN Changed Successfully.");

                } else {

                    System.out.println("Entered PIN Does Not Match Your Old PIN.");
                }

            } else if (choice == 5) {

                System.out.println("You Have Been Logged Out Successfully.");
                System.out.println("Thank You For Using Airtel Services.");

            } else {

                System.out.println("Invalid Choice.");
            }

        } else {

            System.out.println("Entered Mobile Number or PIN is Incorrect.");
        }

        sc.close();
    }
}
