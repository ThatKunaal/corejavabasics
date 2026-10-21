import java.util.Scanner;

import static java.lang.Math.pow;

void main() {
//    Printing Number Series
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Your Number : ");
    long num = sc.nextLong();
    long i=1;
    do {
        System.out.println(i);
        i++;
    }while (i<=num);

//    =========================================================================
//
//    Printing Reverse Of A Given Number
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Your Number : ");
    long num = sc.nextLong();
    long rev = 0;
    do {
        long digit = num%10;
        rev = rev*10+digit;
        num = num/10;
    }while (num>0);
    System.out.print(rev);

//    =========================================================================

//    Printing Sum Of All The Digits In A Number
    Scanner  sc = new Scanner(System.in);
    System.out.print("Enter Your Number : ");
    long num = sc.nextLong();
    long sum = 0;
    do {
        long digit = num%10;
        sum = sum + digit;
        num = num/10;
    }while (num>0);
    System.out.println(sum+" Is The Sum Of Digits Of Given Number");

//    ==========================================================================

//    Counting Number Of Even And Odd Digits In A Number
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Your Number : ");
    long num = sc.nextLong();
    long even_count=0, odd_count=0;
    do {
        long digit = num%10;
        if (digit%2 == 0){
            even_count++;
        }else {
            odd_count++;
        }
        num = num/10;
    }while (num>0);
    System.out.println("Total Number Of Even Numbers : "+even_count);
    System.out.println("Total Number Of Odd Numbers : "+odd_count);

//    ========================================================================

//    Finding Factorial Of A Number
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Your Number : ");
    long num = sc.nextLong();
    long i=1,fact=1;
    do {
        fact = fact*num;
        num--;
    }while (num>0);
    System.out.println(fact);

//    ========================================================================

//    Printing Table Of A Given Number
    Scanner sc = new Scanner(System.in);
    System.out.println("====[ Table Printer ]====");
    System.out.print("Enter Your Number To Print : ");
    long num = sc.nextLong();
    long i=1,mult;
    do {
        mult = num*i;
        System.out.println(num+" * "+i+" = "+mult);
        i++;
    }while (i<=10);

//    =========================================================================

//    Counting Number Of Digits In A Given Number
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Your Number : ");
    long num = sc.nextLong();
    long count=0;
    do {
        long digit = num%10;
        num = num/10;
        count++;
    }while (num>0);
    System.out.println(count);

//    ========================================================================= Pushed To Github !!

//    Checking Palindrome Number
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Your Number : ");
    long num = sc.nextLong();
    long og = num;
    long rev=0;
    do {
        long digit = num%10;
        rev = rev*10+digit;
        num = num/10;
    }while (num>0);
    System.out.println("Reverse Of The Number is : " +rev);

    if (og == rev){
        System.out.println("Its A Palindrome Number");
    }else {
        System.out.println("Its Not A Palindrome Number");
    }

//    ==========================================================================

//    Checking Armstrong Number
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Your Number : ");
    long num = sc.nextLong();
    long og1 = num;
    long og2 = num, sum = 0;
    long count = 0;
    do {
        long digit = num%10;
        num = num/10;
        count++;
    }while (num>0);

    do {
        long digit = og1%10;
        long cube = (long) Math.pow(digit,count);
        sum = sum+cube;
        og1 = og1/10;
    }while (og1>0);

    if (sum == og2){
        System.out.println("Armstrong Number");
    }else {
        System.out.println("Not An Armstrong Number");
    }

//    =======================================================================

////    Checking Strong Number
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Your Number To Check : ");
    long num = sc.nextLong();
    long og = num;
    long sum = 0;
    do {
        long fact = 1;
        long digit1 = num%10;

//      ====={ Loop For Factorial }=====
        do {
            fact = fact*digit1;
            digit1--;
        }while (digit1>0);
//      ================================

        sum = sum + fact;
        num = num/10;
    }while (num>0);

    if (sum == og){
        System.out.println("Strong Number");
    }else {
        System.out.println("Not A Strong Number");
    }

//    =======================================================================

//    Check Automorphic Number
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Your Number : ");
    long num = sc.nextLong();
    long og = num;
    long num_square = num*num, count = 0, pow_count;
    do {
        num = num/10;
        count++;
    }while(num>0);

    long divisor = (long) Math.pow(10,count);
    long digit2 = num_square%divisor;

    if (og == digit2){
        System.out.println("Automorphic");
    }else {
        System.out.println("Not Automorphic");
    }

//    =====================================================================

//    Target Number Frequency Counter
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Your Number : ");
    long num = sc.nextLong();
    System.out.print("Enter Your Target Number : ");
    long target = sc.nextLong();
    long digit, count = 0;
    do {
        digit = num%10;
        if (digit == target){
            count++;
        }
        num = num/10;
    }while (num>0);

    System.out.println("Frequency Of "+target+" Is "+count);

//    ======================================================================

//    Finding The Largest Number
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Your Number : ");
    long num = sc.nextLong();
    long og = num;
    long digit,largest_num;
    largest_num = num%10;
    do {
        digit = og%10;
        if (digit>largest_num){
            largest_num = digit;
        }
        og = og/10;
    }while(og>0);
    System.out.println(largest_num+" Is The Largest Digit");

//    ========================================================================

//    Finding The Smallest Number
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Your Number : ");
    long num = sc.nextLong();
    long smallest_digit = num%10,digit;
    do {
        digit = num%10;
        if (digit<smallest_digit){
            smallest_digit = digit;
        }
        num = num/10;
    }while(num>0);
    System.out.println(smallest_digit);

//    ========================================================================

//    Counting Number Of Zeros In A Number
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Your Number : ");
    long num = sc.nextLong();
    long count=0, digit;
    do {
        digit = num%10;
        if (digit == 0){
            count++;
        }
        num = num/10;
    }while(num>0);
    System.out.println("Number Of Zeros : "+count);

//    ======================================================================

//    Sum Of Even Position Digits
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Your Number : ");
    long num = sc.nextLong();
    long count = 1, count2 = 0, count1 = 0, og = num,digit,sum = 0;

    do {
        og = og/10;
        count1++;
    }while (og>0);

    if (count1%2 == 0){
        do {
            digit = num%10;

            if (count2%2==0){
                sum = sum + digit;
            }
            num = num/10;
            count2++;
        }while (num>0);
    }else {
        do {
            digit = num%10;

            if (count%2==0){
                sum = sum + digit;
            }
            num = num/10;
            count++;
        }while (num>0);
    }

    System.out.println(sum);

}
