// How To Initiate An Array
// ===================================================================
/// 1) int[] myInts = new int[10];
//  This Will Initiate An Array With Internal Space Of 10 Elements,
//  Without Giving Any Values Means They Are Of Blank Space.
//  Last Index = 09; Array Length = 10.

/// 2) int[] myInts = {1,2,3,4,5,6,7,8,9,10};
//  This Will Initiate An Array With Internal Space Of 10 Elements,
//  With Some Values Means No Blank Array Space.
//  Last Index = 09; Array Length = 10.

/// int[] = Type Of Array; long, int, string etc.
/// myInts = Name Of Array (Variable).
/// int[10] = Array Data Type.
/// 10 = Number Of Elements Inside Array.
// ===================================================================

import java.util.Scanner;
void main() {
//  ==================================================================
//    Q1) Assign An Array Of Length 5 Elements By Both Ways With Values { 10,2,3,6,5 }
//  ----[ First Way Of Initiating An Array ]----
//  [ Initiating An Array ]===========
    int[] firstArray = new int[5];

//  [ Assigning Values ]===========
    firstArray[0] = 10;
    firstArray[1] = 2;
    firstArray[2] = 3;
    firstArray[3] = 6;
    firstArray[4] = 5;

//  [ Printing Values Of Array ]===========
    System.out.println(firstArray[3]);
    System.out.println(firstArray[4]);
    System.out.println(firstArray[0]);
    System.out.println(firstArray[2]);

//  ----[ Second Way Of Initiating An Array ]----
//  [ Initiating An Array ]===========
    int[] secondArray = {10, 2, 3, 6, 5};

//  [ Printing Values Of Array ]===========
    System.out.println(firstArray[3]);
    System.out.println(firstArray[4]);
    System.out.println(firstArray[0]);
    System.out.println(firstArray[2]);

//  ==========================================================

//  Q2) Print Values Of A Given Array Using Array Traversal Method ( Loop )
//  ----[ Array Traversal Method ]----
    int[] thirdArray = {10, 9, 8, 7, 6, 5};
    int index = 0;
    while(index<6){
        System.out.println(thirdArray[index]);
        index++;
    }

//  ==========================================================

//  Q3) Create A Program To Search And Element Inside An Array
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Your Target Number : ");
    int target = sc.nextInt();
    int[] myArr0 = {10, 2, 4, 3, 6};
    boolean isFound = false;
    int index = 0, digit;
    while(index<=4 && !isFound){
        digit = myArr[index];
        if (digit==target) {
            isFound = true;
        }else {
            index++;
        }

    }
    if (isFound){
        System.out.println("!! Bingo !! Number Is Found At Index : "+index);
        System.out.println("Position Of Your Number Is : "+(index+1));
    }else {
        System.out.println("Sadly Your Number Was Not Found");
    }

//  ===========================================================

//  Q4) Program To Find The Frequency Of A Number In An Array
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Your Target Element : ");
    int target = sc.nextInt();

    int[] myArr1 = {1,7,8,9,8,7,3,4,2,3,4,1,9,8,7,2,5,6,7,8,1,2,9,0,4,5,6};
    int index = 0, digit, frequency = 0;
    boolean isFound = false;

    while(index < myArr1.length){
        digit = myArr1[index];
        if (digit==target){
            isFound = true;
            frequency++;
        }
        index++;
    }
    if (isFound){
        System.out.println("!! Bingo !! Your Number Was Found In This Array");
        System.out.println("Frequency Of This Number Is : " + frequency);
    }else {
        System.out.println("Your Number Was Not Found In This Array !!");
    }

//  ===========================================================

//  Q5) Finding Largest Number In An Array
   int[] arr = {12, 45, 7, 89, 34, 89, 21};
   int index = 0, digit;
   int largest_digit = arr[index], frequency = 0;

   while(index < arr.length){
       digit = arr[index];
       if (digit>largest_digit){
           largest_digit = digit;
           frequency=1;
       }else if (digit==largest_digit){
           frequency++;
       }
       index++;
   }

   System.out.println("Largest Digit In This Array Is : "+largest_digit);
   System.out.println("Frequency Of Largest Digit Is : "+frequency);
}


