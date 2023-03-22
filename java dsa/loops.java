import java.util.Scanner;
import java.util.*;

//while loop
//Q.hello world

// public class loops {
//     public static void main(String[] args) {
//         int i=0;
//         while (i<100) {
//             System.out.println("hello world");
//             i++;
//         }
//     }
// }
//print numbers from 1 to 10
// public class loops {

//     public static void main(String[] args) {
//         int num=0;
//         while (num<11) {
//             System.out.print(num);
//             num++;
//         }
//     }
// }

//print numbers from 1 to n.
// public class loops {
//     public static void main(String[] args) {
//         int num=0;    
//         while (num>-1) {
//             System.out.print(num);
//             num++;         
//         }
//     }
// }

//print the values from 1 to n(by taking the n value from the user).
// public class loops {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int numb=1;
//         System.out.println("enter ur n");
//         int n=sc.nextInt();
//         while (numb<=n) {
//             System.out.print(numb);
//             numb++;
//         }
//     }
// }

// public class loops {

//     public static void main(String[] args) {
//         int n=5;
//         int sum=0;
//         int i=1;
//         while (i<=n) {
//             sum=sum+i;
//             i++;
//         }
//         System.out.println(sum);
//     }
// }

// public class loops {

//     public static void main(String[] args) {
//         int n=5;
//         int sum=0;
//         int i=1;
//         while (i<=n) {
//             sum=sum+i;
//             i++;
//         }
//         System.out.println(sum);
//     }
// }

// FOR LOOP:-
// for(initialisation;condition;updation){
//      do something
// }

// Q.Print "helo world" 10 times using for loop.
// public class loops {
//     public static void main(String[] args) {
//         for (int i = 1; i <=10; i++) {
//             System.out.println("hello world");
//         }
//     }
// }

// Print numbers from 1 to 10 using for loop.
// public class loops {
//     public static void main(String[] args) {
//         for (int i = 0; i <=10; i++) {
//             System.out.print(i);
//         }
//     }
// }

// Print sum of n natural numbers using for loop.
// public class loops {
//     public static void main(String[] args) {
//         int sum=0;
//         int n=5;
//         for (int i = 0; i <=n; i++) {
//             sum=sum+i;
//         }
//         System.out.println(sum);
//     }
// }

//Print a square pattern.

// public class loops {
//     public static void main(String[] args) {
//         for (int i = 1; i <=4; i++) {
//             System.out.println("****");
//         }
//     }
// }

// Print Reverse of a number.

// public class loops {
//     public static void main(String[] args) {
//         int n= 10899; 
//         while (n>0) {
//             int lastdigit=n%10;
//             System.out.print(lastdigit);
//             n=n/10;
//         }
//         System.out.println();
//     }
// }

// Reverse the given number

// public class loops {
//     public static void main(String[] args) {
//         int n=10888;
//         int rev=0;
//         while (n>0) {
//             int lastdigit=n%10;
//             rev=(rev*10)+lastdigit;
//             n=n/10;
//         }
//         System.out.println(rev);
//     }
// }

// DO WHILE LOOP by using this if u want to execute the work only once then it is useful

// public class loops {
//     public static void main(String[] args) {
//         int counter=10;
//         do {
//             System.out.println("hello world");
//             counter++;
//         } while (counter>100);
//     }
// }

// Break loop
// public class loops {
//     public static void main(String[] args) {
//         int k=5;
//         for (int i = 0; i < k; i++) {
//             System.out.println(i);
//             if (i==3) {
//                 break;
//             }
//         }
//     }
// }

// Keep entering numbers until userenters multiple of 10.

// public class loops {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         do {
//             System.out.print("enter ur number" + " ");
//             int n = sc.nextInt();
//             if (n % 10 == 0) {
//                 break;
//             }
//             System.out.println(n);        
//         } while (true);
//     }
// }

// Continue loop it is used to skip the iterartion.
// public class loops {

//     public static void main(String[] args) {
//         int n=10;
//         for (int i = 0; i < n; i++) {
//             if (i==3) {
//                 continue;
//             }
//             System.out.print(i);
//         }
//     }
// }

// Display all the numbers entered by the user except multiples of 10 by using continue.
// public class loops {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         do {
//             System.out.print("enter the values of : ");
//             int n = sc.nextInt();
//             if (n % 10 == 0) {
//                 continue;
//             }
//             System.out.println("value is " + n);
//         } while (true);
//     }
// }

//Check if the number is prime or not.
// public class loops {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         if (n == 2) {
//             System.out.println(n+"  is  prime");
//         } else {
//              Boolean isPrime = true;
//             for (int i = 2; i <= Math.sqrt(n); i++) {
//                 if (n % i == 0) {
//                     isPrime = false;
//                 }
//             }
//             if (isPrime == true) {
//                 System.out.println(n+"  is prime ");
//             } else {
//                 System.out.println(n+" is not prime");
//             }
//         }
//     }
// }

//Homework
// Write a program to print the multiplication table of a number N,entered  by the user.
// public class loops {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println( "enter any number");
//         int n=sc.nextInt();
//         for (int i = 1; i <11; i++) {
//             System.out.print(n*i);
//         }
//     }
// }

// Write a program that reads a set of integers,and then prints the sum of the even and odd integers.
// public class loops {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int number;
//         int count;
//         int sumeven=0;
//         int sumodd=0;
//         do {
//            System.out.println("enter ur number"); 
//              number=sc.nextInt();      
//             if (number%2==0) {
//                 sumeven+=number;
//             } else {
//                 sumodd+=number;
//                 System.out.println("if  u want to continue click 1");
//             }
//             count=sc.nextInt();
//         } while (count==1);
//         System.out.println("sum of even numbers"+sumeven);
//         System.out.println("sum of odd numbers"+sumodd);
//         }
//     }




// Patterns
// *
// **
// ***
// ****
// *****

// public class loops {
//     public static void main(String[] args) {
//         for (int i = 0; i < 5; i++) {
//             for (int j = 0; j <=i; j++) {
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }

// *****
// ****
// ***
// **
// *

// public class loops {
//     public static void main(String[] args) {
//         int n=4;
//         for (int i = 0; i <=4; i++) {
//             for (int j = 0; j <n-i+1; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// A
// BC
// DEF
// GHIJ
// KLMNO

// public class loops {
//     public static void main(String[] args) {
//         int n=4;
//         char ch='A';
//         for (int i = 0; i <=n; i++) {
//             for (int j = 0; j <=i; j++) {
//                 System.out.print(ch);
//                 ch++;
//             }
//             System.out.println();
//         }
//     }
// }



