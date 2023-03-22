
import java.util.*;
// public class StackB {

//   /*  This is Stack using ArrayList
//     public  static class Stack{
//       static  ArrayList<Integer>list =new ArrayList<>();
//         public static boolean isEmpty(){
//             return list.size()==0;
//         } 
//         // push
//         public  void push(int data){
//             list.add(data);
//         }
//         // pop
//         public static int pop(){
//             if (isEmpty()) {
//                 return -1;
//             }
//            int top= list.get(list.size()-1);
//            list.remove(list.size()-1);
//            return top;
//         } 
//         // peek
//         public static int peek(){
//             if (isEmpty()) {
//                 return -1;
//             }
//           return  list.get(list.size()-1);

//         }
//     }*/
//     // This is Stack using LinkedList
//     // static class Node{
//     //     int data;
//     //     Node next;
//     //     public Node(int data){
//     //         this.data=data;
//     //         this.next=null;
//     //     }
//     // }
//     // public static class Stack{
//     //     public static Node head;
//     //     public static boolean isempty(){
//     //         return head==null;
//     //     }
//     //     // push
//     //     public static void push(int data){
//     //         Node newnode=new Node(data);
//     //         newnode.next=head;
//     //         head=newnode;
//     //     }
//     //     public static int pop(){
//     //         if (isempty()) {
//     //             return -1;
//     //         }
//     //         int top=head.data;
//     //         head=head.next;
//     //         return top;
//     //     }
//     //     public static int peek(){
//     //         if (isempty()) {
//     //             return -1;
//     //         }
//     //         return head.data;
//     //     }
//     // }    
//         public static void main(String[] args) {
//         // Stack s=new Stack();
//         Stack <Integer>s=new Stack<>();

//         s.push(1);
//         s.push(2);
//         s.push(3);
//         s.push(4);

//         while (!s.isEmpty()) {
//             System.out.println(s.peek());
//             s.pop();
//         }
//     }
// }

/*public  class StackB{
    public static void pushAtBottom(Stack<Integer>s,int data){
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int top=s.pop();
         pushAtBottom(s, data);
         s.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> s =new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        pushAtBottom(s,5);
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
}
*/
// public class StackB {
// public static String reversestring(String str){
// Stack<Character>s=new Stack<>();
// int idx=0;
// while (idx<str.length()) {
//     s.push(str.charAt(idx));
//     idx++;
// }
// StringBuilder result=new StringBuilder("");
// while (!s.isEmpty()) {
//     char curr=s.pop();
//     result.append(curr);
// }
// return result.toString();
// }
//     public static void main(String[] args) {
//         String str="sohail";
//         String result= reversestring(str);
//         System.out.println(result);
//     }

// }


// public class StackB {
//     public static void stockspan(int stocks[], int span[]) {
//         Stack<Integer> s = new Stack<>();
//         span[0]=1;
//         s.push(0);
//         for (int i = 1; i < stocks.length; i++) {
//             int curr=stocks[i];
//             while (!s.isEmpty() && curr>stocks[s.peek()]) {
//                 s.pop();
//             }
//             if (s.isEmpty()) {
//                 span[i]=i+1;
//             }else{
//                 int prevhigh=s.peek();
//                 span[i]=i-prevhigh;               
//             }        
//             s.push(i);
//         }
//     }

//     public static void main(String[] args) {
//         int stocks[] = { 100, 80, 60, 70, 60, 85, 100 };
//         int span[] = new int[stocks.length];
//         stockspan(stocks, span);
//         for (int i = 0; i < span.length; i++) {
//             System.out.println(span[i]);
//         }
//     }
// }


// Next greater element
/*public class StackB {

    public static void main(String[] args) {
        int arr[]={6,8,0,1,3};
        Stack<Integer>s=new Stack<>();
        int nxtgreater[]=new int[arr.length];
        for (int i = 0; i <=arr.length-1; i++) {
            while (!s.isEmpty() && arr[s.peek()]<=arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nxtgreater[i]=-1;
            }else{
                nxtgreater[i]=arr[s.peek()];
            }
            s.push(i);
        }

        for (int i = 0; i < nxtgreater.length; i++) {
            System.out.print(nxtgreater[i]+" ");
        }
        System.out.println();
    }
}
*/

// Valid parenthesis
// public class StackB {
// public static boolean  parenthesis(String str){
//      Stack<Character>s=new Stack<>();
//     for (int i = 0; i < str.length(); i++) {
//         char curr=str.charAt(i);
//         // opening
//         if ( curr=='(' || curr =='[' || curr =='{') {
//             s.push(curr);    
//         }else{
//             // closing
//             if (s.isEmpty()) {
//                 return false;
//             }
//             if ((  s.peek()=='('&&curr==')' ||   s.peek()=='['&&curr==']' || s.peek()=='{' && curr =='}')) {
//                 s.pop();
//             }else{
//                 return false;
//             }
//         }
//     }
//     if (s.isEmpty()) {
//         return true;
//     }else{
//         return false;
//     }
// }
//     public static void main(String[] args) {
//         String str="{[]}";
//         System.out.println(parenthesis(str));
    
//     }
// }


// Duplicate parenthesis
/*public class StackB {
public static boolean dubparenthesis(String str){
    Stack<Character> s=new Stack<>();
    for (int i = 0; i < str.length(); i++) {
        char ch=str.charAt(i);
        // closing
        if (ch==')') {
            int count=0;
            while (s.peek()!='(') {     
                    s.pop();
                    count++;
                }
                if (count<1) {
                    return true;//duplicate
                }else{
                    // opening
                    s.pop();
                }          
        }else{
            s.push(ch);         
        }
    }
    return false;
}
    public static void main(String[] args) {
        String str="(b+c-d+(c))";//false
        String str2= "((a+b)(b-b))";//true
        System.out.println(dubparenthesis(str));
    }
}*/



// Max area in HISTOGRAM
public class StackB {
public  static void maxarea(int arr[]){
    int maxarea=0;
    int nsl[]= new int[arr.length];
    int nsr[]=new int [arr.length];
    // next smaller right
    Stack <Integer>s=new Stack<>();
    for (int i = arr.length-1; i>=0; i--) {
        while (!s.isEmpty() && arr[s.peek()]>=arr[i]) {
            s.pop();
        }
        if (s.isEmpty()) {
            nsr[i]=arr.length;
        } else {
            nsr[i]=s.peek();
        }
        s.push(i);
    }

    // next smaller left
    s=new Stack<>();
    for(int i=0;i<=arr.length-1;i++){
        while (!s.isEmpty() && arr[s.peek()]>=arr[i]) {
            s.pop();
        }
        if (s.isEmpty()) {
            nsl[i]=-1;
        }else{
            nsl[i]=s.peek();
        }
        s.push(i);
    }
    // Currarea:height*width ; width=j-i-1 (or) nsr[i]-nsl[i]-1;
    for (int i = 0; i < arr.length; i++) {
        int height=arr[i];
        int width=nsr[i]-nsl[i]-1;
        int Currarea=height*width;
        maxarea=Math.max(maxarea, Currarea);

    }
    System.out.println("the maximum in histogram"+maxarea);
}
    public static void main(String[] args) {
        int arr[]={2,1,5,6,2,3};
        maxarea(arr);
    }
}

