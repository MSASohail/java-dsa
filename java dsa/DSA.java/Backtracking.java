// public class Backtracking {
//     public static void printarr(int arr[]) {
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }

// public static void changearr(int arr[], int i, int val) {
// // base
// if (i == arr.length) {
// printarr(arr);
// return;
// }
// // recurssion or kaaam
// arr[i] = val;
// changearr(arr, i + 1, val + 1);
// arr[i] = arr[i] - 2;
// }
// public static void main(String[] args) {
// int arr[] = new int[5];
// changearr(arr, 0, 1);
// printarr(arr);
// }

// public static void findsubsets(String str, String ans, int i) {
// if (i == str.length()) {
// if (ans.length()==0) {
// System.out.println("null");
// }else{
// System.out.println(ans);
// }
// return;
// }
// // choice
// // yes
// findsubsets(str, ans+str.charAt(i), i + 1);
// // no
// findsubsets(str, ans, i + 1);
// }

// public static void main(String[] args) {
// String str = "abc";
// findsubsets(str, "", 0);

// }

//    Find the permutation
// public class Backtracking {
//     public static void perm(String str, String ans) {
//         // base case
//         if (str.length() == 0) {
//             System.out.println(ans);
//             return;
//         }
//         // recurssion
//         for (int i = 0; i < str.length(); i++) {
//             char curr = str.charAt(i);
//             // "abcde"="ab"+"de";
//             String newstr = str.substring(0, i) + str.substring(i + 1);
//             perm(newstr, ans+curr);
//         }

//     }

//     public static void main(String[] args) {
//         String str = "abc";
// perm(str, "");
//     }

// }

// public class Backtracking {
// public static void printarr(int arr[]){
//     for (int i = 0; i <arr.length; i++) {
//         System.out.print(arr[i]);
//     }
//     System.out.println();
// }
// public static void array(int arr[],int i,int val){
//     // base
//     if (i==arr.length) {
//         printarr(arr);
//         return;
//     }
//     // recursion
//     arr[i]=val;
//     array(arr, i+1, val+1);
//     arr[i]=arr[i]-2;
// }
//     public static void main(String[] args) {
//         int arr[]=new int[5];
//         array(arr, 0, 1);
//         printarr(arr);
//     }
// }

// public class Backtracking {
// public static void subsets(String str,String ans,int i){
//     // base
//     if (i==str.length()) {
//         if (ans.length()==0) {
//             System.out.println(" ");
//         } else {
//             System.out.println(ans);
//         }
//         return;
//     }
//     // recurssion(kaam)
//     // yes
//     subsets(str, ans+str.charAt(i), i+1);
//     // no
//     subsets(str, ans, i+1);
// }
//     public static void main(String[] args) {
//         String str="abc";
//         subsets(str, "", 0);
//     }
// }

// public class Backtracking {
// public static void premutation(String str,String ans){
//     // base
// if (str.length()==0) {
//     System.out.println(ans);
//     return;
// }
//     // recursion(kaam)
//     for (int i = 0; i < str.length(); i++) {
//         char curr=str.charAt(i);
//         String newstr=str.substring(0, i)+str.substring(i+1);
//         premutation(newstr, ans+curr);
//     }
// }
//     public static void main(String[] args) {
//         String str="abc";
//         premutation(str, " ");
//     }
// }

// public class Backtracking {
//     public static boolean issafe(char board[][],int row,int col){   
//         //vertically
//        for (int i = row-1; i>=0; i--) {
//               if (board[i][col]=='Q') {
//                 return false;
//        }
//     }
//         // diagonal left top
//         for (int i=row-1,j=col-1;i>=0 &&j>=0;i--,j--) {
//             if (board[i][j]=='Q') {
//                 return false;
//             }
//         }

//         // digonal right top
//         for(int i=row-1,j=col+1;i>=0 && j<board.length;i--,j++){
//             if (board[i][j]=='Q') {
//                 return false;
//             }
//         }
//         return true;
//     }

//     public static void nQueens(char board[][], int row) {
//         // base case
//         if (row == board.length) {
//             printboard(board);
//             return;
//         }

//         // column loop
//         for (int j = 0; j < board.length; j++) {
//             if (issafe(board, row, j)) {
//                 board[row][j] = 'Q';
//                 nQueens(board, row + 1);// function loop
//                 board[row][j] = '.';// backtracking step
//             }
//         }
//     }

