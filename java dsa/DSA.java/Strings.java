// import java.util.Arrays;
// import java.util.Scanner-                                                                                                                                                                                               ;// it takes only first character
// // String name=sc.nextLine(); it takes full line
// System.out.println(name);
// }
// }

// lengthe="tony stark";
// System.out.println(fullname.length());
// }
// }

// Concatenation
// public class Strings {

// public static void main(String[] args) {
// String first="mohd";
// String last="sohail";
// String full= first+" "+last;
// System.out.println(full);
// }
// }

// charAt Method

// public class Strings {
// public static void print(String str){
// for (int i = 0; i <str.length(); i++) {
// System.out.print(str.charAt(i));

// }

// System.out.println();
// }
// public static void main(String[] args) {
// String first="mohd";
// String last="sohail";
// String full= first+" "+last;
// print(full);
// }
// }

// palindrome
// public class Strings {
// public static Boolean ispalindrome(String str){
// int n=str.length();
// for (int i = 0; i < n/2; i++) {
// if (str.charAt(i)!=str.charAt(n-1-i)) {
// return false;

// }
// }
// return true;
// }
// public static void main(String[] args) {
// String str1="woow";
// System.out.println(ispalindrome(str1));

// }
// }

// Given a route containing 4 directions(E,W,N,S) find the shortest path to
// reach destination "WNEENESENNN".

// public class Strings {
// public static float getshortestpath(String path){
// int x=0,y=0;
// for (int i = 0; i < path.length(); i++) {
// char dir=path.charAt(i);
// //north
// if (dir=='N') {
// y++;
// }
// //south
// else if (dir=='S') {
// y--;
// }
// //west
// else if (dir=='W') {
// x--;
// }else{
// x++;
// }

// }
// int X2=x*x;
// int Y2=y*y;
// return (float)Math.sqrt(X2+Y2);
// }
// public static void main(String[] args) {
// String path="WNEENESENNN";
// System.out.println(getshortestpath(path));
// }
// }

// String function-compare
// public class Strings {

// public static void main(String[] args) {
// String s1="tony";
// String s2="tony";
// String s3=new String("tony");
// if (s1==s2) {
// System.out.println("strings are equal");
// } else {
// System.out.println("strings are not equal");
// }
// if (s1==s3) {
// System.out.println("strings are equal");
/*  it is not equal beacause the
previous strings which are declared are not having the "new" keyword the
 string which is declared with the "new" keyword although it is having the
 same value compare to the other value
but the string which are declared without the "new" keyword are connected
 with eachother but the string which are declared with the "new" keyword
creats the seperate string.*/
// } else {
// System.out.println("strings are not equal");
// if (s1.equals(s3)) {  use equals() to compare two strings
//     System.out.println("it is equal");
// } else {
//     System.out.println("it is not equal");
// }
// }

// }
// }



//  String Substring
// public class Strings {
// public static String substring(String stri,int si,int ei){
// String sub=" ";
//     for (int i = si; i < ei; i++) {
//     sub+=stri.charAt(i);
    
// }
// return sub;
// }
    // public static void main(String[] args) {
    //     String str="hello world";
    //     System.out.println(str.substring(0, 5)); //it is the function to print the substring of a string.
        // System.out.println(substring(str, 0, 5));
//     }
// }

//Print the largest of the string

// public class Strings {
//     public static void main(String[] args) {
//         String fruits[]={"apple","mango","banana"};
//         String largest=fruits[0];
//         for (int i = 1; i < fruits.length; i++) {
//             if (largest.compareTo(fruits[i])<0) {
//                 largest=fruits[i];
//             }
//         }
//         System.out.println(largest);
//     }
// }


// Print the Alphabets from a to z by using STRING.
// TC =O(N*N^2)
// public class Strings {
//     public static void main(String[] args) {
//         String sb=new String(" ");
//         for (char i = 'a'; i < 'z'; i++) {
//             sb+=i;
//         }
//         System.out.println(sb);
//     }
// }


// Print the Alphabets from A to Z using Stringbuilder
// public class Strings {
//     public static void main(String[] args) {
//         StringBuilder sb=new StringBuilder(" ");
//         for (char i='a'; i < 'z'; i++) {
//             sb.append(i); APPEND() is used to add the elements one after the another.
//             // TC O(N)
//             // FOR PRINTING THIS PROGRAM THE TC OF THE STRING WILL BE O(N*N^2).
//         }
//         System.out.println(sb);
//     }
// }

