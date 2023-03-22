import java.util.Comparator;

// import java.security.Key;
// import java.util.Scanner;

//Creating an array :-if the arrayis just created but not used then if it is declared as "int" then int that all places 0 is stored or if it is declared as the "String" then empty string is  stored in that all place.
// public class Arrays {
// public static void main(String[] args) {
//     int numbers[]=new int[50];
//     int number[]={1,2,3};
//     int morenumber[]={4,5,6};
//     String fruits[]={"mango","apple","pineapple"};
//     System.out.print(number);
// }    
// }

//input ,output and updation in array.
// public class Arrays {

//     public static void main(String[] args) {
//         int marks[]=new int[100];
//         Scanner sc=new Scanner(System.in);
//         marks[0]=sc.nextInt();
//         marks[1]=sc.nextInt();
//         marks[2]=sc.nextInt();

//         System.out.println("phy =" +marks[0]);
//         System.out.println("chem =" +marks[1]);
//         System.out.println("math =" +marks[2]);
// // marks[2]=100;
// marks[2]=marks[2]+1;//in this we can do +,-,*,/ and many things.
//for calculating thhe length we can use "arrayname.lenght".
// System.out.println("math ="+marks[2]);
// System.out.println(marks.length);
//     }

// }

//Arrays as function arguments

// public class Arrays {
// public static void update(int marks[],int nonchangable){
//     nonchangable=10;
//     for (int i = 0; i < marks.length; i++) {
//         marks[i]=marks[i]+1;
//     }
// }
//     public static void main(String[] args) {
//         int marks[]={97,98,99};
//         int nonchangable=5;
//         update(marks,nonchangable);
//         System.out.println(nonchangable);// because it is a call by value that why  its duplicate value is not printed
//         for (int i = 0; i < marks.length; i++) {
//             System.out.print(marks[i]);
//         }
//         System.out.println();
//     }
// }

// Linear Search
// public class Arrays {
//     public static int linearsearch(int numbers[],int key){
//         for (int i = 0; i < numbers.length; i++) {
//             if (numbers[i]==key) {
//                 return i;
//             }
//         }
//         return -1;
//     }

//     public static void main(String[] args) {
//         int numbers[]={2,4,6,8,10,12,14,16};
//         int key=10;
//         int index=linearsearch(numbers, key);
//         if (index==-1) {
//             System.out.println("no key");
//         } else {
//             System.out.println("key found" + " "+index);
//         }
//     }
// }

// public class Arrays {
// public static int menu(String menu[],String key){
//     for (int i = 0; i < menu.length; i++) {
//         if (menu[i]==key) {
//             return i;
//         }
//     }
//     return -1;
// }
//     public static void main(String[] args) {
//         String menu[]={"biryani","chicken 65","mutton masala","maggi"};
//         String key="maggi";
//         int index=menu(menu, key);
//         if (index==-1) {
//             System.out.println("khana khatam");
//         } else {
//             System.out.println("your food is here"+index);
//         }
//     }
// }

// largest array
// public class Arrays {
// public static int largestarray(int numbers[]){
//    int largest=Integer.MIN_VALUE;
//    int smallest=Integer.MAX_VALUE;
//     for (int i = 0; i < numbers.length; i++) {
//         if (largest<numbers[i]) {
//              largest=numbers[i];
//             }
//             if (smallest>numbers[i]) {
//                 smallest=numbers[i];
//             }

//         }
//         System.out.println("the smallest value is"+smallest);
//         return largest;
//     }
//     public static void main(String[] args) {
//         int numbers[]={1,2,3,4,5,6,7};
//       System.out.println(largestarray(numbers));
//     }
// }

//Binarysearch

// public class Arrays {
// public static int binarysearch(int numbers[],int key){
//     int start=0,end=numbers.length-1;
//    while (start<=end) {
//     int mid=(start+end)/2;
//     if (numbers[mid]==key) {//found
//         return mid;
//     }
//     if (numbers[mid]>key) {//left
//         end=mid-1;
//     } else {
//         start=mid+1;//right
//     }
//    }
//    return-1;
// }
//     public static void main(String[] args) {
//       int numbers[]={1,2,3,4,5,6,7,8};
//       int key=8;
//       System.out.println("index of array is "+"="+binarysearch(numbers, key));  
//     }
// }

