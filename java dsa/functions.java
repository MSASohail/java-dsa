import java.util.Scanner;

//basics
// public class functions {
//     public static void printhelloworld(){
//         System.out.println("hello world");
//         System.out.println("hello world");
//         System.out.println("hello world");
//     }
//     public static void main(String[] args) {
//         printhelloworld();
//     }
// }

// Write a program that takes a input from the user and verify that this number is even or odd
// public class functions {
//     static Scanner sc=new Scanner(System.in);
//     static long n=sc.nextInt();
// public static void verifying(){
//     if (n%2==0) {
//         System.out.println("even");
//     } else {
//         System.out.println("odd");
//     }
// return ;
// }
//     public static void main(String[] args) {

//         verifying();
//     }
// }

//write a program to print the sum of numbers by taking the input from the user.
// public class functions {
// public static void calculate(int num1,int num2){ //this (num1,num2) is known as formal paramaters or parameters it is just used for defining the parameters. 
//     int sum=num1+num2;
//     System.out.println("the sum is" + sum);
// }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int a=sc.nextInt();
//         int b=sc.nextInt();
//         calculate(a, b);//this (a,b) is also known as the actual parameters or arguments it is used while calling the function.
//     }
// }

// Call by Values(in Java).
// public class functions {
// public static void swap(int a,int b){

//     int temp;
//     temp=a;
//     a=b;
//     b=temp;
//     System.out.println(a);
//     System.out.println(b);
// }
//     public static void main(String[] args) {
//         int a=25;
//         int b=35;
// swap(a, b);

//     }
// }

// Find the Product
// public class functions {
// public static int multiply(int a,int b){
//     int product=a*b;
//     return product;
// }
//     public static void main(String[] args) {
// int a=10;
// int b=24;
// int prod=multiply(a, b);
// System.out.println(prod);
//     }
// }

//Find the Factorial of the number
// n!=n*(n-1)*(n-2)*(n-3).....1.
// public class functions {
// public static int factorial(int n){
//     int f=1;
//     for (int i = 1; i <=n; i++) {
//         f=f*i;
//     }
//     return f;
// }
// public static int Binomialcoefficient(int n,int r){
//     int a=factorial(n);
//     int b=factorial(r);
//     int c=factorial(n-r);
//     int BC=a/(b*c);
// return BC;
// }
//     public static void main(String[] args) {
//   System.out.println(Binomialcoefficient(5, 2)); 
//     }
// }

//Binomial coefficient
// public class functions {
//     public static void main(String[] args) {

//     }
// }

//FUNCTION OVERLOADING using parameters
// it means multiple functions have same name but different parameters.
// public class functions {
//  public static int  sum(int a,int b){

//       return a+b;
// }
// public static int sum(int a,int b,int c){

//     return a+b+c;
// }
//     public static void main(String[] args) {
//         System.out.println(sum(3, 5));
//         System.out.println(sum(5, 6, 7));
//     }
// }

// FUNCTION OVERLOADING using Datatypes

// public class functions {
// public static int sums(int a,int b){
//     return a+b;
// }
// public static float sums(float a,float b){
//     return a+b;
// }
//     public static void main(String[] args) {
//         System.out.println(sums(5, 10));
//         System.out.println(sums(12f, 5f));
//     }
// }

//Prime number or not.

/*public class functions {
public static void prime(int n){
    if (n==2) {
        System.out.println(" 2 is always prime number");
    } else {
        Boolean isprime=true;
        for (int i = 2; i<=n-1; i++) {
            if (n%i==0) {
                isprime=false;
            }
        }
        if (isprime==true) {
            System.out.println("num is prime");
        } else {
            System.out.println("not prime");
        }
    }
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        prime(n);
    }
}


                   or


public class functions {
    if(n==2){             this type of cases are known as the corner cases.
        return true;   
    }
public static Boolean isprime(int n){
   boolean isprime=true;
   for (int i = 2; i <=n-1; i++) {
    if (n%i==0) {
        isprime=false;
        break;
    }
   }
   return isprime;
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(isprime(n));
    }
}

optimised approach of prime number.
public class functions {
public static boolean optimisedprime(int n){
    boolean isprime=true;
    for (int i = 2; i <=Math.sqrt(n); i++) {
        if (n%i==0) {
            isprime=false;
        }
    }
    return isprime;
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(optimisedprime(n));     
    }
}*/

