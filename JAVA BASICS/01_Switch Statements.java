import java.sql.SQLOutput;
import java.util.Scanner;
void main() {
    Scanner sc = new Scanner(System.in);
    System.out.println("======[ Welcome To The Admission Portal ]======");
    System.out.println();
    System.out.println("1.BTECH\n2.BCA\n3.BBA");
    System.out.println();
    System.out.println("===============================================");
    System.out.print("CHOOSE THE COURSE YOU WANT TO PURSUE : ");
    int choice = sc.nextInt();
    System.out.println();
    switch (choice){

        case 1:
            System.out.println("==============================\n" +
                    "Course : B.Tech (Computer Science)\n" +
                    "\n" +
                    "Duration : 4 Years\n" +
                    "\n" +
                    "Total Fees : ₹6,80,000\n" +
                    "\n" +
                    "Eligibility :\n" +
                    "• 10+2 (PCM)\n" +
                    "• Minimum 60% Marks\n" +
                    "\n" +
                    "Seats Available : 120\n" +
                    "\n" +
                    "Admission Status : Open\n" +
                    "==============================");
             System.out.print("Do You Want To Enroll In This Course (Y/N) : ");
            sc.nextLine();
            String choice2 = sc.nextLine();
            choice2 = choice2.toLowerCase();

            if (choice2.startsWith("y")){
                System.out.println();
                System.out.println("==================================================");
                System.out.println("ENTER YOUR DETAILS");
                System.out.print("Name : ");
                String sname = sc.nextLine();
                System.out.print("Fathers Name : ");
                String fname = sc.nextLine();
                System.out.print("Age : ");
                int age = sc.nextInt();

                System.out.print("DOB [dd/mm/yyyy] : ");
                String dob = sc.next();

                System.out.println();
                System.out.print("Print Receipt (Y/N) : ");
                String choice3 = sc.next();

                if (choice3.equalsIgnoreCase("Y")) {
                    System.out.println("============== RECEIPT ==============");
                    System.out.println("Student Name : " + sname);
                    System.out.println("Father Name  : " + fname);
                    System.out.println("Age          : " + age);
                    System.out.println("DOB          : " + dob);
                    System.out.println("Receipt No.  : 23456");
                    System.out.println("Course       : B.Tech");
                    System.out.println("Batch        : 2024-2028");
                    System.out.println("=====================================");
                } else {
                    System.out.println("!! Please Print The Receipt !!");
                }
            break;

            }
    }       
}
