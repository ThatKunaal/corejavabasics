import java.util.Scanner;
void main(){
    menuDrivenProgram();
}

// [ Menu Driven Program Caller ]
public void menuDrivenProgram(){
    long choice;
    do {
        listOfOperations();
        choice = choiceInput();
        operationsInAction(choice);
    }while(choice!=0);
}

// [ List Of Operations We Can Perform By This Software ]
public void listOfOperations(){
    System.out.println();
    System.out.println("====================================");
    System.out.println("=======[ List Of Operations ]=======");
    System.out.println("1-Multiplication Table");
    System.out.println("2-Even Odd Number Checker");
    System.out.println("3-Maximum Of Three Number Checker");
    System.out.println("4-Power Calculator");
    System.out.println("5-Factorial Calculator");
    System.out.println("6-Prime Number Checker");
    System.out.println("7-Palindrome Number Checker");
    System.out.println("0-Exit");
    System.out.println("====================================");
}

// [ All The Triggers To Make Operations In Action ]
public void operationsInAction(long choice){
    if (choice==1){
        long num = oneInput();
        multTable(num);
    } else if (choice==2) {
        long num = oneInput();
        evenOdd(num);
    } else if (choice==3) {
        long[] nums = threeInput();
        findMaxOf3(nums[0], nums[1], nums[2]);
    } else if (choice==4) {
        System.out.println("-------------------------------------------");
        System.out.println("Enter Base As First Number");
        System.out.println("Enter Power As Second Number");
        long[] nums = twoInput();
        powerCalculator(nums[0], nums[1]);
    } else if (choice==5) {
        long num = oneInput();
        factorialCalculator(num);
    } else if (choice==6) {
        long num = oneInput();
        primeChecker(num);

    } else if (choice==7) {
        long num = oneInput();
        palindromeChecker(num);
    } else if (choice==0) {
        System.out.println("!! Thankyou For Using This Calculator !!");
    }
}

//==============================================================
// [ This Section Is For The Inputs Taken By User ]
//==============================================================
// [ This Takes Choice As Input From User ]
public long choiceInput(){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Your Choice : ");
    long choice = sc.nextLong();
    return choice;
}
//-----------------------------------------------
// [ Taking One Input From User ]
public long oneInput(){
    System.out.println("-------------------------------------------");
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Your Number : ");
    long n = sc.nextLong();
    System.out.println("-------------------------------------------");
    return n;
}
//-----------------------------------------------
// [ Taking Two Input From User ]
public long[] twoInput(){
    System.out.println("-------------------------------------------");
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Your First Number : ");
    long n1 = sc.nextLong();
    System.out.print("Enter Your Second Number : ");
    long n2 = sc.nextLong();
    System.out.println("-------------------------------------------");
    return new long[]{n1,n2};
}
//-----------------------------------------------
public long[] threeInput(){
    System.out.println("-------------------------------------------");
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Your First Number : ");
    long n1 = sc.nextLong();
    System.out.print("Enter Your Second Number : ");
    long n2 = sc.nextLong();
    System.out.print("Enter Your Third Number : ");
    long n3 = sc.nextLong();
    System.out.println("-------------------------------------------");
    return new long[]{n1,n2,n3};
}

//==============================================================
// [ This Section Is For The Operations Methods ]
//==============================================================
// [ 01 - Multiplication Table ]
public void multTable(long num){
    System.out.println("Table Of "+num);
    System.out.println();
    long i=1;
    while(i<=10){
        long mult = num*i;
        System.out.println(num+" * "+i+" = "+mult);
        i++;
    }
}
//-----------------------------------------------
// [ 02 - Even Odd Checker ]
public void evenOdd(long num){
    if (num%2==0){
        System.out.println(num+" Is Even");
    }else {
        System.out.println(num+" Is Odd");
    }
}
//-----------------------------------------------
// [ 03 - Max Of 3 Number ]
public void findMaxOf3(long n1, long n2, long n3){
    if (n1>n2 && n1>n3){
        System.out.println(n1+" Is Greater Than "+n2+" & "+n3);
    } else if (n2>n1 && n2>n3) {
        System.out.println(n2+" Is Greater Than "+n1+" & "+n3);
    } else if (n3>n1 && n3>n2) {
        System.out.println(n3+" Is Greater Than "+n1+" & "+n2);
    }else {
        System.out.println("All Three Numbers Are Equal");
    }
}
//-----------------------------------------------
// [ 04 - Power Calculator ]
public void powerCalculator(long base, long exponent){
    if(exponent<0){
        System.out.println("Negative Exponents Are Not Supported");
        return;
    }
    long result=1;
    long i=1;
    while(i<=exponent){
        result=result*base;
        i++;
    }
    System.out.println("Result : "+result);
}
//-----------------------------------------------
// [ 05 - Factorial Calculator ]
public void factorialCalculator(long num){
    long fact=1;
    while(num>0){
        fact = fact*num;
        num--;
    }
    System.out.println("Factorial : "+fact);
}
//-----------------------------------------------
// [ 06 - Prime Number Checker ]
public void primeChecker(long num){
    boolean isPrime = true;

    if (num<2){
        isPrime=false;
    }else {
        for (int i=2; i<=num-1; i++){
            if (num%i == 0){
                isPrime = false;
            }
        }
    }

    if (isPrime) {
        System.out.println("!! Number Is Prime !!");
    }else {
        System.out.println("!! Number Is Not Prime !!");
    }
}
//-----------------------------------------------
// [ 07 - Palindrome Number Checker ]
public void palindromeChecker(long num){
    long rev  = 0,og=num;
    while(num>0){
        long digit = num%10;
        rev = rev*10+digit;
        num = num/10;
    }

    if (og==rev){
        System.out.println("Palindrome Number");
    }else {
        System.out.println("Not A Palindrome Number");
    }
}
//==============================================================


