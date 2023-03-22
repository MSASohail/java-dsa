import java.util.*;

/*public class Arraylist {

    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<Boolean> list2 =new ArrayList<>();

        // Operations
        // add
        list.add(1);//O(1)
        list.add(2);
        list.add(3);
        list.add(5);
        list.add(1, 22); O(N)
        System.out.println(list);
        
        // get
       int elem= list.get(0); O(1)
         System.out.println(elem);

        //  remove
        list.remove(3); O(N)
        System.out.println(list);

        // set
        list.set(3, 98); O(N)
        System.out.println(list);

        // contains
        System.out.println(list.contains(2)); O(N)
        System.out.println(list.contains(95));

        // SIZE
        System.out.println(list.size());
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
                        
        // Print Reverse
        for (int i = list.size()-1; i >=0; i--) {
            System.out.print(list.get(i)+" ");
        }
    }
}

// Find the maximum in an Arraylist
// public class Arraylist {
// public static void main(String[] args) {
//     ArrayList<Integer> list=new ArrayList<>();
//     list.add(1);
//     list.add(2);
//     list.add(3);
//     list.add(4);
//     list.add(5);
    
//     int max=Integer.MIN_VALUE;
//     for (int i = 0; i < list.size(); i++) {
//         // if (max<list.get(i)) {
//         //     max=list.get(i);
//         // }
//         max=Integer.max(max, list.get(i));
//     }
//     System.out.println(max);
// }
    
// }

// Swap 2 Numbers
// public class Arraylist {
//     public static void swap(ArrayList<Integer> list,int indx1,int indx2){
//            int temp=indx1;
//            list.set(indx1, list.get(indx2));
//            list.set(indx2, temp);
//     }
//     public static void main(String[] args) {
//         ArrayList<Integer> list=new ArrayList<>();
//         list.add(1);
//         list.add(2);
//         list.add(3);
//         list.add(4);
//         list.add(5);
//         int idx1=1,indx2=3;
//         System.out.println(list);
//         swap(list, 1, 3);
//         System.out.println(list);
//     }
// }

// Sorting in arraylist
// public class Arraylist {
// public static void main(String[] args) {
//     ArrayList<Integer> list=new ArrayList<>();
//     list.add(9);
//     list.add(2);
//     list.add(8);
//     list.add(4);
//     list.add(5);
//     Collections.sort(list);//Ascending order
//     System.out.println(list);
//     Collections.sort(list,Collections.reverseOrder());//descending order
//     System.out.println(list);

// }
// }

// Multidimensional Arraylist
public class Arraylist {

    public static void main(String[] args) {
        ArrayList<ArrayList> mainlist=new ArrayList<>();
        ArrayList<Integer> list=new ArrayList<>();
        list.add(3);list.add(4);
        mainlist.add(list);

        ArrayList<Integer> list2=new ArrayList<>();
        list2.add(9);list2.add(10);
        mainlist.add(list2);

        for (int i = 0; i < mainlist.size(); i++) {
            ArrayList<Integer>currlist=mainlist.get(i);
            for (int j = 0; j < currlist.size(); j++) {
                System.out.print(currlist.get(j));
            }
            System.out.println();
        }
    }
}

// Q
// list1:12345;
// list2:246810;
// list3:3691215;

public class Arraylist {

    public static void main(String[] args) {
        ArrayList<ArrayList> mainlist=new ArrayList<>();
        ArrayList<Integer>list1=new ArrayList<>();
        ArrayList<Integer>list2=new ArrayList<>();
        ArrayList<Integer>list3=new ArrayList<>();

        for (int i = 0; i <=5; i++) {
            list1.add(1*i);
            list2.add(2*i);
            list3.add(3*i);
        }
        mainlist.add(list1);
        mainlist.add(list2);
        mainlist.add(list3);
        System.out.println(mainlist);
        for (int i = 0; i < mainlist.size(); i++) {
            ArrayList<Integer>currlist=mainlist.get(i);
            for (int j = 0; j < currlist.size(); j++) {
                System.out.print(currlist.get(j)+" ");
            }
            System.out.println();
        }
    }
}

public class Arraylist {
// public static int storewater(ArrayList<Integer> height){
//     int max=0;
//     for (int i = 0; i < height.size(); i++) {
//         for (int j =i+1; j < height.size(); j++) {
//             int ht=Math.min(height.get(i), height.get(j));
//             int width=j-i;
//             int water=ht*width;
//             max=Math.max(max, water);
//         }
//     }
//     return max;
// }
public static int storewater(ArrayList<Integer> height){
    int max=0;
    int lp=0;
    int rp=height.size()-1;
    while (lp<rp) {
        int ht=Math.min(height.get(lp), height.get(rp));
        int width=rp-lp;
        int currwater=ht*width;
        max=Math.max(max, currwater);
        if (height.get(lp)<height.get(rp)) {
            lp++;
        } else {
            rp--;
        }
    }
    return max;
}
public static void main(String[] args) {
    ArrayList<Integer> height=new ArrayList<>();
    height.add(1);
    height.add(8);
    height.add(6);
    height.add(2);
    height.add(5);
    height.add(4);
    height.add(8);
    height.add(3);
    height.add(7);
    // System.out.println(height);
    // System.out.println(storewater(height));
    System.out.println(storewater(height));
}

}
// PairSum1(Brute force)
// Find if any pair in a sorted Arraylist has a target sum.
// list=[1,2,3,4,5,6] target=6
public class Arraylist {
    // public static boolean pairsum1(ArrayList<Integer> list, int target) {
    //     for (int i = 0; i < list.size(); i++) {
    //         for (int j = i+1; j < list.size(); j++) {
    //             if (list.get(i)+list.get(j)==target) {
    //                 return true;
    //             }
    //         }
    //     }
    //     return false;
    // }
public static boolean pairsum2(ArrayList<Integer> list,int target){
    int lp=0;
    int rp=list.size()-1;
    while (lp<rp) {
        if (list.get(lp)+list.get(rp)==target) {
            return true;
        }
        if (list.get(lp)+list.get(rp)<target) {
            lp++;
        } else {
            rp--;
        }
    }
    return false;
} 
public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);
    int target=61;
    System.out.print(pairsum2(list, target));
}
}

// pairsum2
// Find if any pair in a sorted and rotated ArrayList has a target Sum
// List=[11,15,6,8,9,10]

// (Brute Force)
public class Arraylist {
    //     public static boolean pairsum2( ArrayList<Integer>list,int tar){
//     for (int i = 0; i < list.size(); i++) {
//         for (int j = i+1; j < list.size(); j++) {
//             if (list.get(i)+list.get(j)==tar) {
//                 return true;
//             }
//         }
//     }
//     return false;
// }

// (Optimised)
public static boolean pairsum2(ArrayList<Integer>list,int tar){
    int bp=-1;
    for (int i = 0; i < list.size(); i++) {
        if (list.get(i)>=list.get(i+1)) {
            bp=i;
            break;
        }
    }
    int lp=bp+1;
    int rp=bp;
    while (lp!=rp) {
        if (list.get(lp)+list.get(rp)==tar) {
            return true;
        }
        if (list.get(lp)+list.get(rp)<tar) {
            lp=(lp+1)%list.size();
        } else {
            rp=(list.size()+rp-1)%list.size();
        }
    }
    return false;
}
public static void main(String[] args) {
    ArrayList<Integer>list=new ArrayList<>();
    list.add(11);
    list.add(15);
    list.add(6);
    list.add(8);
    list.add(9);
    list.add(10);
    int tar=16;
    System.out.println(pairsum2(list, tar));
}
}


public class Arraylist {
    public static boolean monotonic(ArrayList<Integer>list){
        boolean inc=true;
        boolean dec=true;
        for (int i = 0; i < list.size()-1; i++) {
            if (list.get(i)>list.get(i+1)) {
                inc=false;
            }
            
            if (list.get(i)<list.get(i+1)) {
                dec=false;
            }
            
        }
        return inc||dec;   
    }
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        
        
        System.out.println(monotonic(list));
    }
}
Sample Input 1
: nums = [10,6,5,8]
Sample Output 1
: [10,8]

public class Arraylist {
    public static ArrayList lonelynum(ArrayList<Integer> nums) {
        Collections.sort(nums);
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i < nums.size() - 1; i++) {
            if (nums.get(i - 1) + 1 < nums.get(i) && nums.get(i) + 1 < nums.get(i + 1)) {
                list.add(nums.get(i));
            }
        }
        if (nums.size() == 1) {
            list.add(nums.get(0));
        }
        if (nums.size() > 1) {
            if (nums.get(0) + 1 < nums.get(1)) {
                list.add(nums.get(0));
            }
            if (nums.get(nums.size() - 2) + 1 < nums.get(nums.size() - 1)) {
                list.add(nums.get(nums.size() - 1));
            }
            
        }
        return list;
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(6);
        nums.add(5);
        nums.add(8);
        System.out.println(lonelynum(nums));
    }
}
public class Arraylist {
    public static int mostfreq(ArrayList<Integer>list,int key){
    int result[]=new int[1000];
    for (int i = 0; i < list.size()-1; i++) {
        if (list.get(i)==key) {
            result[list.get(i+1)-1]++;
        }
    }
    int max=Integer.MIN_VALUE;
    int ans=0;
    for (int i = 0; i < 1000; i++) {
        if (result[i]>max) {
            max=result[i];
            ans=i+1;
        }
    }
    return ans;
}
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(100);
        list.add(1);
        list.add(100);
        int key=1;
        System.out.println(mostfreq(list, key));
    }
}
    */
// public class Arraylist {
//     public static ArrayList<Integer> beautifularray(int n) {
//         ArrayList<Integer>ans=new ArrayList<>();
//         ans.add(1);

//         for (int i = 2; i <=n; i++) {
//             ArrayList<Integer>temp=new ArrayList<>();
//             for (Integer e:ans) {
//                 if (2*e<=n) {
//                     temp.add(2*e);
//                 }
//             }
//             for (Integer e:ans) {
//                 temp.add(2*e-1);
//             }
//             ans=temp;

//         }
// return ans;
//     }

//     public static void main(String[] args) {

// System.out.println(beautifularray(3));
//     }
// }

public class Arraylist {
    public static ArrayList<Integer> beautifularray(int n) {
        ArrayList<Integer> res = new ArrayList<>();
        divideandconqure(1, 1, res, n);
        return res;
    }

    public static void divideandconqure(int start, int increment, ArrayList<Integer> res, int n) {
        if (start + increment > n) {
            res.add(start);
            return;
        }
        divideandconqure(start, 2 * increment, res, n);
        divideandconqure(start + increment, 2 * increment, res, n);
    }

    public static void main(String[] args) {
        System.out.println(beautifularray(3));
    }
}