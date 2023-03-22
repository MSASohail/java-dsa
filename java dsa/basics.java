import java.util.Scanner;

// import java.util.Scanner;

// public class basics{
//     public static void main(String[] args) {
//         int a=20;
//         if (a==15) {
            
//             System.out.print("hello wrold");
//         }
//         else{
//             System.out.println("no world");
//         }
//     }
// }
// Print a pattern
// public class basics {

//     public static void main(String[] args) {
//         System.out.println("****");
//         System.out.println("***");
//         System.out.println("**");
//         System.out.println("*");
//     }
// }

// Varibles in java
// public class basics {
//     public static void main(String[] args) {
//         int a=10;
//         int b=5;
//         String c="Tonny stark";
//         String d="MSA";
//         System.out.println(a);
//         System.out.println(b);
//         System.out.println(c);
//         System.out.println(d); 
//     }
// }

//Datatypes in java
// There are two types of datatypes in the java. they are 
// 1.Primitive datatype(the datatype which is already exist in the system is known as the primitive datatype).They are:-
// byte:-it is used to store the values
// short:-it is also used to store the values.
// char:-it is used to store only single characters.
// int:-it is used to store the values like 8.
// float:-it is used to store the values like 12.25.
// long:-it is used to store the large values 1346589.
// boolean:-True or False.
// double:-1321354.2498643125.

// public class basics {
//     public static void main(String[] args) {
//         char c='a';
//         System.out.println(c);
//         int i=10;
//         System.out.println(i);
//         Byte b=1;
//         System.out.println(b);
//         float f=125;
//         System.out.println(f);
//         boolean bo=true;
//         System.out.println(bo);
//         double d=1246.345455;
//         System.out.println(d);
//         long l=134568945;
//         System.out.println(l);


//     }
// }
// 2.Non-primitive datatype(the datatype which are created by ourselves are known as the non primitive datatype)They are:-
// String.
// Array.
// Class.
// Object.
// Interface.

//Sum of a+b.
// public class basics {
//     public static void main(String[] args) {
//         int a=10;
//         int b=5;
//         int sum=a+b;
//         System.out.println(sum);
//     }
// }

//Sum of a+b by taking input from user.
// public class basics {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("value of a");
//         int a=sc.nextInt();
//         System.out.println("value of b");
//         int b=sc.nextInt();
//         int sum=a+b;
//         System.out.println(sum);
//     }
// }

//Print of a*b.
// public class basics {

//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int a=10;
//         int b=5;
//         int product=a*b;
//         System.out.println(product);
//     }
// }

//Area of Circle
// public class basics {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int radius=sc.nextInt();
//         double area=3.14*radius*radius;
//         System.out.println(area);
//     }
// }

//Conversion of characters into the number.
// public class basics {

//     public static void main(String[] args) {
//         char ch='a';
//         int number=ch;
//         System.out.println(number);
//     }
// }


// homework
// In a program,input 3 numbers:A,B and  C.You have to output the average of these 3 numbers.
// public class basics {

//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int a=sc.nextInt();
//         int b=sc.nextInt();
//         int c=sc.nextInt();
//         int avg=a+b+c/3;
//         System.out.println(avg);
//     }
// } 

// In a program,input the side of a square.You have to output the area of the square.
// public class basics {

//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int sideofsquare=sc.nextInt();
//         int area=sideofsquare*sideofsquare;
//         System.out.println(area);
//     }
// }

// Enter cost of 3items from the user (using float datatype)-a pencil,a pen and an eraser. You have to output the total cost of the items back to the user as their bill.
// public class basics {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("cost of pencil");
//         float pencil=sc.nextFloat();
//         System.out.println("cost of pen");
//         float pen=sc.nextFloat();
//         System.out.println("cost of eraser");
//         float eraser=sc.nextFloat();
//         float total=pencil+(pencil*18/100)+pen+(pen*18/100)+eraser+(eraser+18/100);
//         System.out.println("total cost with 18% GST is "+total);
//     }
// }


//Conditionals
/*1.if else
2.else if
3.ternary operator.
4.switch 
*/

// if else
// public class basics {

//     public static void main(String[] args) {
//         int age=18;
//         if (age>18) {
//             System.out.println("u are not an adult");
//         }
//         if (age>13 && age==18) {
//             System.out.println("u are an teenager");
//         } 
//         else {
//             System.out.println("u are adult");
//         }
//     }
// }


//Print largest among two A and B.
// public class basics {

//     public static void main(String[] args) {
//         int A=1;
//         int B=3;
//         if (A>=B) {
//             System.out.println(" A is big");
//         } else {
//             System.out.println("B is big");
//         }
//     }
// }

//Print a number is odd or even

// public class basics {

//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter ur number to verify whether it is a odd or even");
//         int n=sc.nextInt();
//         if (n%2==0) {
//             System.out.println("it is even");
//         } else {
//             System.out.println("it is odd");
//         }
//     }
// }

//else if
// public class basics {

//     public static void main(String[] args) {
//         int age=13;
//         if (age>=18) {
//             System.out.println("u r an adult");
//         }
//         else if (age>=13 && age<=18) {
//             System.out.println("u r an teen ager");
//         }
//         else{
//             System.out.println("u r not adult");
//         }
//     }
// }

