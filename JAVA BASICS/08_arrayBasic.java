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

//  ===========================================================

//  Q6) Find The Second Largest Number In An Array
    int[] arr = {12, 45, 7, 89, 34, 89, 21};
    int index = 0;
    int largest_digit = arr[0], digit, second_largest = 0;

    while(index< arr.length){
        digit = arr[index];
        if (digit > largest_digit){
            second_largest = largest_digit;
            largest_digit = digit;
        }else if(digit > second_largest && digit < largest_digit) {
            second_largest = digit;
        }
        index++;
    }
    System.out.println("Second Largest Digit In This Array Is : "+second_largest);

//  ===========================================================

//    Q7) Find Sum And Average Of The Elements Of An Array
    int[] arr = {12, 25, 8, 15, 40, 10};
    int i = 0, sum = 0;
    while(i < arr.length){
        sum = sum + arr[i];
        i++;
    }

    float avg = (float) (sum)/arr.length;

    System.out.println("Sum Of The Array is : "+sum);
    System.out.println("Average Of The Array is : "+avg);

//  ============================================================

//    Q8) Count The Frequency Of Target Element
    int[] arr = {4, 7, 2, 7, 9, 7, 3, 2, 7, 5};
    int i = 0, frequency = 0, target = 7;
    while(i < arr.length){
        if (arr[i]==target){
            frequency++;
        }
        i++;
    }
    System.out.println("Frequency Of The Target Digit = "+frequency);

//  ============================================================

//    Q9) Finding Maximum And Minimum Number In An Array
    int[] arr = {34, 12, 89, 5, 67, 23, 91, 8};
    int i = 0, maxNum = arr[0], minNum = arr[0];
    while(i < arr.length){
        if (arr[i] > maxNum){
            maxNum = arr[i];
        }

        if (arr[i] < minNum){
            minNum = arr[i];
        }
        i++;
    }
    System.out.println("Largest Element = "+maxNum);
    System.out.println("Smallest Element = "+minNum);

//  ===========================================================

//    Q10) Checking Wether An Array Is Shorted Or Not
    int[] arr = {3, 7, 12, 18, 26, 31, 46};
    boolean asc = true, desc = true;
    int i = 1;
    while(i < arr.length){
        if (arr[i-1] < arr[i]) {
            desc = false;

        } else if (arr[i-1] > arr[i]) {
            asc = false;

        }
        i++;
    }
    if (asc){
        System.out.println("Array Is Sorted In Ascending Order");
    }else if(desc) {
        System.out.println("Array Is Sorted In Descending Order");
    }else {
        System.out.println("Array Is Not Sorted");
    }
}

// =============================================================

// Q5 Delete A Given Number From An Array And Display The New Array
void main(){
    Scanner sc = new Scanner(System.in);
    int[] arr5 = utilityScanner();
    System.out.print("Enter The Element To Delete : ");
    int digit = sc.nextInt();

    int count = occurrenceFinding(arr5, digit);
    System.out.print("Your New Array Is : ");
    int[] arrNew = deleteNumber(arr5, digit, count);
    displayArr(arrNew);
}

// Counts The Number Of Occurrences Of The Number To Be Deleted From The Array :
public static int occurrenceFinding(int[] arr5, int digit){
    int i = 0,count = 0;
    while(i < arr5.length){
        if (arr5[i]==digit){
            count++;
        }
        i++;
    }
    return count;
}

// Deletes The Desired Number From The Array
public static int[] deleteNumber(int[] arr5, int digit, int count){
//  Generating New Array (arrNew)
    int size = arr5.length;
    int[] arrNew = new int[size - count];

//  Deleting The Number From The Old Array (arr5)
    int i = 0,j = 0;
    while(i < arr5.length){
        if (arr5[i] != digit){
            arrNew[j] =  arr5[i];
            j++;
        }
        i++;
    }

//  Return The New Array
    return arrNew;
}

// Displays The New Array
public static void displayArr(int[] arrNew){
    int i = 0;
    while(i < arrNew.length){
        System.out.print(arrNew[i]+" ");
        i++;
    }
}

// =============================================================

// Q6 Reverse An Array And Display
void main(){
    System.out.println("=== Reversing An Array ===");

    int[] arr6 = utilityScanner();

    System.out.print("Reverse Of The Array Is : ");
    int[] revArr = revArr(arr6);
    displayArr(revArr);
}

// Reversing The Array
public static int[] revArr(int[] arr6){
    int[] revArr = new int[arr6.length];
    int i = arr6.length-1,j = 0;
    while(i >= 0){
        revArr[j] = arr6[i];
        i--;
        j++;
    }

    return revArr;
}

// Display The Reversed Array
public static void displayArr(int[] revArr){
    int i = 0;
    while(i < revArr.length){
        System.out.print(revArr[i]+" ");
        i++;
    }
}

// =============================================================

// Q7 Checking An Array Is Palindrome Or Not
//--------{ First Method }--------
void main(){
    int[] arr7 = utilityScanner();

    int[] revArr = revArr(arr7);
//    displayArr(revArr);

    boolean isPalindrome = palindromeCheck(revArr, arr7);
    if (isPalindrome){
        System.out.println("This Array Is A Palindrome Array");
    }else {
        System.out.println("This Array Is Not A Palindrome Array");
    }
}

// Reverses And Return The Reversed Array
public static int[] revArr(int[] arr7){
    int[] arrRev = new int[arr7.length];
    int i = arr7.length-1,j = 0;
    while(i >= 0){
        arrRev[j] = arr7[i];
        i--;
        j++;
    }
    return arrRev;
}

/ Display Reversed Array
public static void displayArr(int[] arrRev){
    int i = 0;
    while(i < arrRev.length){
        System.out.print(arrRev[i]+" ");
        i++;
    }
}

// Checking Palindrome Array
public static boolean palindromeCheck(int[] arrRev, int[] arr7){
    boolean isPalindrome = true;
    int i = 0;
    while(i < arrRev.length){
        if (arrRev[i] != arr7[i]){
            isPalindrome = false;
        }
        i++;
    }
    return isPalindrome;
}
