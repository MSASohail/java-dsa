import java.util.*;
import java.util.LinkedList;

// public class Queueb {
// public static class Queue {
// static int arr[];
// static int size;
// static int rear;
// static int front;

// Queue(int n) {
// arr = new int[n];
// size = n;
// rear = -1;
// front=-1;
// }

// // isEmpty
// public static boolean isEmpty() {
// return rear == -1 && front==-1;
// }
// // is full
// public static boolean isfull(){
// return (rear+1)%size==front;
// }

// // add
// public static void add(int data) {
// if (isfull()) {
// System.out.println("the Queue is full");
// return;
// }
// // for 1st element
// if (front==-1) {
// front=0;
// }
// rear = (rear + 1)%size;
// arr[rear] = data;
// }

// // Remove
// public static int remove(){
// if (isEmpty()) {
// System.out.println("the Queue is empty");
// return -1;
// }
// int res=arr[front];
// if (rear==front) {
// rear=front=-1;
// } else {
// front=(front+1)%size;
// }
// return res;
// }
// // peek
// public static int peek(){
// if (isEmpty()) {
// System.out.println("the Queue is empty");
// return -1;
// }
// return arr[front];
// }
// }

// Queue using linkedlist

// static class Node{
// int data;
// Node next;
// Node(int data){
// this.data=data;
// this.next=null;
// }
// }
// public static class Queue{
// static Node head=null;
// static Node tail=null;
// public static boolean isEmpty(){
// return head==null && tail==null;
// }
// public static void add(int data){
// Node newnode=new Node(data);
// if (head==null) {
// head=tail=newnode;
// return;
// }
// tail.next=newnode;
// tail=newnode;
// }

// public static int remove(){
// if (isEmpty()) {
// return -1;
// }
// int front=head.data;
// if (head==tail) {
// head=tail=null;
// }else{
// head=head.next;

// }
// return front;
// }
// public static int peek(){
// if (isEmpty()) {
// return -1;
// }
// return head.data;
// }
// }

// public static void main(String[] args) {
// Queue q=new Queue();
// q.add(1);
// q.add(2);
// q.add(3);
// System.out.println(q.remove());

// q.add(4);
// System.out.println(q.remove());
// q.add(5);
// while (!q.isEmpty()) {
// System.out.println(q.peek());
// q.remove();

// }

// }

// Queue using 2 Stacks
// static class Queue {
// static Stack<Integer> s1 = new Stack<>();
// static Stack<Integer> s2 = new Stack<>();

// // isEmpty
// public static boolean isEmpty() {
// return s1.isEmpty();
// }

// // Add
// public static void add(int data) {
// s1.push(data);
// }

// // //Remove

// public static int remove() {
// while (!s1.isEmpty()) {
// s2.push(s1.pop());
// }
// int ans = s2.pop();
// while (!s2.isEmpty()) {
// s1.push(s2.pop());
// }
// return ans;
// }

// // // peek
// public static int peek() {
// while (!s1.isEmpty()) {
// s2.push(s1.pop());
// }
// int res = s2.peek();
// while (!s2.isEmpty()) {
// s1.push(s2.pop());
// }
// return res;
// }

// public static void main(String[] args) {
// Queue q = new Queue();
// q.add(1);
// q.add(2);
// q.add(3);
// q.add(4);
// q.add(5);
// q.add(6);

// while (!q.isEmpty()) {
// System.out.println(q.peek());
// q.remove();
// }
// }
// }

// stack using 2 Queues
// public static class Stack {
//     static Queue<Integer> q1 = new LinkedList<>();
//     static Queue<Integer> q2 = new LinkedList<>();

// // isempty
// public static boolean isEmpty() {
// return q1.isEmpty() && q2.isEmpty();
// }

// // add
// public static void push(int data) {
// if (!q1.isEmpty()) {
// q1.add(data);
// } else {
// q2.add(data);
// }
// }

// // pop
// public static int pop() {
// if (isEmpty()) {
// System.out.println("empty stack");
// return -1;
// }
// int top = -1;
// if (!q1.isEmpty()) {// case 1
// while (!q1.isEmpty()) {
// top = q1.remove();
// if (q1.isEmpty()) {
// break;
// }
// q2.add(top);
// }
// } else {// case 2
// while (!q2.isEmpty()) {
// top = q2.remove();
// if (q2.isEmpty()) {
// break;
// }
// q1.add(top);
// }
// }
// return top;
// }

