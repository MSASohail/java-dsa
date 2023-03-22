// import java.util.Scanner;

// // Creation of 2D array

// public class TWODarray {
//     public static void main(String[] args) {
//         int matrix[][] = new int[3][3];
//         int n = matrix.length, m = matrix[0].length;
//         Scanner sc = new Scanner(System.in);
//         // input
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < m; j++) {
//                 matrix[i][j] = sc.nextInt();
//             }
//         }
//         // output
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < m; j++) {
//                 System.out.print(matrix[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }
// }

//Spiral matrix

// public class TWODarray {
// public static void spiralmatrix(int matrix[][]){
//     int startrow=0;
//     int startcol=0;
//     int endrow=matrix.length-1;
//     int endcol=matrix[0].length-1;
//     while (startrow<=endrow && startcol<=endcol) {
//         //top
//         for (int j = startcol; j <=endcol; j++) {
//             System.out.print(matrix[startrow][j]+" ");
//         }
//         //right
//         for (int i = startrow+1; i <= endrow; i++) {
//             System.out.print(matrix[i][endcol]+" ");
//         }
//         //bottom
//         for (int j =endcol-1 ; j >=startcol ; j--) {
//             if (startrow==endrow) {
//                 break;
//             }
//             System.out.print(matrix[endrow][j]+" ");
//         }
//         // left
//         for (int i = endrow-1; i>= startrow+1; i--) {
//             if (startcol==endcol) {
//                 break;
//             }
//             System.out.print(matrix[i][startcol]+" ");
//         }
//         startrow++;
//         startcol++;
//         endcol--;
//         endrow--;
//     }
//     System.out.println();
// }
//     public static void main(String[] args) {
//    int matrix[][]={{1,2,3,4},
//                      {5,6,7,8},
//                    {9,10,11,12},
//                 {13,14,15,16}};
//                    spiralmatrix(matrix);
//     }
// }

// Diagonal matrix(this is a BRUTE FORCE APPROCH)

// public class TWODarray {
// public static int Diagonalmatrix(int matrix[][]){
//     //primary diagonal
//     int sum=0;
//     for (int i = 0; i < matrix.length; i++) {
//         for (int j = 0; j < matrix[0].length; j++) {
//             if (i==j) {
//               sum+=matrix[i][j];  
//             }
//             else if(i+j==matrix.length-1){
//                 sum+=matrix[i][j];
//             }
//         }
//     }
//     return sum;
// }
//     public static void main(String[] args) {
//         int matrix[][]={{1,2,3,4},
//                              {5,6,7,8},
//                            {9,10,11,12},
//                         {13,14,15,16}
//                     };
//                     System.out.println(Diagonalmatrix(matrix));
//     }
// }

//this is the optimised approach

// public class TWODarray {
//     public static int Diagonalmatrix(int matrix[][]) {
//         int sum = 0;
//         for (int i = 0; i < matrix.length; i++) {
//             sum += matrix[i][i];
//             if (i != matrix.length - i - 1) {
//                 sum += matrix[i][matrix.length - 1 - i];
//             }
//         }
//         return sum;
//     }

//     public static void main(String[] args) {
//         int matrix[][] = { { 1, 2, 3, 4 },
//                 { 5, 6, 7, 8 },
//                 { 9, 10, 11, 12 },
//                 { 13, 14, 15, 16 }
//         };
//         System.out.println(Diagonalmatrix(matrix));
//     }
// }

//Search in a sorted matrix

// public class TWODarray {
// public static boolean searchsorted(int matrix[][],int key){
//     int row=0,col=matrix[0].length-1;
//     while (row<matrix.length && col>=0) {
//         if (matrix[row][col]==key) {
//             System.out.println("key found at("+row+","+col+")");
//             return true;
//         }
//         else if (key<matrix[row][col]) {
//             col--;
//         } else {
//             row++;
//         }
//     }
//     System.out.println("not found");
//     return false;
// }
//     public static void main(String[] args) {
//         int matrix[][] = { { 10, 20, 30, 40 },
//                 { 15, 25, 35, 45 },
//                 { 27, 29, 37, 48 }, { 32, 33, 39, 50 } };
//                 int key=33;
//                 searchsorted(matrix, key);
//     }
// }




// Question 1 :
// Print the number of 7’s that are in
// the 2d array.
// Example :
// Input - int[][] array = { {4,7,8},{8,8,7} };
// Output - 2
// public class TWODarray {
//     public static void main(String[] args) {
//         int[][] array = { {4,7,8},{8,8,7} };
//         int countof7=0;
//         for (int i = 0; i < array.length; i++) {
//             for (int j = 0; j < array[0].length; j++) {
//                 if (array[i][j]==7) {
//                     countof7++;
//                 }
//             }
//         }
//         System.out.print(countof7);
//     }
// }







// Question 2 :
// Print out the sum of the numbers in
// the second row of the “nums” array.
// Example :
// Input - int[][] nums = { {1,4,9},{11,4,3},{2,2,3} };
// Output - 18

// public class TWODarray {

//     public static void main(String[] args) {
//         int[][] nums = { {1,4,9},{11,4,3},{2,2,3} };
//         int sum=0;
//         for (int i = 1; i < nums.length-1; i++) {
// Write a program to Find
// Transpose// a anthe process of
// swapping the
// rows to columns
// . For a 2x3 matrix

// public class TWODarray {
// public static void printmatrix(int matrix[][]){
//     for (int i = 0; i < matrix.length; i++) {
//         for (int j = 0; j < matrix[0].length; j++) {
//             System.out.print(matrix[i][j]);
//         }
//         System.out.println();
//     }
// }
//     public static void main(String[] args) {
//         int matrix[][]={{1,2,3,4},{5,6,7,8}};
//         int row=2,col=4;
// // printmatrix(matrix);

// int Transpose[][]=new int [col][row];
// for (int i = 0; i < row; i++) {
//     for (int j = 0; j < col; j++) {
//         Transpose[j][i]=matrix[i][j];
//     }
// }
// printmatrix(Transpose);


//             }
// }


// public class TWODarray {
// public static void print(int matrix[][]){
//     for (int i = 0; i < matrix.length; i++) {
//         for (int j = 0; j < matrix[0].length; j++) {
//             System.out.print(matrix[i][j]);
//         }
//         System.out.println();
//     }
// }
//     public static void main(String[] args) {
//         int matrix[][]={{1,2,3,4},{5,6,7,8}};
//         int row=2,col=4;
//         int transpose[][]=new int [col][row];
//         for (int i = 0; i<row; i++) {
//             for (int j = 0; j < col; j++) {
//                 transpose[j][i]=matrix[i][j];
//             }
//         }
//         print(transpose);
//     }
// }