//Reverse Array
// public class Arrays {
// public static void reversearray(int number[]){
//     int first=0,last=number.length-1;
//     while(first<last) {
//         int temp=number[last];
//         number[last]=number[first];
//         number[first]=temp;
//         first++;
//         last--;

//     }
// }
//     public static void main(String[] args) {
//         int number[]={2,3,4,5,6};
//         reversearray(number);
//         for (int i = 0; i < number.length; i++) {
//             System.out.print(number[i]);
//         }
//         System.out.println();
//     }
// }

//pairs in a array

// public class Arrays {
// public static void pairs(int number[]){
//     int tp=0;
//     for (int i = 0; i < number.length; i++) {
//         int curr=number[i];//2,4,8,10
//         for (int j = i+1; j < number.length; j++) {
//             System.out.print("("+curr+","+number[j]+")");
//             tp++;
//         }
//         System.out.println();
//     }
//     System.out.println("total pairs is"+tp);
// }
//     public static void main(String[] args) {
//         int number[]={2,4,6,8,10};
//         pairs(number);

//     }
// }

//  Print Subarray 
// public class Arrays {
// public static void subarray(int num[]){
//     int sum=0;
//     for (int i = 0; i < num.length; i++) {
//         for (int j = i; j < num.length; j++) {
//             for (int j2 = i; j2 <= j; j2++) {
//                 System.out.print(num[j2]);
//             }
//             sum++;
//             System.out.println();
//         }
//         System.out.println();
//     }
//     System.out.println();
//     System.out.println("total subarray sum is"+sum);
// }
//     public static void main(String[] args) {
//         int num[]={2,4,5,6,7};
//         subarray(num);
//     }
// }

//Max subarraysum
// public class Arrays {
// public static void maxsubarraysum(int number[]){
//     int currsum=0;
//     int maxsum=Integer.MIN_VALUE;
//     for (int i = 0; i < number.length; i++) {
//         int start=i;
//         for (int j = i; j < number.length; j++) {
//             int end=j;
//             currsum=0;
//             for (int k = start; k <= end; k++) {
//                 currsum=currsum+number[k];

//             }
//             System.out.println(" "+currsum);
//             if (maxsum<currsum) {
//                 maxsum=currsum;
//             }
//             // System.out.println();
//         }
//         // System.out.println();
//     }
//     System.out.println( "the maxsum is"+maxsum);
// }
//     public static void main(String[] args) {
//         int number[]={2,4,5,6,-4};
//         maxsubarraysum(number);
//     }
// }

// using prefixsum

// public class Arrays {
// public static void maxsubarrayusingPREFIXMETHOS(int number[]){
//     int curr=0;
//     int maxsum=Integer.MIN_VALUE;
//     int prefix[]=new int[number.length];
//     prefix[0]=number[0];
//     for (int i = 1; i < prefix.length; i++) {
//         prefix[i]=prefix[i-1]+number[i];//prefix array
//     }
//     for (int i = 0; i < number.length; i++) {
//         int start=i;
//         for (int j = i; j < number.length; j++) {
//             int end=j;

//             curr=start==0?prefix[end]:prefix[end]-prefix[start-1];
//             if (maxsum<curr) {
//                 maxsum=curr;
//             }
//         }
//     }
//     System.out.println(maxsum);
// }
//     public static void main(String[] args) {
//         int number[]={1,-2,6,-1,3};
//         maxsubarrayusingPREFIXMETHOS(number);
//     }
// }

// public class Arrays {
// public static void kadanes(int number[]){
//     int curr=0;
//     int ms=Integer.MIN_VALUE;
//     for (int i = 0; i < number.length; i++) {
//         curr=curr+number[i];
//         if (curr<0) {
//             curr=0;
//         }
//         ms=Math.max(curr, ms);
//     }
//     System.out.println("the maximum subarray sum is"+ms);
// }
//       public static void main(String[] args) {
//         int number[]={-2,-3,-2,-3};
//            kadanes(number);
//     }
// }

