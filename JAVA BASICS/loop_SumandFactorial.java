void main() {
//    Loop sum and fact Q1 ( Printing Sum Of A Number Series Range Given By User )
//    int sum=0;
//    Scanner sc = new Scanner(System.in);
//    System.out.println("Enter Your Ending Number : ");
//    int end_num = sc.nextInt();
//
//    for (int i=1; i<=end_num; i++){
//        sum = sum + i;
//    }
//    System.out.println("Sum = " + sum);

//==============================================================

//    Loop sum and fact Q2 ( Printing Sum Of Range Of Even Num Series Given By User )
//    int sum = 0;
//    Scanner sc = new Scanner(System.in);
//    System.out.println("Enter Your Starting Number : ");
//    int start_num = sc.nextInt();
//    System.out.println("Enter Your Ending Number : ");
//    int end_num = sc.nextInt();
//
//    for (int i=start_num; i<=end_num; i++){
//        if (i%2==0){
//            sum = sum+i;
//        }
//    }
//    System.out.println("Sum : "+sum);

//==============================================================

//    Loop sum and fact Q3 ( Printing Factorial Of A User Given Number )
//    int fact = 1;
//    Scanner sc = new Scanner(System.in);
//    System.out.print("Enter A Number : ");
//    int num = sc.nextInt();
//
//    for (int i=num; i>1; i--){
//        fact = fact*i;
//        System.out.print(i+" * ");
//    }
//    System.out.println("1 = "+fact);
//    System.out.println("Factorial Is : " +fact);

//==============================================================

//    Loop sum and fact Q4 ( Printing Number Of Numbers Char in A Given Number )
//    Scanner sc = new Scanner(System.in);
//    int count = 0;
//    System.out.println("Enter Your Number : ");
//    long num = sc.nextLong();
//
//    for (;num>0;){
//        num = num/10;
//        count++;
//    }
//    System.out.println(count);

//==============================================================

//    Loop sum and fact Q5 ( Printing Reverse Of A Given Number )
//    long rev = 0, digit;
//    Scanner sc = new Scanner(System.in);
//    System.out.println("Enter A Number : ");
//    long num = sc.nextLong();
//
//    for (;num>0;){
//        digit = num%10;
//        rev = rev * 10 + digit;
//        num = num/10;
//    }
//    System.out.println(rev);

//==============================================================

//    Loop sum and fact Q6 ( Printing Sum Of Digit In A Given Number )
//    long sum=0, digit, num;
//    Scanner sc = new Scanner(System.in);
//    System.out.println("Enter Your Number : ");
//    num = sc.nextLong();
//
//    for (; num>0;){
//        digit = num % 10;
//        sum = sum + digit;
//        num = num/10;
//    }
//    System.out.println("Your Sum Of Digit Is : "+sum);

//==============================================================

//    Loop sum and fact Q7 ( Palindrom Number Checker )
//    long rev=0, digit, og, num;
//    Scanner sc = new Scanner(System.in);
//    System.out.println("Enter Your Number To Check : ");
//    num = sc.nextLong();
//    og = num;
//
//    for (; num>0;){
//        digit = num%10;
//        rev = rev*10+digit;
//        num = num/10;
//    }
//    if (og==rev){
//        System.out.println("Palindrom Number");
//    }else {
//        System.out.println("Not A Palindrom Number");
//    }

//==============================================================

//    Loop sum and fact Q8 ( Armstrong Number Checker )
//    long sum=0, digit, cube, num, og;
//    Scanner sc = new Scanner(System.in);
//    System.out.println("Enter Your Number To Check : ");
//    num = sc.nextLong();
//    og = num;
//
//    for (; num>0;){
//        digit = num%10;
//        cube = digit*digit*digit;
//        sum = sum + cube;
//        num = num/10;
//    }
//    if (sum==og){
//        System.out.println("Armstrong Number Detected");
//    }else{
//        System.out.println("No Armstrong Number Detected");
//    }

//==============================================================

//    Loop sum and fact Q9 ( Printing Febonacci Series )
//    int terms, first=0, second=1, next;
//    Scanner sc = new Scanner(System.in);
//    System.out.print("Enter Number Of Terms : ");
//    terms = sc.nextInt();
//    if (terms>=2){
//        System.out.print("0 1");
//
//        for (int i=3; i<=terms; i++){
//            next = first+second;
//            first = second;
//            second = next;
//            System.out.print(" "+next);
//        }
//    } else if (terms==1) {
//        System.out.println("0");
//    }else {
//        System.out.println("Enter Any Non Zero Value");
//    }
}