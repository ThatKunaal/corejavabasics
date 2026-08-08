import java.util.Scanner;
void main() {
    Scanner sc = new Scanner(System.in);
    System.out.println();
    System.out.println("========[ Welcome To The Hotel Mariot ]========");
    System.out.println("             Hotel Booking System");
    System.out.println("===============================================");
    System.out.println();
    System.out.println("1. Standard Room\n2. Delux Room");
    System.out.println();
    System.out.print("Enter Your Choice : ");
    int choice0 = sc.nextInt();
    System.out.println();

    switch (choice0){
        case 1:
            System.out.println("==============================");
            System.out.println("Room : Standard\n" +
                    "\n" +
                    "Price/Night : ₹1,999\n" +
                    "\n" +
                    "Facilities :\n" +
                    "✓ Free WiFi\n" +
                    "✓ AC\n" +
                    "✓ TV\n" +
                    "✓ Complimentary Breakfast\n" +
                    "\n" +
                    "Rooms Available : 18\n" +
                    "\n" +
                    "Booking Status : Available");
            System.out.println();
            System.out.println("==============================");
            System.out.print("Do You Want To Book (Y/N) : ");
            sc.nextLine();
            String choice1 = sc.nextLine();
            choice1 = choice1.toLowerCase();

            if (choice1.startsWith("y")){
                System.out.println();
                System.out.println("======[ Registration Form ]======");
                System.out.print("Enter Your Name : ");
                String cname = sc.nextLine();
                System.out.print("Enter Your Age : ");
                int cage = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter Your Phone : ");
                String cphone = sc.nextLine();
                System.out.print("No. Of Days : ");
                int cdays = sc.nextInt();
                int totalamnt = 1999*cdays;

                System.out.println();
                System.out.println("============= BOOKING RECEIPT =============");
                System.out.println("Guest Name : "+cname);
                System.out.println("Age : "+cage);
                System.out.println("Phone : "+cphone);
                System.out.println();
                System.out.println("Room : Standard");
                System.out.println("Nights : "+cdays);
                System.out.println("Total Amount : ₹"+totalamnt);
                System.out.println();
                System.out.println("Booking Id : 9876");
                System.out.println();
                System.out.println("Thankyou For Choosing Our Hotel");
                System.out.println("===========================================");
            }else {
                System.out.println("Thankyou For Your Visit, Have a Good Day");
            }
        break;

        case 2:
            System.out.println("==============================");
            System.out.println("Room : Deluxe\n" +
                    "\n" +
                    "Price/Night : ₹3,499\n" +
                    "\n" +
                    "Facilities :\n" +
                    "✓ Free WiFi\n" +
                    "✓ AC\n" +
                    "✓ TV\n" +
                    "✓ Complimentary Breakfast\n" +
                    "\n" +
                    "Rooms Available : 12\n" +
                    "\n" +
                    "Booking Status : Available");
            System.out.println();
            System.out.println("==============================");
            System.out.print("Do You Want To Book (Y/N) : ");
            sc.nextLine();
            choice1 = sc.nextLine();
            choice1 = choice1.toLowerCase();

            if (choice1.startsWith("y")){
                System.out.println();
                System.out.println("======[ Registration Form ]======");
                System.out.print("Enter Your Name : ");
                String cname = sc.nextLine();
                System.out.print("Enter Your Age : ");
                int cage = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter Your Phone : ");
                String cphone = sc.nextLine();
                System.out.print("No. Of Days : ");
                int cdays = sc.nextInt();
                int totalamnt = 1999*cdays;

                System.out.println();
                System.out.println("============= BOOKING RECEIPT =============");
                System.out.println("Guest Name : "+cname);
                System.out.println("Age : "+cage);
                System.out.println("Phone : "+cphone);
                System.out.println();
                System.out.println("Room : Standard");
                System.out.println("Nights : "+cdays);
                System.out.println("Total Amount : ₹"+totalamnt);
                System.out.println();
                System.out.println("Booking Id : 9876");
                System.out.println();
                System.out.println("Thankyou For Choosing Our Hotel");
                System.out.println("===========================================");
            }else {
                System.out.println("Thankyou For Your Visit, Have a Good Day");
            }
        break;

        default:
            System.out.println("Select From The Options Above !!");
    }
}