// convert the letter into uppercase
// public class Strings {
// public static String toUpperCase(String str){
//     StringBuilder sb=new StringBuilder(" ");
//     char ch=Character.toUpperCase(str.charAt(0));
//     sb.append(ch);
//     for (int i = 1; i < str.length(); i++) {
//         if (str.charAt(i)==' ' && i< str.length()-1) {
//             sb.append(str.charAt(i));
//             i++;
//             sb.append(Character.toUpperCase(str.charAt(i)));
//         }else{
//             sb.append(str.charAt(i));
//         }
//     }
//     return  sb.toString();
// }
//     public static void main(String[] args) {
//         String str="hi,i am sohail";
//         System.out.println(toUpperCase(str));
//     }
// }


// public class Strings {
// public static String touppercase(String str){
//     StringBuilder sb=new StringBuilder(" ");
//     char ch=Character.toUpperCase(str.charAt(0));
//     sb.append(ch);
//     for (int i = 1; i < str.length(); i++) {
//         if (str.charAt(i)==' ' && i<str.length()-1) {
//             sb.append(str.charAt(i));
//             i++;
//             sb.append(Character.toUpperCase(str.charAt(i)));
//         } else {
//             sb.append(str.charAt(i));
//         }
//     }
//     return sb.toString();
// }
//     public static void main(String[] args) {
//         String str="hi,i am sohail";
//         System.out.println(touppercase(str));
//     }
// }


// public class Strings {
// public static String toupper(String str){
//     StringBuilder sb=new StringBuilder();
//     char ch=Character.toUpperCase(str.charAt(0));
// sb.append(ch);
// for (int i = 1; i < str.length(); i++) {
//     if (str.charAt(i)==' ' && i<str.length()-1) {
//         sb.append(str.charAt(i));
//         i++;
//         sb.append(Character.toUpperCase(str.charAt(i)));
//     } else {
//         sb.append(str.charAt(i));
//     }
// }
// return sb.toString();
// }
//     public static void main(String[] args) {
//         String str="hi,i am sohail";
//         System.out.println(toupper(str));
//     }
// }


// String compression
// public class Strings {
// public static String compress(String str){
//     String newstr=new String(" ");
//     for (int i = 0; i < str.length(); i++) {
//         Integer count=1;
//         while (i<str.length()-1 && str.charAt(i)==str.charAt(i+1)) {
//             count++;
//             i++;
//         }
//         newstr+=str.charAt(i);
//         if (count>1) {
//              newstr+=count.toString();
//         }
//     }
//     return newstr;
// }
//     public static void main(String[] args) {
//         String str="aaabbbcccdd";
//         System.out.println(compress(str));
//     }
// }

// public class Strings {
// public static String compress(String str){
//     StringBuilder sb=new StringBuilder(" ");
//     for (int i = 0; i < str.length(); i++) {
//         Integer count=1;
//         while (i<str.length()-1 && str.charAt(i)==str.charAt(i+1)) {
//             count++;
//             i++;
//         }
//         sb.append(str.charAt(i));
//         if (count>1) {
//             sb.append(count.toString());
//         }
//     }
   
//     return sb.toString();
// }
//     public static void main(String[] args) {       
//         String str="aaabbbcccdd";
//             System.out.println(compress(str));
//     }
//     }

// Question
// 1 Count how many times lowercase vowels occurred in a String entered by the user
// public class Strings {

    // public static void main(String[] args) {
    //     String str=new Scanner(System.in).next();
    //     int count=0;
    //     for (int i = 0; i < str.length(); i++) {
    //         char c=str.charAt(i);
    //         if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
    //             count++;
    //         }
    //     }
    //     System.out.println(count);
    // }

    // public class Strings {
    
    //     public static void main(String[] args) {
    //         String str1="earth";
    //         String  str2="heart";
    //         str1=str1.toLowerCase();
    //         str2=str2.toLowerCase();

    //         char[] str1char=str1.toCharArray();
    //         char[] str2char=str2.toCharArray();
    //         Arrays.sort(str1char);
    //         Arrays.sort(str2char);
    //         boolean result=Arrays.equals(str1char, str2char);
    //         if (result) {
    //             System.out.println("the strings are anagrams"+str1+" "+str2);
    //         } else {
    //             System.out.println("not anagrams");
    //         }
    //     }
    // }


    public class Strings {
    public static String com(String str){
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            Integer count=1;
            while (i<str.length()-1 && str.charAt(i)==str.charAt(i+1)) {
                i++;
                count++;
            }
            sb.append(str.charAt(i));
            if (count>1) {
                sb.append(count.toString());
            }
        }
        return sb.toString();
    }
        public static void main(String[] args) {
            String str="aaaabbbccd";
            System.out.println(com(str));
        }
    }