// How To Initiate An 2D Array
// =====================================
// int[][] myArr = new int[2][3];
// OR                Rows<-|  |->Columns
// int[][] myArr = {{2,3,4}, {5,6,7}}
// =====================================

void main() {
//    Q1) Initialization Of An 2D Array
//   [ Initialization Of 2D Array ]
   int[][] myArr = new int[3][3];
//
//   [ Assigning Values To The 2D Array ]
   myArr[0][0] = 1;
   myArr[0][1] = 2;
   myArr[0][2] = 3;
   myArr[1][0] = 4;
   myArr[1][1] = 5;
   myArr[1][2] = 6;
   myArr[2][0] = 7;
   myArr[2][1] = 8;
   myArr[2][2] = 9;
//
//   [ Printing Values From The 2D Array ]
   System.out.println(myArr[0][0]);
   System.out.println(myArr[0][1]);
   System.out.println(myArr[0][2]);
   System.out.println("===============");
   System.out.println(myArr[1][0]);
   System.out.println(myArr[1][1]);
   System.out.println(myArr[1][2]);
   System.out.println("===============");
   System.out.println(myArr[2][0]);
   System.out.println(myArr[2][1]);
   System.out.println(myArr[2][2]);
//
//   [ Other Attributes ]
   System.out.println("===============");
   System.out.println("The Length Of The Second Row Is : "+myArr[1].length);

//  ================================================================================

//    Q2) Printing 2D Array Using Traversal Method
    int[][] myArr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    int i = 0;
    while(i < myArr.length){
        int j = 0;
        while (j < myArr[i].length){
            System.out.print(myArr[i][j]+"  ");
            j++;
        }
        i++;
        System.out.println();
    }  
}
