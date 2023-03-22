
// import java.lang.reflect.Array;
import java.util.*;

// q1. Activity Selection

// public class Greedyalgo{
//     public static void main(String[] args) {
//         int start[]={1,3,0,5,8,5};
//         int end[]={2,4,6,7,9,9};
//     //    int start[] = {1, 3, 2, 5};
//     //      int end[] = {2, 4, 3, 6};

//         // 
//         // end time bases is sorted
//         int maxact=0;
//         ArrayList<Integer>ans=new ArrayList<>();
//         maxact=1;
//         ans.add(0);

//         int lastend=end[0];
//         for (int i = 1; i < end.length; i++) {
//             // activity select
//             if (start[i]>=lastend) {

//                 maxact++;
//                 ans.add(i);
//                 lastend=end[i];
//             }
//         }
//         System.out.println("maximum activities are"+maxact);

//         for (int i = 0; i < ans.size(); i++) {
//             System.out.print("A"+ans.get(i));
//         }
//         System.out.println();
//     }
// }

// This When End Time Is Not Sorted We Have to sort it by using 2D ARRAYS
// public class Greedyalgo {
//     public static void main(String[] args) {
//         int start[] = { 1, 3, 0, 5, 8, 5 };
//         int end[] = { 2, 4, 6, 7, 9, 9 };
//         int activities[][] = new int[start.length][3];
//         for (int i = 0; i < start.length; i++) {
//             activities[i][0] = i;
//             activities[i][1] = start[i];
//             activities[i][2] = end[i];
//         }

//         // Arrays.sort(activities,Comparator.comparingDouble(o ->o[2]));
//         Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));
//         // end time bases is sorted
//         int maxact = 0;
//         ArrayList<Integer> ans = new ArrayList<>();
//         maxact = 1;
//         ans.add(activities[0][0]);

//         int lastend = activities[0][2];
//         for (int i = 1; i < end.length; i++) {
//             // activity select
//             if (activities[i][1] >= lastend) {

//                 maxact++;
//                 ans.add(activities[i][0]);
//                 lastend = activities[i][2];
//             }
//         }
//         System.out.println("maximum activities are" + maxact);

//         for (int i = 0; i < ans.size(); i++) {
//             System.out.print("A" + ans.get(i));
//         }
//         System.out.println();
//     }
// }

// Q2.Fractional Knapscak
// public class Greedyalgo {
// public static void main(String[] args) {
//       int val[]={60,100,120};
//         int weight[]={10,20,30};
//         int W=50;

//         double ratio [] []=new double[val.length][2];
//         // 0th->index;1st->ratio
//         for (int i = 0; i < val.length; i++) {
//             ratio[i][0]=i;
//             ratio[i][1]=val[i]/(double)weight[i];
//         }
//         Arrays.sort(ratio,  Comparator.comparingDouble(o ->o[1]));
//         int capacity=W;
//         int finalval=0;
//         for(int i=ratio.length-1;i>=0;i--){
//         int idx=(int)ratio[i][0];
//             if(capacity>=weight[idx]){
//             finalval+=val[idx];
//             capacity-=weight[idx];
//             }
//         else{
//             finalval+=(ratio[i][1]*capacity);
//             capacity=0;
//             break;
//         }
//         }
//     System.out.println("  "+finalval);
// }
// }

// Min Absolute difference pairs
// public class Greedyalgo {
//     public static void main(String[] args) {
//         int A[] = { 4,1,8,7};
//         int B[] = { 2, 3,6,5 };
//         Arrays.sort(A);
//         Arrays.sort(B);

//         int mindiff = 0;
//         for (int i = 0; i < A.length; i++) {
//             mindiff += Math.abs(A[i]-B[i]);
//         }

//         System.out.println("midifference" +mindiff);
//     }
// }


// chocola problem
//  public class Greedyalgo {

//     public static void main(String[] args) {
//         int n=4,m=6;
//         Integer costver[]={2,1,3,1,4};
//         Integer costhori[]={4,1,2};

//     Arrays.sort(costhori, Collections.reverseOrder());
//     Arrays.sort(costver, Collections.reverseOrder());
//     int h=0,v=0;
//     int hp=1,vp=1;
//     int cost=0;
//     while (h<costhori.length && v<costver.length) {
//         if (costver[v]<=costhori[h]) {
//             cost+=(costhori[h]*vp);
//             hp++;
//             h++;
//         } else {
//             cost+=(costver[v]*hp);
//             vp++;
//             v++;
//         }
//     }

//     while (h<costhori.length ) {
//         cost+=(costhori[h]*vp);
//         hp++;
//         h++;
//     }
//     while ( v<costver.length) {
//         cost+=(costver[v]*hp);
//         vp++;
//         v++;
//     }
//     System.out.println(cost);
//     }
// }




