//Income tax calculator
// public class basics {

//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("plz enter ur income to calculate the tax");
//         int Income=sc.nextInt();
//         double tax;
//         if (Income<500000) {
//             System.out.println("no tax");
//         }
//         else if (Income>=500000 && Income<1000000) {
//             tax=(Income*0.2);
//             System.out.println("u are tax is"+tax);
//         }
//         else{
//             tax=(Income*0.3);
//             System.out.println("u are tax is"+tax);
//         }
//     }
// }

//Print Largest among 3 numbers.
// public class basics {

//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("ENTER A");
//         int A=sc.nextInt();
//         System.out.println("ENTER B");
//         int B=sc.nextInt();
//         System.out.println("ENTER C");
//         int C=sc.nextInt();
//         if (A>=B && A>=C) {
//             System.out.println("A is big");
//         }
//         else if (B>=A && B>=C) {
//             System.out.println(" B is big");
//         }
//         else{
//             System.out.println(" C is big");
//         }
//     }
// }


//Ternary operator
// public class basics {

//     public static void main(String[] args) {
//         int num=4;
//         String type=(num%2==0)?"even":"odd";
//         System.out.println(type);
//     }
// }

//student pass or fail
// public class basics {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int marks=sc.nextInt();
//         String result=(marks<=33)?"fail":"pass";
//         System.out.println(result);
//     }
// }

//switch statement
// public class basics {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int num=sc.nextInt();
//         switch (num) {
//             case 1:System.out.println("samosa");
                
//                 break;
//             case 2:System.out.println("burger");
//                 break;
//             case 3:System.out.println("bring me chai");
//                 break;
//             default:
//             System.out.println(" we are dreaming");
//                 break;
//         }
//     }
// }


// public class basics {

//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int numb=sc.nextInt();
//         switch (numb) {
//             case 1:
//                 System.out.println(" bring me a tea");
//                 break;
//             case 2:
//             System.out.println("bring me a breakfast");
//             break;
//             case 3:
//             System.out.println("bring me a tissue");
//             break;
//             default:
//             System.out.println("i am not having money");
//             break;
//         }
//     }
// }

//calculator
// public class basics {
//     public static void main(String[] args) {
//     Scanner sc=new Scanner(System.in);
//     System.out.println("enter num1");
//     int num1=sc.nextInt();
//     System.out.println("enter num2");
//     int num2=sc.nextInt();
//     System.out.println("enter the operator");
//     char operator=sc.next().charAt(0);
//     switch (operator) {
//         case '+':
//             System.out.println(num1+num2);
//             break;
//         case '-':
//         System.out.println(num1-num2);
//           break;
//         case '*':
//         System.out.println(num1*num2);
//         break;
//         case '/':
//         System.out.println(num1/num2);
//         break;
//         case '%':
//         System.out.println(num1%num2);
//         break;
//         default:
//         System.out.println(" error");
//             break;
//     }
//     }
// }

// Question1:Write a Java program to get a number from the user and print whether it is positive or negative.
// public class basics {
// public static void main(String[] args) {
//     Scanner sc=new Scanner(System.in);
//     System.out.println("enter u r number");
//     int num=sc.nextInt();
//     if (num>0 ) {
//         System.out.println("u r num is positive");
//     } else {
//         System.out.println("u r number is negative");
//     }
// }
// }
    

// Question2:Finish the following code so that it prints.You have a fever if your temperature is above 100 and otherwise prints You don't have a fever.
// public class basics {
//     public static void main(String[] args) {
//         double temp=98.6;
//         if (temp>100) {
//             System.out.println("u are having fever");
//         } else {
//             System.out.println("u are not having fever");
//         }
//     }
// }


// Question3:Write a Java program to input week number(1-7) and print day of week name using switch case.
// public class basics {

//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int week=sc.nextInt();
//         switch (week) {
//             case 1:
//                 System.out.println("sunday");
//                 break;
//             case 2:
//             System.out.println("monday");
//             break;
//             case 3:
//             System.out.println("tuesday");
//             break;
//             case 4:
//             System.out.println("wednesday");
//             break;
//             case 5:
//             System.out.println("thursday");
//             break;
//             case 6:
//             System.out.println("friday");
//             break;
//             case 7:
//             System.out.println("saturday");
//             break;
        
//             default:
//             System.out.println("no day");
//                 break;
//         }
//     }
// }


// public class basics {
//     public static void main(String args[]) {
//         int a=63,b=36;
//         boolean x= (a<b)?true:false;
//         System.out.println(x);
//         int y= (a>b)?a:b;
//         System.out.println(y);
//     }
// }
    

    

// Write a Java program that takes a year from the user and print whether that year is a leap year or not.

// public class basics {

//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter to check it is a leap year or not");
//         int year=sc.nextInt();
//         if (year%4==0) {
//             System.out.println("yes it is a leap year");
//         } 
//         else if(year%100==0){
//             System.out.println("yes it is a leap year");
//         }
//         else if(year%400==0){
//            System.out.println("yes it is a leap year");
//         }
//         else{
//             System.out.println("it is not a leap year");
//         }
//     }
// }