// /*Print primes in range.
// public class functions {
// public static Boolean isprime(int n){
//     boolean prime=true;
//     for (int i = 2; i <=Math.sqrt(n) ; i++) {
//         if (n%i==0) {
//             prime=false;
//         }
//     }
//     return prime;   
// }
// public static void primerange(int n){
//     for (int i = 2; i <=n; i++) {
//         if (isprime(i)) {
//             System.out.print(i+" ");
//         }
//     }
//     System.out.println();
// }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         primerange(n);
//     }
// }

//Conversion of Binary to Decimal.
// public class functions {
// public static void bintodec(int binnum){
//     int mynum=binnum;
//     int pow=0;
//     int decnum=0;
//     while (binnum>0) {
//         int lastdigit=binnum%10;
//         decnum=decnum+lastdigit*(int)(Math.pow(2, pow));

//         pow++;
//         binnum=binnum/10;
//     }
//     System.out.println("the decimal of"+mynum +"="  +decnum);
// }
//     public static void main(String[] args) {
//         bintodec(1011);
//     }
// }

//Conversion of  decimal into binary.
/*public class functions {
public static void dectobin(int n){
    int mynum=n;
    int pow=0;
    int binnum=0;
    while (n>0) {
        int rem=n%2;
        binnum=binnum+(rem*(int)Math.pow(10, pow));
        pow++;
        n=n/2;
    }
    System.out.println("u r binary number of"+mynum+"="+binnum);
}
    public static void main(String[] args) {
        dectobin(7);
    }
}*/

// Question 1 :Write a Java method to compute the average of three numbers.
// public class functions {
// public static void average(int a,int b,int c){
//     double avg=a+b+c/3;
//     System.out.println(avg);
// }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int a=sc.nextInt();
//         int b=sc.nextInt();
//         int c=sc.nextInt();
//         average(a, b, c);

//     }
// }

// Question2:Write a method named isEven  that accepts an int argument.The method should return true if the argument iseven ,or false otherwise. Also write a program to test your method.
// public class functions {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter num");
//         int num=sc.nextInt();
//         if (isEven(num)) {
//             System.out.println("the number is even");
//         } else {
//             System.out.println("the number is odd");
//         }
//     }
//     public static boolean isEven(int num){
//         if (num%2==0) {
//             return true;
//         } else {
//             return false;
//         }
//     }
// }

// Question3:Write  a Java program to check if a number is a palindrome in Java?(121 is a palindrome, 321 is not
// public class functions {

//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//       int  palindrome=sc.nextInt();
//       System.out.println("enter number");
//       if (ispalindrome(palindrome)) {
//         System.out.println("u r num is palindrome");
//       } else {
//         System.out.println("not palindrome");
//       }
        
//     }
//     public static boolean ispalindrome(int n){
//         int palindrome=n;
//         int reverse=0;
//         while (palindrome!=0) {
//             int remainder=palindrome%10;
//             reverse=reverse*10+remainder;
//             palindrome=palindrome/10;
//         }
//         if (reverse==n) {
//             return true;
//         } else {
//             return false;
//         }
//     }
// }







// Write a Java method to compute the sum of the digits in an integer.

// public class functions {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("input integer");
//         int digits=sc.nextInt();
//     System.out.println(sumofdigits(digits));         
//     }
//     public static int sumofdigits(int num){
//         int sum=0;
//         while (num>0) {          
//             int lastdigit=num%10;
//             sum=lastdigit+sum;
//             num=num/10;
//         }
//         return sum;
//     }
// }


