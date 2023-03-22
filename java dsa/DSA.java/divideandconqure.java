// public class divideandconqure {
//     public static void printarr(int arr[]){
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i]);
//         }
//         System.out.println();
//     }
// public static void mergesort(int arr[],int si,int ei){
//     // base case
//     if (si>=ei) {
//         return;
//     }
//     // kaam
//     int mid=si+(ei-si)/2;
//     mergesort(arr, si, mid);//left
//     mergesort(arr, mid+1, ei);//right
//     merge(arr, si,mid, ei);
// }
// public static void merge(int arr[],int si,int mid,int ei){
//     int temp[]=new int[ei-si+1];
//     int i=si;//iterator for left.
//     int j=mid+1;//iterator for right.
//     int k=0;//iterator for temp[].
//     while (i<=mid && j<=ei) {
//         if (arr[i]<arr[j]) {
//             temp[k]=arr[i];
//             i++ ;
//         } else {
//             temp[k]=arr[j];
//             j++;
//         }
//         k++;
//     }
//     // this is for left over part
//     while (i<=mid) {
//         temp[k++]=arr[i++];//left
//     }
//     while (j<=ei) {
//         temp[k++]=arr[j++];//right
//     }
//     //copying the elements of temp to the original array
//     for ( k = 0,i=si; k < temp.length; k++,i++) {
//         arr[i]=temp[k];
//     }
// }

//     public static void main(String[] args) {
//         int arr[]={2,7,4,5,3,6,8};

//         // mergesort(arr, 0, arr.length-1);
//         printarr(arr);
//     }
// }

// Quicksort
// public class divideandconqure {
//     public static void printarr(int arr[]) {
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//     }

//     public static void quicksort(int arr[], int si, int ei) {
//         if (si >= ei) {
//             return;
//         }
//         int pIdx = partition(arr, si, ei);
//         quicksort(arr, si, pIdx - 1);// left side of the pivite index.
//         quicksort(arr, pIdx + 1, ei);// right side of the pivite index.
//     }

//     public static int partition(int arr[], int si, int ei) {
//         int pivot = arr[ei];
//         int i = si - 1;
//         for (int j = si; j < ei; j++) {
//             if (arr[j] <= pivot) {
//                 i++;
//                 // swap
//                 int temp = arr[j];
//                 arr[j] = arr[i];
//                 arr[i] = temp;
//             }
//         }
//         i++;
//         // swap
//         int temp = pivot;
//         arr[ei] = arr[i];
//         arr[i] = temp;
//         return i;
//     }

//     public static void main(String[] args) {
//         int arr[] = { 6, 3, 9, 8, 2, 5,-5 };
//         quicksort(arr, 0, arr.length-1);
//         printarr(arr);
//     }
// }

// public class divideandconqure {
// public static int search(int arr[], int tar, int si, int ei) {
// // base
// if (si > ei) {
// return -1;
// }
// // kaam
// int mid = si + (ei - si) / 2;
// // case found
// if (arr[mid] == tar) {
// return mid;
// }
// // mid on Li
// if (arr[si] <= arr[mid]) {
// if (arr[si] <= tar && tar <= arr[mid]) {
// return search(arr, tar, si, mid - 1);
// } else {
// return search(arr, tar, mid + 1, ei);
// }
// }
// // mid on l2
// else {
// if (arr[mid] <= tar && tar <= arr[ei]) {
// return search(arr, tar, mid + 1, ei);
// } else {
// return search(arr, tar, si, mid - 1);
// }
// }

//     public static void main(String[] args) {
//         int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
//         int target = 0;
//         int taridx = search(arr, target, 0, arr.length - 1);
//         System.out.println(taridx);
//     }
// }

// Apply Merge sort to sort an array of Strings
// public class divideandconqure {
//     public static String[] mergesort(String[] arr, int lo, int hi) {
//         if (lo == hi) {
//             String[] A = { arr[lo] };
//             return A;
//         }
//         int mid = lo + (hi - lo) / 2;
//         String[] arr1 = mergesort(arr, lo, mid);
//         String[] arr2 = mergesort(arr, mid + 1, hi);
//         String[] arr3 = merge(arr1, arr2);
//         return arr3;
//     }