//trapping water
// public class Arrays {
// public static int trappingwater(int height[]){
//     int n=height.length;
//     //calculating the left max boundary--array
//     int leftmax[]=new int[n];
//     leftmax[0]=height[0];
//     for (int i = 1; i < leftmax.length; i++) {
//         leftmax[i]=Math.max(height[i], leftmax[i-1]);
//     }
//     //calculating the right max boundary--array
//     int rightmax[]=new int[n];
//     rightmax[n-1]=height[n-1];
//     for (int i = n-2; i >=0; i--) {
//         rightmax[i]=Math.max(height[i], rightmax[i+1]);
//     }
//     int trappedwater=0;
//     //loop
//     for (int i = 0; i < n; i++) {
//         //waterlevel=min(leftmax,rightmax);
//         int waterlevel=Math.min(leftmax[i], rightmax[i]);
//         //trappedwater+=waterlevel-height(i);
//        trappedwater+=waterlevel-height[i];
//     }
//     return trappedwater;
// }
//     public static void main(String[] args) {
//         int height[]={4,2,0,6,3,2,5};
//              System.out.println(trappingwater(height));
//     }
// }






//Best time to buy and sell the profit
// public class Arrays {
// public static int besttimetobuyandsell(int prices[] ){
//     int buyprice=Integer.MAX_VALUE;
//     int maxprofit=0;
//     for (int i = 0; i < prices.length; i++) {
//         if (buyprice<prices[i]) {
//             int profit=prices[i]-buyprice;
//             maxprofit=Math.max(maxprofit, profit);
//         }else{
//             buyprice=prices[i];
//         }
//     }
//     return maxprofit;
// }
//     public static void main(String[] args) {
//         int prices[]={7,1,5,3,6,4};
//       System.out.println(  besttimetobuyandsell(prices));
//     }
// } 


// public class Arrays {
// public static boolean ispalindrome(int nums[]){
//     for (int i = 0; i < nums.length; i++) {
//         for (int j = i+1; j < nums.length; j++) {
//             if (nums[i]==nums[j]) {
//                 return true;
//             }
//         }
//     }
//     return false;
// }
//     public static void main(String[] args) {
//         int nums[]={1,7,6, 2, 3, 4};
//         System.out.println(ispalindrome(nums));
//     }
// }


// public class Arrays {
// public static int search(int num[]){
//     for (int i = 0; i < num.length; i++) {
//         int key=3;
//         if (num[i]==key) {
//             return i;
//         }
//     }
//     return-1;
// }
//     public static void main(String[] args) {
//         int num[]={1,2,3,4,5,6,0};
//         int key=3;
//         System.out.println(search(num));
//     }
// }



// public class Arrays {
// public static int bineary(int num[],int key){
    
//    int start=0;
//    int end=num.length-1;
//    while (start<=end) {
//     int mid=(start+end)/2;
//     if (num[mid]==key) {
//         return mid;
//     }
//     if (num[mid]>key) {
//         end=mid-1;
//     }else{
//         start=mid+1;
//     }
//    }
//    return -1;
// }
//     public static void main(String[] args) {
//         int num[]={1,2,3,4,5,6,0};
//         int key=3;
//         System.out.println(bineary(num, key));      
//     }
// }



// public class Arrays {
// public static int find(int prices[]){
//   int buyp=Integer.MAX_VALUE;
//   int maxprofit=0;
//   for (int i = 0; i < prices.length; i++) {
//     if (buyp<prices[i]) {
//         int profit=prices[i]-buyp;
//         maxprofit=Math.max(maxprofit, profit);
//     }else{
//         buyp=prices[i];
//     }
//   }
//   return maxprofit;
// }
    // public static void main(String[] args) {
    //    int prices[] = {7, 6, 4,  3, 5} ;
    //    System.out.println(find(prices));
    // }
   