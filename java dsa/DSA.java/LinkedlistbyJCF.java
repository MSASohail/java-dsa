// This is by using Java Collection Framework
import java.util.*;
/*  
public class LinkedlistbyJCF {
    public static void main(String[] args) {
        LinkedList<Integer> ll=new LinkedList<>();
        ll.addLast(1);
        ll.addFirst(0);
        ll.add(0, 1000);
        System.out.println(ll);
        
    }
}
*/ 
/*
// Mergesort on Linkedlist
public class LinkedlistbyJCF {
public Node mergesort(Node head){
    if (head==null && head.next==null) {
        return head;
    }
    // Find the mid
     Node mid=getmid();
    // Divide the LL into 2 halfs lefthead and righthead
    Node righthead=mid.next;
    mid.next=null;
    Node newleft=mergesort(head);
    Node newright=mergesort(righthead);
    return merge(newleft,newright);
}

    // Merge
    public static void main(String[] args) {

    }
}
*/
// merge two lists
public class LinkedlistbyJCF {
public static class Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;
        this.next=null;
    }
    public static Node head;
    public static Node tail;
}
public static void print(Node temp){
    while (temp!=null) {
        System.out.print(temp.data);
        temp=temp.next;
    }
}
public static Node sortedlist(Node a,Node b){
    Node result=null;
   if (a==null) {
    return b;
   }else if (b==null) {
    return b;
   }
   if (a.data<=b.data) {
    result=a;
    result.next=sortedlist(a.next, b);
   }else{
    result=b;
    result.next=sortedlist(a, b.next);
   }
        return result;
}
public static Node mergeklists(Node arr[],int last){
    while (last!=0) {
        int i=0,j=last;
        while(i<j) {
            arr[i]=sortedlist(arr[i], arr[j]);
            i++;
            j--;
            if (i>=j) {
                last=j;
            }
        }
    }
    return arr[0];
}
    public static void main(String[] args) {
        int k=3;
        int n=4;
        Node arr[]=new Node[k];
// 3 5 7
        arr[0]=new Node(1);
        arr[0].next=new Node(3);
        arr[0].next.next=new Node(5);
        arr[0].next.next.next=new Node(7);

// 2 4 6 8
        arr[1]=new Node(2);
        arr[1].next=new Node(4);
        arr[1].next.next=new Node(6);
        arr[1].next.next.next=new Node(8);
// 0 9 10 11
       arr[2]=new Node(0);
       arr[2].next=new Node(9);
       arr[2].next.next=new Node(10);
       arr[2].next.next.next=new Node(11);

    Node head=mergeklists(arr, k-1);
    print(head);




        
    }
}
// 1.sortedlist
// 2.mergeklist