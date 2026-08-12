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

           
}
