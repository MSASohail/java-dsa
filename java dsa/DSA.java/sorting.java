// import java.util.*;
// import java.util.Arrays;



//bubblesort

// public class sorting {
// public static void bubblesorting(int arr[]){
//     for (int i = 0; i < arr.length-1; i++) {
//         for (int j = 0; j < arr.length-1-i; j++) {
//             if (arr[j]>arr[j+1]) {             
//               int temp=arr[j];
//               arr[j]=arr[j+1];
//               arr[j+1]=temp;
//             }
//         }
//     }
//     for (int i = 0; i < arr.length; i++) {
//         System.out.print(arr[i]);
//     }
//     System.out.println();
// }
//     public static void main(String[] args) {
//         int arr[]={5,4,1,3,2};
//         bubblesorting(arr);
//     }
// }


//selection sort
// public class sorting {
// public static void selectionsort(int arr[]){
//     for (int i = 0; i < arr.length-1; i++) {
//         int curr=i;
//         for (int j = i+1; j < arr.length; j++) {
//             if (arr[curr]>arr[j]) {
//                 curr=j;
//             }
//         }
//         int temp=arr[curr];
//         arr[curr]=arr[i];
//         arr[i]=temp;
//     }
//     for (int i = 0; i < arr.length; i++) {
//         System.out.print(arr[i]+" ");
        
//     }
// }
//     public static void main(String[] args) {
//         int arr[]={5,4,1,3,2};
//         selectionsort(arr);
//     }
// }

// insertion sort
// public class sorting {
// public static void insertion(int arr[]){
//     for (int i = 1; i < arr.length; i++) {
//         int curr=arr[i];
//         int prev=i-1;
//         while (prev>=0 && arr[prev]>curr) {
//             arr[prev+1]=arr[prev];
//             prev--;
//         }
//         arr[prev+1]=curr;
//     }
    

// public static void printarr(Integer arr[]){
//     for (Integer i = 0; i < arr.length; i++) {
//         System.out.print(arr[i]);
//     }
// }

// public static void main(String[] args) {
    // Integer arr[]={5,4,1,3,2};// in place of int use Integer if error occurs.
    // Arrays.sort(arr);
//     printarr(arr);
//     Arrays.sort(arr,Collections.reverseOrder());
// }
// }
        