void main() {
//    While Loop Q1 ( Printing Number Series From 1-10 )
    int i = 1;
    while(i <= 10){
        System.out.println(i);
        i++;
    }

//===============================================================

//    While Loop Q2 ( Printing Reverse Series From 10-1 )
    int i = 10;
    while(i>=1){
        System.out.println(i);
        i--;
    }

//===============================================================

//    While Loop Q3 ( Printing Even Number From 1-50 )
    int i = 2;
    while(i<=50){
        System.out.println(i);
        i+=2;
    }

//===============================================================

//    While Loop Q4 ( Printing User Defined Number Series )
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Your Number : ");
    int target = sc.nextInt();
    int i=1;
    while(i <= target ){
        System.out.println(i);
        i++;
    }

//===============================================================

//    While Loop Q5 ( User Input Multiplication Table )
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Your Number : ");
    System.out.println("============================");
    int num = sc.nextInt();
    int i = 1;
    while(i<=10){
        System.out.println(num + " * " + i + " = " + i*num);
        i++;
    }

//===============================================================

//    While Loop Q6 ( Take A Target From User & Print Sum Of Series )
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Your Target : ");
    int target = sc.nextInt();
    int i = 1, sum=0;

    while (i<target){
        sum=sum+i;
        System.out.print(i+" + ");
        i++;
    }
    sum = sum + target;
    System.out.println(target + " = " + sum);

//===============================================================

//    While Loop Q7 ( Factorial )
    Scanner sc = new Scanner(System.in);
    int fact = 1;
    System.out.print("Enter Your Number : ");
    int num = sc.nextInt();
    int i = num;

    while (i>=1){
        fact = fact * i;
        System.out.print(i);

        if (i>1){
            System.out.print(" * ");
        }
        i--;
    }
    System.out.print(" = "+fact);    

//===============================================================

//    While Loop Q8 ( Counting Digit In A Number )
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Your Number : ");
    long num = sc.nextLong();
    int count = 0;
    while(num>0){
        num = num/10;
        count++;
    }
    System.out.println("Number Of Digits = " + count);

//===============================================================

//    While Loop Q9 ( Reverse a Number )
    Scanner sc = new Scanner(System.in);
    long rev = 0;
    System.out.print("Enter Your Number To Reverse : ");
    long num = sc.nextLong();
    while (num > 0) {
        long digit = num % 10;
        rev = rev * 10 + digit;
        num = num / 10;
    }
    System.out.print("Reverse = " + rev);    

//===============================================================

//    While Loop Q10 ( Palindrom Number Checker )
    Scanner sc = new Scanner(System.in);
    long num,digit,og,rev=0;
    System.out.println("Enter Your Number To Check : ");
    num = sc.nextLong();
    og=num;

    while(num>0){
        digit = num%10;
        rev = rev*10+digit;
        num = num/10;
    }
    if (rev==og){
        System.out.println("Palindrom");
    }else {
        System.out.println("NoT Palindrom");
    }

//===============================================================

//    While Loop Q11 ( Sum Of Even Digit In A Number )
   Scanner sc = new Scanner(System.in);
   System.out.print("Enter Your Number : ");
   long num = sc.nextLong();
   long sum = 0;
   while(num>0){
       long digit = num%10;
       num = num/10;
       if(digit%2==0){
           sum=sum+digit;
       }
   }
   System.out.println("Sum of Even Is = "+sum);

//===============================================================

//    While Loop Q12 ( Count No Of Even & Odd Digits In A number )
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter Your Number : ");
   long num = sc.nextLong();
   long even_count=0,odd_count=0;
   while(num>0){
       float digit = num%10;
       num = num/10;
       if (digit%2==0 || digit==0){
           even_count++;
       }else {
           odd_count++;
       }
   }
   System.out.println("Even Count = "+even_count);
   System.out.println("Odd Count = "+odd_count);

//===============================================================

//    While Loop Q13 ( Finding Smallest Digit In A Number )
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter A Number : ");
   long num = sc.nextLong();
   long smallest = num%10;
   while(num>0){
       long digit = num%10;
       if (digit<smallest){
           smallest = digit;
       }
       num = num/10;
   }
   System.out.println(smallest);

//===============================================================

//    While Loop  Q14 ( Finding Largest Digit In A Number )
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter Your Number : ");
   long num = sc.nextLong();
   long largest = 0;

   while (num>0){
       long digit = num%10;

       if (digit>largest){
           largest = digit;
       }
       num = num/10;
   }
   System.out.println("Largest Digit Is : "+largest);

//===============================================================

//    While Loop Q15 ( Finding The Second-Largest Digit )
   Scanner sc = new Scanner(System.in);
   System.out.print("Enter Your Number : ");
   long num = sc.nextLong();
   long largest = 0,second_largest = 0;

   while(num>0){
       long digit = num%10;
       if (digit>largest){
           second_largest = largest;
           largest = digit;
       } else if (digit>second_largest) {
           second_largest = digit;
       }
       num = num/10;
   }
   System.out.println("Second Largest Is : "+second_largest);

//===============================================================

//    While Loop Q16 ( Finding Frequency Of A Digit In A Number )
   Scanner sc = new Scanner(System.in);
   System.out.print("Enter Your Number : ");
   long num = sc.nextLong();
   System.out.print("Enter Digit To Find Frequency : ");
   long dig = sc.nextLong();
   long digit,count=0;
   while (num>0){
       digit = num%10;

       if (digit==dig){
           count++;
       }

       num = num/10;
   }
   System.out.println("Number Of "+dig+"'s In This Number Is : "+count);

//===============================================================

//    While Loop Q17 ( Finding Frequency Of The Largest Number In A Number )
   Scanner sc = new Scanner(System.in);
   System.out.print("Enter Your Number : ");
   long num = sc.nextLong();
   long og  = num;
   long largest = 0,dig,count=0;
   while(num>0){
       dig = num%10; 
       if(dig > largest){
           largest = dig;
       }
       num = num/10;
   }

   while(og>0){
       long digit = og%10;
       if (digit==largest){
           count++;
       }
       og = og/10;
   }
   System.out.println("Largest Digit Is : "+largest);
   System.out.println("Frequency of Largest No. Is : "+count);

//===============================================================

//    While Loop Q18 ( Finding Sum Of Digits At Even Place In Num )
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Your Number : ");
    long num = sc.nextLong();
    long og = num;
    long sum = 0,count=0;

    while(num>0){
        num = num/10;
        count++;
    }

    if (count%2==0){
        while(og>0){    //1234 { Even Number Of Digit Case }
            long digit = og%100;
            long digit2 = digit%10;
            System.out.println(" "+digit2);
            sum = sum+digit2;
            og = og/100;
        }
    }else{
        while(og>0){   //12345 { Odd Number Of Digit Case }
            long digit = og%100;
            long digit2 = digit/10;
            System.out.println(" "+digit2);
            sum = sum+digit2;
            og = og/100;
        }
    }
    System.out.println("Sum Of Even Index Digit Is : "+sum);
    
//===============================================================

//    While Loop Q19 ( Finding Sum Of Even And Odd Digits In A Number )
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Your Number : ");
    long num = sc.nextLong();
    long even_sum = 0, even_count = 0, odd_sum = 0,odd_count = 0, digit, count=0;

    while (num>0){
        digit = num%10;
        if (digit%2==0){
            even_count++;
            even_sum = even_sum + digit;
        }else {
            odd_count++;
            odd_sum = odd_sum + digit;
        }
        num = num/10;
        count++;
    }
    System.out.println("Total Number Of Odd Digits : "+odd_count);
    System.out.println("Total Sum Of Odd Digits : "+odd_sum);
    System.out.println("Total Number Of Even Digits : "+even_count);
    System.out.println("Total Sum Of Even Digits : "+even_sum);
    System.out.println("Total Number Of Digits : "+count);

//===============================================================

//    While Loop Q20 ( Product Of All Digits In A Number )
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Your Number : ");
    long num = sc.nextLong();
    long prod = 1, digit;

    while(num>0){
        digit = num%10;
        prod = prod*digit;
        num = num/10;
    }
    System.out.println("Product Is : "+prod);