// public static int peek() {
// if (isEmpty()) {
// System.out.println("empty stack");
// return -1;
// }
// int top = -1;
// if (!q1.isEmpty()) {// case 1
// while (!q1.isEmpty()) {
// top = q1.remove();

// q2.add(top);
// }
// } else {// case 2
// while (!q2.isEmpty()) {
// top = q2.remove();

// q1.add(top);
// }

// }
// return top;
// }

// // isempty
//         public static boolean isEmpty() {
//             return q1.isEmpty() && q2.isEmpty();
//         }

//         // add
//         public static void push(int data) {
//             while (!q1.isEmpty()) {
//                 q2.add(q1.remove());

//             }
//             q1.add(data);

//             while (!q2.isEmpty()) {
//                 q1.add(q2.remove());
//             }
//         }

//         public static int pop() {
//             return q1.remove();
//         }

//         public static int peek() {
//             if (isEmpty()) {
//                 return -1;
//             }
//             return q1.peek();            
//         }

//     }

//     public static void main(String[] args) {
//         Stack s1 = new Stack();
//         s1.push(1);
//         s1.push(2);
//         s1.push(3);
//         while (!s1.isEmpty()) {
//             System.out.println(s1.peek());
//             s1.pop();
//         }
//     }
// }

// First non repeating letter
// public class Queueb {
//     public static void nonrepeating(String str){
//         int freq[]=new int[26];//a-z
//         Queue <Character> q=new LinkedList<>();
//         for (int i = 0; i < str.length(); i++) {
//             char ch=str.charAt(i);
//             q.add(ch);
//             freq[ch-'a']++;

//             while (!q.isEmpty() && freq[q.peek()-'a']>1) {
//                 q.remove();
//             }

//             if (q.isEmpty()) {
//                 System.out.print(-1);
//             } else {
//                 System.out.print(q.peek());
//             }
//         }
//         System.out.println();

//     }
//     public static void main(String[] args) {
//         String str="abbccxb";
//         nonrepeating(str);
//     }
// }

// Interleave two halves
// ip=1 2 3 4 5 6 7 8 9 10
// op=1 6 2 7 3 8 4 9 5 10
// public class Queueb {
//     public static void interleaf(Queue<Integer> q) {
//         Queue<Integer> firsthalf = new LinkedList<>();
//         int size = q.size();
//         for (int i = 0; i < size / 2; i++) {
//             firsthalf.add(q.remove());
//         }
//         while (!firsthalf.isEmpty()) {
//             q.add(firsthalf.remove());
//             q.add(q.remove());
//         }

//     }

//     public static void main(String[] args) {
//         Queue<Integer> q = new LinkedList<>();
//         q.add(1);
//         q.add(2);
//         q.add(3);
//         q.add(4);
//         q.add(5);
//         q.add(6);
//         q.add(7);
//         // q.add(8);
//         // q.add(9);
//         // q.add(10);
//       interleaf(q);

//         while (!q.isEmpty()) {
//             System.out.print(q.remove()+" ");
//         }

//     }
// }

// Reverse Queue
// public class Queueb {
//     public static void reverse(Queue<Integer> q) {
//         Stack<Integer> s=new Stack<>();
//         while (!q.isEmpty()) {
//             s.push(q.remove());
//         }
//         while (!s.isEmpty()) {
//             q.add(s.pop());
//         }
//       }
//     public static void main(String[] args) {
//         Queue<Integer> q = new LinkedList<>();
//         q.add(1);
//         q.add(2);
//         q.add(3);
//        reverse(q);
//        while (!q.isEmpty()) {
//         System.out.println(q.remove());        
//        }
//     }
// }

// Deque
// public class Queueb {

//     public static void main(String[] args) {
//         Deque<Integer>deq=new LinkedList<>();
//         deq.addFirst(null);
//         deq.addFirst(2);
//         deq.addFirst(3);
//     }
// }

// Implementing Stack using Deque.
public class Queueb {
    public static class Stack {
        Deque<Integer> deq=new LinkedList<>();
        public  void push(int data){
            deq.addLast(data);
        }
        // pop
        public int  pop(){
            return deq.removeLast();
        }
        // peek
        public int peek(){
            return deq.getLast();
        }

    }

    public static void main(String[] args) {
Stack s=new Stack();
s.push(1);
s.push(2);
s.pop();
System.out.print(s);
    }
}