// public class Greedyalgo {

    // public static void main(String[] args) {
        // int start[]={10,20,20};
        // int end[]={20,25,30};

        // int maxact=1;
        // ArrayList<Integer>ans=new ArrayList<>();
        // ans.add(0);
        // int lastend=end[0];
        // // 1st activity is added
        // for (int i = 0; i < end.length; i++) {
        //     if (start[i]>=lastend) {
        //         maxact++;
        //         ans.add(end[i]);
        //         lastend=end[i];
        //     }
        // }
        // System.out.println(maxact);


        // if end time wqas not sorted
        // int maximum[][]=new int [start.length][3];
        // for (int i = 0; i < start.length; i++) {
        //     maximum[i][0]=i;
        //     maximum[i][1]=start[i];
        //     maximum[i][2]=end[i];
        // }
        // Arrays.sort(maximum, Comparator.comparingDouble(o -> o[2]));
        // int max=1;
        // ArrayList<Integer>ans=new ArrayList<>();
        // ans.add(maximum[0][0]);
        // int lastend=maximum[0][2];
        // for (int i = 0; i < start.length; i++) {
        //     if (maximum[i][1]>=lastend) {
        //         max++;
        //         ans.add(maximum[0][2]);
        //         lastend=maximum[i][2];
        //     }
        // }
        // System.out.println(max);


        // knapsack problem
        // int value[]={60,100,120};
        // int weight[]={10,20,30};
        // int w=50;

        // double ratio[][]=new double [value.length][2];
        // for (int i = 0; i < value.length; i++) {
        //     ratio[i][0]=i;
        //     ratio[i][1]=value[i]/(double)weight[i];
        // }
        // int capacity=w;
        // Arrays.sort(ratio, Comparator.comparingDouble(o->o[1]));
        // int finalval=0;
        // for (int i = ratio.length; i>=0; i--) {
        //     if (capacity>=weight[i]) {
        //         finalval+=value[i];
        //         capacity-=weight[i];
        //     }else{
        //         finalval+=(int)(ratio[i][1]*capacity);\
        //         capacity=0;
        //         break;
        //     }
        // }
        // System.out.println(finalval);
 



        // min absolute difference
        // int a[]={1,2,3};
        // int b[]={2,1,3};

        // int min=0;
        // Arrays.sort(a);
        // Arrays.sort(b);

        // for (int i = 0; i < a.length; i++) {
        //     min+=Math.abs(a[i]-b[i]);
        // }
        // System.out.println(min);




        //  Max length chain of pairs
        // int pairs[][]={{5,24},{39,60},{5,28},{27,40},{50,90}};
        // Arrays.sort(pairs, Comparator.comparingInt(o->o[1]));
        // int charlen=1;
        // int charend=pairs[0][1];
        // for (int i = 0; i < pairs.length; i++) {
        //     if (pairs[i][0]>=charend) {
        //         charlen++;
        //         charend=pairs[i][1];
        //     }
        // }
        // System.out.println(charlen);


        // indian coins

        // Integer coins[]={1,2,5,10,20,50,100,200,500,2000};
        // Arrays.sort(coins, Comparator.reverseOrder());
        // int amount=590;
        // int count=0;
        // ArrayList<Integer>ans=new ArrayList<>();
        // for (int i = 0; i < coins.length; i++) {
        //     if (coins[i]<=amount) {
        //         while (coins[i]<=amount) {
        //             count++;
        //             ans.add(coins[i]);
        //             amount-=coins[i];
        //         }
        //     }
        // }
        // System.out.println(count);



        // Job  sequencing problem


    //    static class Job{
    //         int deadline;
    //         int profit;
    //         int id;
    //         public  Job(int i,int d,int p){
    //             id=i;
    //             deadline=d;
    //             profit=p;
    //         }
    //     }
   
    //     public static void main(String[] args) {
    //         int jobinfo[][]= {{4,20} , {1,10} , {1,40} , {1,30}};

    //         ArrayList<Job> jobs=new ArrayList<>();

    //         for (int i = 0; i < jobinfo.length; i++) {
    //             jobs.add(new Job(i, jobinfo[i][0], jobinfo[i][1]));
    //         }
    //         Collections.sort(jobs,(obj1,obj2) ->obj2.profit-obj1.profit);
    //         // descending order 
    //         ArrayList<Integer>seq=new ArrayList<>();
    //         int time=0;
    //         for (int i = 0; i < jobs.size(); j++) {
    //             Job curr=jobs.get(i);
    //             if (curr.deadline>time) {
    //                 seq.add(curr.id);
    //                 time++;
    //             }
    //         }
    //         System.out.println(seq.size());
    //     }
    // }
// }
public class Greedyalgo {

    public static void main(String[] args) {
        // int n=4;
        // int m=6;
        // Integer costver[]={2,1,3,1,4};
        // Integer costhor[]={4,1,2};

        // Arrays.sort(costhor, Collections.reverseOrder());
        // Arrays.sort(costver, Collections.reverseOrder());
        // int h=0,v=0;
        // int hp=1,vp=1;
        // int cost=0;
        // while (h<=costhor.length && v<=costver.length) {
        //     if (costver[v]<=costhor[h]) {
        //         cost+=costhor[h]*vp;
        //         hp++;
        //         h++;
        //     }else{
        //         cost+=costver[v]*hp;
        //         vp++;
        //         v++;
        //     }
        // }
        // while(h<costhor.length){
        //     cost+=costhor[h]*vp;
        //     hp++;
        //     h++;
        // }
        // while(v<costver.length){
        //     cost+=costver[v]*hp;
        //     vp++;
        //     v++;
        // }
        // System.out.println("min cost of"+cost);


        String str="LRRRRLLRLLRL";
        int r=0,l=0;
        int res=0;
        for (char i :str.toCharArray()) {
            if (i=='R') {
                r++;
            } else {
                l++;
            }
            if (l==r) {
                res++;
            }
        }
        System.out.println(res);
    }
}