//     public static void printboard(char board[][]) {
//         System.out.println("-------------chessboard-----------");
//         for (int i = 0; i < board.length; i++) {
//             for (int j = 0; j < board.length; j++) {
//                 System.out.print(board[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }

//     public static void main(String[] args) {
//         int n = 4;
//         char board[][] = new char[n][n];
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {
//                 board[i][j] = '.';
//             }
//         }
//         nQueens(board, 0);
//     }
// }

// N Queens problems  (T.C=O(N!))
// public class Backtracking {
//     public static boolean issafe(char board[][],int row,int col){
//         // verically
//         for (int i = row-1; i>=0; i--) {
//             if (board[i][col]=='Q') {
//                 return false;
//             }
//         }

//         // diagonal left up
//         for (int i = row-1,j=col-1; i>=0 && j>=0 ; i--,j--) {
//             if (board[i][j]=='Q') {
//                 return false;
//             }
//         }

//         // diagonal right up
//         for (int i = row-1,j=col+1;i>=0 &&j<board.length;i--,j++) {
//             if (board[i][j]=='Q') {
//                 return false;
//             }
//         }
//         return true;
//     }
//     public static void nQueens(char board[][],int row){
//         // base
//         if (row==board.length) {
//             printboard(board);
//             return;
//         }
//         // column loop
//         for (int j = 0; j < board.length; j++) {
//             if (issafe(board, row, j)) {
//                 board[row][j]='Q';
//                 nQueens(board, row+1);
//                 board[row][j]='.';
//             }

//         }
//     }
// public static void printboard(char board[][]){
//     System.out.println("------------------------");
//     for (int i = 0; i < board.length; i++) {
//         for (int j = 0; j < board.length; j++) {
//             System.out.print(board[i][j]+" ");
//         }
//         System.out.println();
//     }
// }
//     public static void main(String[] args) {
//         int n=4;
//         char board[][]=new char[n][n];
//         for (int i = 0; i <n; i++) {
//             for (int j = 0; j < n; j++) {
//                 board[i][j]='.';
//             }
//         }
//         nQueens(board,0);
//     }
// }

// public class Backtracking {
// public static boolean issafe(char board[][],int row,int col){
//     // vertically
//     for (int i = row-1; i>=0; i--) {
//         if (board[i][col]=='Q') {
//             return false;
//         }
//     }
//     // diagonal left up
//     for (int i = row-1,j=col-1; i>=0&&j>=0; i--,j--) {
//         if (board[i][j]=='Q') {
//             return false;
//         }
//     }
//     // diagonal right up
//     for (int i = row-1,j=col+1;i>=0 &&j< board.length; i--,j++) {
//         if (board[i][j]=='Q') {
//             return false;
//         }
//     }
//     return true;
// }
// public static boolean nQueens(char board[][],int row){
//     // base
//     if (row==board.length) {
//         // printboard(board);
//         count++;
//         return true;
//     }
//     // column loop
//     for (int j = 0; j < board.length; j++) {
//         if(issafe(board, row, j)){
//             board[row][j]='Q';
//             if (nQueens(board, row+1)) {
//                 return true;
//             }
//             board[row][j]='.';
//         }
//     }
//     return false;
// }
// public static int count=0;
// public static void printboard(char board[][]){
//     System.out.println("-----------------------------");
//     for (int i = 0; i < board.length; i++) {
//         for (int j = 0; j < board.length; j++) {
//             System.out.print(board[i][j]);
//         }
//         System.out.println();
//     }
// }
//     public static void main(String[] args) {
//         int n=4;
//         char board[][]=new char[n][n];
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {
//               board[i][j]='.';
//             }
//         }
//   if (nQueens(board, 0)) {
//     System.out.println("sol is possible");
//   } else {
//     System.out.println("not possible");
//   }
//   System.out.println("the total counts is="+ count);
//     }
// }

// Grid ways
// public class Backtracking {
// public static int gridways(int i,int j,int n,int m){
//     if (i==n-1 && j==m-1) {
//         return 1;
//     }else if (i==n || j==m) {
//         return 0;
//     }
//     int w1=gridways(i+1, j, n, m);//Down
//     int w2=gridways(i, j+1, n, m);//right
//     return w1+w2;
// }
//     public static void main(String[] args) {
//         int n=3,m=3;
//         System.out.println(gridways(0, 0, n, m));
//     }
// }

// suduku solver
// public class Backtracking {
//     public static boolean issafe(int suduko[][],int row,int col,int digit){
//         // row
//         for (int i = 0; i<=8; i++) {
//             if (suduko[i][col]==digit) {
//                 return false;
//             }
//         }

//         // column
//         for (int j = 0; j <=8; j++) {
//             if (suduko[row][j]==digit) {
//                 return false;
//             }
//         }

//         // grid
//         int sr=(row/3)*3;
//         int sc=(col/3)*3;
//         // 3*3 (grid)
//         for (int i = sr; i<sr+3; i++) {
//             for (int j = sc; j < sc+3; j++) {
//                 if (suduko[row][col]==digit) {
//                     return false;
//                 }
//             }
//         }
//         return true;
//     }
//  public static boolean sudukosolver(int suduko[][],int row,int col){
//     // basecase
//     if (row==9) {
//         return true;
//     }

//     // recurssion
//     int nextrow=row,nextcol=col+1;
//     if (col+1==9) {
//         nextrow=row+1;
//         nextcol=0;
//     }
//     if (suduko[row][col]!=0) {
//        return sudukosolver(suduko, nextrow, nextcol);
//     }
//     for (int digit = 1; digit <=9; digit++) {
//         if (issafe(suduko,row,col,digit)) {
//             suduko[row][col]=digit;
//             if (sudukosolver(suduko, nextrow, nextcol)) {
//                 return true;
//             }
//             suduko[row][col]=0;
//         }
//     }
//     return false;

//  }
// public static void printsuduko(int suduko[][]){
//     for (int i = 0; i < 9; i++) {
//         for (int j = 0; j < 9; j++) {
//             System.out.print(suduko[i][j]+" ");
//         }
//         System.out.println();
//     }
// }

//     public static void main(String[] args) {
//         int suduko[][] = { { 0, 0, 8, 0, 0, 0, 0, 0, 0 },
//                 { 4, 9, 0, 1, 5, 7, 0, 0, 2 },
//                 { 0, 0, 3, 0, 0, 4, 1, 9, 0 },
//                 { 1, 8, 5, 0, 6, 0, 0, 2, 0 },
//                 { 0, 0, 0, 0, 2, 0, 0, 6, 0 },
//                 { 9, 6, 0, 4, 0, 5, 3, 0, 0 },
//                 { 0, 3, 0, 0, 7, 2, 0, 0, 4 },
//                 { 0, 4, 9, 0, 3, 0, 0, 5, 7 },
//                 { 8, 2, 7, 0, 0, 9, 0, 1, 3 } };
//   if (sudukosolver(suduko, 0, 0)) {
//     System.out.println("solution exists");
//     printsuduko(suduko);
//   }else{
//     System.out.println("solution does not exists");
//   }

//     }
// }

// public class Backtracking {
//     public static void printmaze(int sol[][]) {
//         for (int i = 0; i < sol.length; i++) {
//             for (int j = 0; j < sol.length; j++) {
//                 System.out.print(sol[i][j]);
//             }
//             System.out.println();
//         }

//     }

//     public static boolean issafe(int maze[][], int x, int y) {
//         return (x >= 0 && x < maze.length && y >= 0 && y < maze.length && maze[x][y] == 1);
//     }

//     public static boolean solvemaze(int maze[][]) {
//         int N = maze.length;
//         int sol[][] = new int[N][N];
//         if (solveuntil(maze, 0, 0, sol) == false) {
//             System.out.println("solution does not exist");
//             return false;
//         }
//         printmaze(sol);
//         return true;

//     }

//     public static boolean solveuntil(int maze[][], int x, int y, int sol[][]) {
//         if (x == maze.length - 1 && y == maze.length - 1 && maze[x][y] == 1) {
//             sol[x][y] = 1;
//             return true;
//         }
//         if (issafe(maze, x, y) == true) {
//             if (sol[x][y] == 1) {
//                 return false;
//             }
//             sol[x][y] = 1;
//             if (solveuntil(maze, x + 1, y, sol)) {
//                 return true;
//             }
//             if (solveuntil(maze, x, y + 1, sol)) {
//                 return true;
//             }
//             sol[x][y] = 0;
//             return false;
//         }
//         return false;
//     }

//     public static void main(String[] args) {
//         int maze[][] = { { 1, 0, 0, 0 },
//                 { 1, 1, 0, 1 },
//                 { 0, 1, 0, 0 },
//                 { 1, 1, 1, 1 } };
//         solvemaze(maze);
//     }
// }


