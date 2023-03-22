import java.security.Key;
import java.util.Map;

// Print numbers from 1 to N.(decreasing order)
// public class Recursion {
//     public static void decreasingnumber(int n){
//         if (n==1) {
//             System.out.println(n);
//             return;
//         }
//         System.out.println(n+" ");
//         decreasingnumber(n-1);
//     }
//     public static void main(String[] args) {
//        int n=10;
//        decreasingnumber(n);
//     }
// }

// fACTORIAL OF n
// public class Recursion {
// public static int fact(int n){
//     if (n==0) {
//         return 1;
//     }
//     int fnm1=fact(n-1);
//     int factn=n*fnm1;
//     return factn;

// }
//     public static void main(String[] args) {
//         int n=5;
//         System.out.println(fact(n));
//     }
// }

// public class Recursion {
// public static int nnaturalnumbers(int n){
//     if (n==1) {
//         return 1;
//     }
//     int nnm1=nnaturalnumbers(n-1);
//     int nn=n+nnm1;
//     return nn;
// }
//     public static void main(String[] args) {
//         int n=5;
//         System.out.println(nnaturalnumbers(n));
//     }
// }

// Print Nth fibonacci number
// public class Recursion {
// public static int fibbo(int n){
//   if (n==0||n==1) {
//     return n;
//   }
//     int fibboNm1=fibbo(n-1);
//     int fibboNthm2=fibbo(n-2);
//     int fibboN=fibboNm1+fibboNthm2;
//     return fibboN;
// }
//     public static void main(String[] args) {
//         int n=5;
//         System.out.println(fibbo(n));
//     }
// }

// Check if a given array is sorted or not
// public class Recursion {
// public static boolean issorted(int arr[],int i){
//     if (i==arr.length-1) {
//         return true;
//     }
//     if (arr[i]>arr[i+1]) {
//         return false;
//     }
//    return issorted(arr, i+1);

// }
//     public static void main(String[] args) {
//         int arr[]={1,2,3,34,5};
//         System.out.println(issorted(arr, 0));
//     }
// }

// WAF to find the first occurance of an element in an array
// public class Recursion {
// public static int focc(int arr[],int i,int key){

//     if (i==arr.length) {
//         return -1;
//     }
//     if (arr[i]==key) {
//         return i;
//     }
//     return focc(arr, i+1,key);
// }
//     public static void main(String[] args) {
//         int arr[]={8,3,6,9,10,2,5,3};

//         System.out.println(focc(arr, 0, 5));
//     }
// }

// WAF to find the last occurance of an element in an array
// public class Recursion {
//     public static int lastocc(int arr[], int i, int key) {
//         if (i == arr.length) {
//             return -1;
//         }
//         int isfound = lastocc(arr, i + 1, key);
//         if (isfound == -1 && arr[i] == key) {
//             return i;
//         }

//         return isfound;
//     }

//     public static void main(String[] args) {
//         int arr[] = {  5,5,5,5,5};

//         System.out.println(lastocc(arr, 0, 5));
//     }
// }

// Print X^N.
// public class Recursion {
// public static int power(int x,int n){
//     if (n==0) {
//         return 1;
//     }
//     int xnm1=power(x, n-1);
//     int xn=x*xnm1;
//     return xn;
// }
//     public static void main(String[] args) {
//         System.out.println(power(2, 10));
//     }
// }

// Print X^N(Optimised).O(LOG N)
// public class Recursion {
// public static int Optimised(int x,int n){
//     if (n==0) {
//         return 1;
//     }
//     int half=Optimised(x, n/2);
//     int halfpowersqr=half*half;
//     if (n%2!=0) {
//         return x*halfpowersqr;
//     }
//     return halfpowersqr;
// }
//     public static void main(String[] args) {
//         System.out.println(Optimised(2, 10));
//     }
// }

// Print a number from 1 to N.(increasing order)
// public class Recursion {
// public static void increasingorder(int n){
// if (n==1) {
// System.out.print(1);
// return;
// }
// // System.out.println(n+" ");
// increasingorder(n-1);

// System.out.print(n);
// }
// public static void main(String[] args) {
// int n=10;
// }
// }

// Remove Duplicates
// public class Recursion {
//     public static void removeDuplicates(String str, StringBuilder newstr, int indx, boolean map[]) {
//         if (indx == str.length()) {
//             System.out.println(newstr);
//             return;
//         }
//         char currchar=str.charAt(indx);
//         if (map[currchar-'a']==true) {
//             removeDuplicates(str, newstr, indx+1, map);
//         }else{
//             map[currchar-'a']=true;
//             removeDuplicates(str, newstr.append(currchar), indx+1, map);
//         }
//     }

//     public static void main(String[] args) {
// String str="appnnacollege";
// removeDuplicates(str, new StringBuilder(), 0, new boolean[26]);
//     }
// }

// friende pairing
// public class Recursion {
// public static int pairing(int n){
//     if (n==1||n==2) {
//         return n;
//     }
//     // single
//     int fnm1=pairing(n-1);
//     // pair
//     int fnm2=pairing(n-2);
//     int pairways=(n-1)*fnm2;
//     int totalways=fnm1+(n-1)*fnm2;
//     return totalways;
// }
//     public static void main(String[] args) {
//         System.out.println(pairing(3));
//     }
// }

// Binary strings

// public class Recursion {
// public static void binary(int n,int lastplace,String str){
//     // base
//     if (n==0) {
//         System.out.println(str);
//         return;
//     }
//     if (lastplace==0) {
//         binary(n-1, 0, str+"0");
//         binary(n-1, 1, str+"1");
//     }else{
//         binary(n-1, 0, str+"0");
//     }
    // binary(n-1, 0, str.append("0"));
    // if (lastplace==0) {
    //     binary(n-1, 1, str.append("1"));
    // }
// }
//     public static void main(String[] args) {
//         binary(3, 1, new String(" "));
//     }
// }


// public class Recursion {
//  static String digits[]={"ijdfo","one","two","three","four","five","six","seven","eight","zero"};
// public static void numbers(int number){
//     if (number==0) {
//         return ;
//     }
//    int lastdigit= number%10;
//    numbers(number/10);
//    System.out.print(digits[lastdigit]+" ");

// }
//     public static void main(String[] args) {
        
//         numbers(245);
//         System.out.println();
//     }
// }





public class Recursion {
public static int insert(int arr[]){
   
    for (int i = 2; i < arr.length; i++) { 
        for (int j = 0; j < arr.length-1; j++) {
            
            return arr[i]+j;
        }    
        
    }
    return -1;

}
    public static void main(String[] args) {
        int arr[]= {5,10,20};
        System.out.println(insert(arr));
       
    }
}