//     public static String[] merge(String[] arr1, String[] arr2) {
//         int m = arr1.length;
//         int n = arr2.length;
//         String[] arr3 = new String[m+n];
//         int idx = 0;
//         int i = 0;
//         int j = 0;
//         while (i < m && j < n) {
//             if (isalphabeticallysmaller(arr1[i], arr2[j])) {
//                 arr3[idx] = arr1[i];
//                 i++;
//                 idx++;
//             } else {
//                 arr3[idx] = arr2[j];
//                 j++;
//                 idx++;
//             }
//         }
//         while (i < m) {
//             arr3[idx] = arr1[i];
//             i++;
//             idx++;
//         }
//         while (j < n) {
//             arr3[idx] = arr2[j];
//             j++;
//             idx++;
//         }
//         return arr3;
//     }

//     public static boolean isalphabeticallysmaller(String str1, String str2) {
//         if (str1.compareTo(str2) < 0) {
//             return true;
//         }
//         return false;
//     }

//     public static void main(String[] args) {
//         String[] arr = { "sun", "earth", "mars", "mercury" };
//         String[] a = mergesort(arr, 0, arr.length - 1);
//         for (int i = 0; i < a.length; i++) {
//             System.out.println(a[i]);
//         }
//     }
// }

// Given an array nums of size n, return the majority element
// Sample Input 1: nums = [3,2,3]
// Sample Output 1: 3
// Sample Input 2: nums = [2,2,1,1,1,2,2]
// Sample Output 2: 2.

// public class divideandconqure {
    // public static int majorityelement(int num[]){
    // int majoritycount=num.length/2;
    // for (int i = 0; i < num.length; i++) {
    // int count=0;
    // for (int j = 0; j < num.length; j++) {
    // if (num[j]==num[i]) {
    // count+=1;
    // }
    // }
    // if (count>majoritycount) {
    // return num[i];
    // }
    // }
    // return -1;
    // }
//     public static void main(String[] args) {
//         int num[] = { 2, 3, 1, 1, 1, 2,5,3,1,1 };
//         System.out.println(majorityelement(num));
//     }
// }

// Q4. Count conversion
// public class divideandconqure {
// public static int conversion(int arr[]){
//     int inconver=0;
//     for (int i = 0; i < arr.length-1; i++) {    
//         for (int j = i+1; j < arr.length; j++) {
//             if (arr[i]>arr[j]) {
//                 inconver+=1;
//             }
//         }
//     }
//     return inconver;
// }
// public static int merge(int arr[],int left,int mid,int right){
//     int i=left,j=midcover=0;
//     while ((i<mid)&&(j<=right)) {
//         if (arr[i]<=arr[j]) {
//             temp[k]=arr[i];
//             i++;
//             k++;    } else {
//             temp[k]=arr[j];
//             incover+=(mid-i);
//             j++;
//             k++;
//         }
//     }
//     while (i<mid) {
//         temp[k]=arr[i];
//         k++;
//         i++;
        
//     }
//     while (j<=right) {
//         temp[k]=arr[j];
//         k++;
//         j++;
        
//     }
//     for (i=left,k=0;i<=right;i++,k++) {
//         arr[i]=temp[k];
//     }
//    return incover;
// }
// public static int mergesort(int arr[],int left,int right){
//     int incover=0;
//     if (right>left) {
        
//         int mid=(right+left)/2;
//         incover= mergesort(arr, left, mid);
//         incover+=mergesort(arr, mid+1, right);
//         incover+=merge(arr, left,mid+1, right );
//     }
//     return incover;
// }
// public static int getinversion(int arr[]){
//   return  mergesort(arr, 0, arr.length-1);
// }
//     public static void main(String[] args) {
//         int arr[]={2,4,1,3,5};
//         System.out.println(getinversion(arr));
//     }
// }