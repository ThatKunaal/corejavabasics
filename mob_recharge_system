import java.util.Scanner;
void main(String[] args) {
    long pin=1234, phone = 9691803018L, walletBalance = 399;
    Scanner sc = new Scanner(System.in);
    System.out.println("==============================================");
    System.out.println("==========[ Mobile Recharge System ]==========");
    System.out.println("==============================================");
    System.out.print("Enter Your Mobile Number : ");
    long userPhone = sc.nextLong();
    System.out.print("Enter Your Pin : ");
    long userPin = sc.nextLong();

    if(pin == userPin && userPhone==phone){
        System.out.println("======[ Services ]======");
        System.out.println("1. Check Balance\n2. Recharge Mobile\n3. Buy Data Pack\n4. Change Pin\n5. Exit");
        System.out.println();
        System.out.print("Enter Your Choice : ");
        int choice = sc.nextInt();

        if (choice==1){
            System.out.println("Your Balance Is : ₹" + walletBalance);
            System.out.println("Thankyou For Choosing Airtel, Have A Good Day");

        } else if (choice==2) {
            System.out.println("===[ Available Packs ]===");
            System.out.println("1. ₹199\n    1GB/Day, Unlimited Calling, Netflix For 3 Months");
            System.out.println("2. ₹299\n    1.5GB/Day, Unlimited Calling, Netflix For 4 Months");
            System.out.println("3. ₹349\n    2GB/Day, Unlimited Calling, Netflix For 6 Months");
            System.out.println("4. ₹399\n    2.5GB/Day, Unlimited Calling, Netflix For 3 Months, Jio Hotstar For 2 Months");
            System.out.println("5. ₹499\n    Unlimited 4G+5G Data, Unlimited Calling, Netflix For 3 Months, Jio Hotstar For 2 Months");
            System.out.println();
            System.out.print("Enter Your Choice : ");
            int choice2 = sc.nextInt();
            System.out.println();

            if (choice2==1 && walletBalance>=199){
                System.out.println("✓ Recharge Successful\n" +
                        "Your mobile recharge Of ₹199 has been completed.\n" +
                        "Have a great day!");
                walletBalance -= 199;
                System.out.println("Updated Balance Is : "+walletBalance);

            } else if (choice2==2 && walletBalance>=299) {
                System.out.println("✓ Recharge Successful\n" +
                        "Your mobile recharge Of ₹299 has been completed.\n" +
                        "Have a great day!");
                walletBalance -= 299;
                System.out.println("Updated Balance Is : "+walletBalance);
            } else if (choice2==3 && walletBalance>=349) {
                System.out.println("✓ Recharge Successful\n" +
                        "Your mobile recharge Of ₹349 has been completed.\n" +
                        "Have a great day!");
                walletBalance -= 349;
                System.out.println("Updated Balance Is : "+walletBalance);
            } else if (choice2==4 && walletBalance>=399) {
                System.out.println("✓ Recharge Successful\n" +
                        "Your mobile recharge Of ₹399 has been completed.\n" +
                        "Have a great day!");
                walletBalance -= 399;
                System.out.println("Updated Balance Is : "+walletBalance);
            } else if (choice2==5 && walletBalance>=499) {
                System.out.println("✓ Recharge Successful\n" +
                        "Your mobile recharge Of ₹499 has been completed.\n" +
                        "Have a great day!");
                walletBalance -= 499;
                System.out.println("Updated Balance Is : "+walletBalance);
            }else {
                System.out.println("Please Select Valid Plan Or Check Your Wallet Balance");
            }
        } else if (choice==3) {
            System.out.println("===[ Available Data Packs ]===");
            System.out.println("1. ₹22\n 1GB Valid For 24 Hrs");
            System.out.println("2. ₹49\n Unlimited Data For 1 Hr");
            System.out.println("3. ₹98\n Unlimited Data For 24 Hrs");
            System.out.println("4. ₹129\n 25GB Data Vaid For 10 Days");
            System.out.println("5. ₹449\n 30GB Data Valid For 30 Days + Hotstar Subscription For 1 Month");
            System.out.println();
            System.out.print("Enter Your Choice : ");
            int choice3 = sc.nextInt();
            System.out.println();

            if (choice3==1 && walletBalance>=22){
                System.out.println("✓ Recharge Successful\n" +
                        "Your mobile recharge Of ₹22 has been completed.\n" +
                        "Have a great day!");
                walletBalance -= 22;
                System.out.println("Updated Balance Is : "+walletBalance);
            } else if (choice3==2 && walletBalance>=49) {
                System.out.println("✓ Recharge Successful\n" +
                        "Your mobile recharge Of ₹49 has been completed.\n" +
                        "Have a great day!");
                walletBalance -= 49;
                System.out.println("Updated Balance Is : "+walletBalance);
            } else if (choice3==3 && walletBalance>=99) {
                System.out.println("✓ Recharge Successful\n" +
                        "Your mobile recharge Of ₹98 has been completed.\n" +
                        "Have a great day!");
                walletBalance -= 98;
                System.out.println("Updated Balance Is : "+walletBalance);
            } else if (choice3==4 && walletBalance>=129) {
                System.out.println("✓ Recharge Successful\n" +
                        "Your mobile recharge Of ₹129 has been completed.\n" +
                        "Have a great day!");
                walletBalance -= 129;
                System.out.println("Updated Balance Is : "+walletBalance);
            } else if (choice3==5 && walletBalance>=449) {
                System.out.println("✓ Recharge Successful\n" +
                        "Your mobile recharge Of ₹499 has been completed.\n" +
                        "Have a great day!");
                walletBalance -= 449;
                System.out.println("Updated Balance Is : "+walletBalance);
            }else {
                System.out.println("Please Enter Valid Choice Or Check Your Wallet Balance");
            }
        } else if (choice==4) {
            System.out.print("Enter The Old Pin : ");
            userPin = sc.nextLong();
            if (userPin==pin){
                System.out.print("Enter The New Pin : ");
                pin = sc.nextLong();
                System.out.println("Your Pin Has Been Updated Succesfully");
            }else {
                System.out.println("Entered Pin Does Not Match With Tha Old Pin !!");
            }
        } else if (choice==5) {
            System.out.println("You Have Been Logged Out Succesfully");
            System.out.println("Thankyou For Using Airtel Services");

        }else {
            System.out.println("Please Enter Valid A Choice");
        }
    }else {
        System.out.println("Entered Pin Or Phone Is Incorrect !!");
    }

}
