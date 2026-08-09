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
