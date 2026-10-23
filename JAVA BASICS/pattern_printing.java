import java.util.Scanner;
void main() {
////  ==========================================================

////  Square Star Pattern
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter How Many Stars : ");
    long m = sc.nextLong();
    System.out.print("Enter How Many Lines To Print : ");
    long n = sc.nextLong();
    long i,j;

    for (j=1; j<=n; j++){
        for (i=1; i<=m; i++){
            System.out.print("*");
        }
        System.out.println();
    }

////  ===========================================================

////  Right Angle Triangle Pattern
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Number Of Stars To Go To : ");
    long n = sc.nextLong();
    long i,j;

    for (i = 1; i <= n; i++) {
        for (j = 1; j <= i; j++) {
            System.out.print("*");
        }
        System.out.println();
    }

////  ==============================================================

////  Reverse Right Angle Triangle Pattern
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Number Of Stars To Start With : ");
    long n = sc.nextLong();
    long i,j;
    for (i=1; i<=n; i++){
        for (j=n; j>=i; j--){
            System.out.print("* ");
        }
    }
    System.out.println();

////  ==============================================================

////  Increasing Pyramid Of Number Series
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter The Range Of Series : ");
    long n = sc.nextLong();
    long i,j;
    for (i=1; i<=n; i++){
        for (j=1; j<=i; j++){
            System.out.print(j+" ");
        }
        System.out.println();
    }

////  ==============================================================

////  Decreasing Pyramid Of Number Series
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Number: ");
    long n = sc.nextLong();
    long i=1,k;

////  ==============[ Using For Loop ]==============
    for (long i = 1; i <= n; i++) {
        for (long k = 1; k <= n - i + 1; k++) {
            System.out.print(k+" ");
        }
        System.out.println();
    }
////  ==============================================

////  =============[ Using While Loop ]=============
    while (i<=n){
        long j=1;
        while (j<=n-i+1){
            System.out.print(j);
            j++;
        }
        i++;
        System.out.println();
    }
////  ==============================================

//    ================================================================================

//    Printing Continuous Number Pattern Pyramid
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Number Of Digits Till Where To Print : ");
    long n = sc.nextLong();
    long num = 1,i,j;

    for (i=1; i<=n; i++){
        for (j=1; j<=i; j++){
            System.out.print(num);
            num++;
        }
        System.out.println();
    }

////  ================================================================================
//
////  Pyramid Star Pattern
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Number Of Layers In Pyramid : ");
    long n = sc.nextLong();
    long i,j,k;

    for (i=1; i<=n; i++){
////     ===[ For Printing Spaces ]===
        for (j=1; j<=n-i; j++){
            System.out.print(" ");
        }

////    ===[ For Printing Stars ]===
        for (k=1; k<=2*i-1; k++){
            System.out.print("*");
        }
        System.out.println();
    }

////    =========================================================================

////    Printing Hollow Box Star Pattern
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter The Size Of Box In Number Of Stars : ");
    long n = sc.nextLong();
    long i,j;

    for (i=1; i<=n; i++){
        if (i==1){
            for (j=1; j<=n; j++){
                System.out.print("*");
            }

        } else if (i==n) {
            for (j=1; j<=n; j++){
                System.out.print("*");
            }

        }else {
            for (j=1; j<=n; j++){
                if (j==1){
                    System.out.print("*");
                } else if (j==n) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
        }
        System.out.println();
    }

////    ========================================================================

////    Floyd,s Triangle Pattern
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter The Range Of Digits To Print : ");
    long n = sc.nextLong();
    long i,j,num=1;

    for (i=1; i<=n; i++){
        for (j=1; j<=i; j++){
            System.out.print(num);
            System.out.print(" ");
            num++;
        }
        System.out.println();
    }

////  =========================================================================

////    Diamond Star Pattern
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Width Of Diamond In Number Of Stars : ");
    long n = sc.nextLong();
    long i, j, k;

    for (i = 1; i <= n; i++) {
        if (i < n) {
            for (j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for (k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
        }
        System.out.println();
    }
    for (i = n - 1; i >= 1; i--){
        for (j = 1; j <= n - i; j++) {
            System.out.print(" ");
        }

        for (k = 1; k <= 2 * i - 1; k++) {
            System.out.print("*");
        }
        System.out.println();
    }

///    ======================================================

///   Butterfly Pattern 🦋
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Width Of Butterfly In Number Of Rows : ");
    long n = sc.nextLong();
    long i,j;

    if (n%2==0){
        for (i=1; i<=n/2; i++){
            for (j=1; j<=i; j++){
                System.out.print("*");
            }
            for (j=1; j<=n-2*i; j++){
                System.out.print(" ");
            }
            for (j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for (i=n/2-1; i>=1; i--) {
            for (j=1; j<=i; j++) {
                System.out.print("*");
            }
            for (j=1; j<=n-2*i; j++) {
                System.out.print(" ");
            }
            for (j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }else {
        for (i=1; i<=n/2; i++){
            for (j=1; j<=i; j++){
                System.out.print("*");
            }
            for (j=1; j<=n-2*i; j++){
                System.out.print(" ");
            }
            for (j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for (j=1; j<=n; j++){
            System.out.print("*");
        }
        System.out.println();

        for (i=n/2; i>=1; i--) {
            for (j=1; j<=i; j++) {
                System.out.print("*");
            }
            for (j=1; j<=n-2*i; j++) {
                System.out.print(" ");
            }
            for (j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

///   ================================================================

///   Hollow Wings Butterfly Pattern
///    *        *
///    **      **
///    * *    * *
///    *  *  *  *
///    *   **   *
///    *   **   *
///    *  *  *  *
///    * *    * *
///    **      **
///    *        *


    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Width Of Butterfly As Number Of Stars: ");
    long n = sc.nextLong();

    long i, j;
//
//// Upper half
    for (i = 1; i <= n / 2; i++) {

        if (i <= 2) {
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }

            for (j = 1; j <= n - 2 * i; j++) {
                System.out.print(" ");
            }

            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
        } else {
            System.out.print("*");

            for (j = 1; j <= i - 2; j++) {
                System.out.print(" ");
            }

            System.out.print("*");

            for (j = 1; j <= n - 2 * i; j++) {
                System.out.print(" ");
            }

            System.out.print("*");

            for (j = 1; j <= i - 2; j++) {
                System.out.print(" ");
            }

            System.out.print("*");
        }

        System.out.println();
    }
//
//// Lower half
    for (i = n / 2; i >= 1; i--) {

        if (i <= 2) {
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }

            for (j = 1; j <= n - 2 * i; j++) {
                System.out.print(" ");
            }

            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
        } else {
            System.out.print("*");

            for (j = 1; j <= i - 2; j++) {
                System.out.print(" ");
            }

            System.out.print("*");

            for (j = 1; j <= n - 2 * i; j++) {
                System.out.print(" ");
            }

            System.out.print("*");

            for (j = 1; j <= i - 2; j++) {
                System.out.print(" ");
            }

            System.out.print("*");
        }

        System.out.println();
    }

//    ====================================================================

//    Hour Glass Pattern
//    *********
//     *******
//      *****
//       ***
//        *
//       ***
//      *****
//     *******
//    *********

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Number Of Rows: ");
    long n = sc.nextLong();
    long i, j;

    for (i = n; i >= 1; i--) {
        for (j = 1; j <= n - i; j++) {
            System.out.print(" ");
        }
        for (j = 1; j <= 2 * i - 1; j++) {
            System.out.print("*");
        }
        System.out.println();
    }

    for (i = 2; i <= n; i++) {
        for (j = 1; j <= n - i; j++) {
            System.out.print(" ");
        }
        for (j = 1; j <= 2 * i - 1; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
