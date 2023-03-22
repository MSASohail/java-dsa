// import java.util.Scanner;

// Bitwise AND
// public class bitmanipulation {
//     public static void main(String[] args) {
//         System.out.println(5&6);
//     }
// }

// Bitwise  OR
// public class bitmanipulation {
//     public static void main(String[] args) {
//         System.out.println(5|6);
//     }
// }

// bitwise left shift
// public class bitmanipulation {

//     public static void main(String[] args) {
//         System.out.println(5<<2);
//     }
// }

// bitwise right
// public class bitmanipulation {

//     public static void main(String[] args) {
//         System.out.println(5>>2);
//     }
// }

// Check whether the number is odd or even
// public class bitmanipulation {
// public static void oddoreven(int n){
//     int bitmask=1;
//     if ((n & bitmask)==0) {
//         System.out.println("number is even");
//     } else {
//         System.out.println("number is odd");
//     }
// }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         oddoreven(n);
//     }
// }

// operations=Get,Set,Update..
// Get
// public class bitmanipulation {

    // public static int getbit(int n,int i){
    // int bitmask=1<<i;
    // if ((n&bitmask)==0) {
    // return 0;
    // } else {
    // return 1;
    // }
    // }

    // public static int setbit(int n, int i) {
    // int bitmask = 1 << i;
    // return n | bitmask;
    // }

    // public static int clearbit(int n, int i) {
    // int bitmask = ~(1 << i);
    // return n & bitmask;
    // }

    // public static int updatebit(int n, int i, int newbit) {
    // if (newbit == 0) {
    // return clearbit(n, i);
    // } else {
    // return setbit(n, i);
    // }
    // }

    // public static int clearlastbits(int n,int i){
    // int bitmask=(~0<<i);
    // return n&bitmask;
    // }

    // public static int clearrangeofits(int n,int i,int j){
    // int a=(~1)<<j+1;
    // int b=1<<i;
    // int bitmask=a|b;
    // return n&bitmask;
    // }

    // public static boolean checkpoweris2ornot(int n){
    // return (n&(n-1))==0;
    // }

    // public static int checkbits(int n) {
    //     int count = 0;
    //     while (n>0) {
    //         if ((n&1)!=0) {
    //             count++;
    //         }
    //         n=n>>1;
    //     }
    //     return count;
    // }
    // public static int fastexponential(int a,int n){
    //        ans=ans*a;
    //             // count++;
    //         }
    //         a=a*a;
    //         n=n>>1;
    //     }
    //     return ans;
    // }

    // public static void main(String[] args) {
        // System.out.println( getbit(10, 2) );
        // System.out.println(setbit(15,2));
        // System.out.println(clearbit(10, 1));
        // System.out.println(updatebit(10, 2, 1));
        // System.out.println(clearlastbits(15, 2));
        // System.out.println(clearrangeofits(10, 2, 4));
        // System.out.println(checkpoweris2ornot(8));
//         System.out.println(checkbits(15));
// System.out.println(fastexponential(2, 2));
//     }
// }



// What is the value of x^x for any value
// of x?
// Solution 1:
// The value of x^x = 0.Think about it, xor gives 0 when the bits are the same. If  we compare the same number to itself, the bits will always be the same. So, the answer of x^x will always be 0

// Question 2 :
// Swap two numbers without using any third
// variable.
// this is because the property of the xor x^x=0.

// public class bitmanipulation {

//     public static void main(String[] args) {
//         int x=3;
//         int y=4;
//         x=x^y;
//         y=x^y;
//         x=x^y;
//         System.out.println(x+" "+y);
//     }
// }

// Add 1 to an integer using Bit Manipulation.
// public class bitmanipulation {

//     public static void main(String[] args) {
//         int x=3;
//         System.out.println("the value of x is"+-~x);
//         x=0;
//         System.out.println("the value of x is "+-~x);
//     }
// }


// public class bitmanipulation {

//     public static void main(String[] args) {
//         for (char i = 'A'; i < 'z'; i++) {
//             System.out.println((char)(i|" "));
//         }
//     }
// }