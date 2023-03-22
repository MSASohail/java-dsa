
public class DoubleLinkedlist {
    public class Node{
        int data;
        Node next;
        Node prev;
        public  Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    // addfirst
    public void print(){
        Node temp=head;
        while (temp!=null) {
            System.out.print(temp.data+"<->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public void addlast(int data){
        // create a newnode
        // newnode.next=tail
        // tail.prev=newnode
        // tail=newnode     
        Node newnode=new Node(data);
        size++;
        if (head==null) {
            head=tail=newnode;
            return;
        }
        newnode.prev=tail;
        tail.next=newnode;
        tail=newnode;
    }
    public void addfirst(int data){
        // 1.create a newnode
        // 2.newnode.next=head
        // 3.head.prev=newnode
        // 4.head=newnode
        Node newnode=new Node(data);
        // base case
        if (head==null) {
            head=tail=newnode;
            return;
        }
        newnode.next=head;
        head.prev=newnode;
        head=newnode;
    }
    public int removefirst(){
        if (size==0) {
            System.out.println("the ll is empty");
            return Integer.MIN_VALUE;
        }else if (size==1) {
            int val=head.data;
            head=tail=null;
            size--;
            return val;
        }
        int val=head.data;
        head=head.next;
        head.prev=null;
        size--;
        return val;
    }
    public int removelast(){
        if (size==0) {
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        }else if (size==1) {
            int val=head.data;
            head=tail=null;
            size--;
            return val;
        }
        int val=tail.data;
        tail=tail.prev;
        tail.next=null;
        size--;
        return val;

    }
    public void reverse(){
        Node curr=head;
        Node prev=null;
        Node next;
        while (curr!=null) {
            next=curr.next;
            curr.next=prev;
            curr.prev=next;
            prev=curr;
            curr=next;
        }
        head=prev;
    }
    public static void main(String[] args) {
        
        DoubleLinkedlist dll=new DoubleLinkedlist();
        // dll.addfirst(5);
        // dll.addfirst(4);
        // dll.addfirst(3);
        // dll.addfirst(2);
        // dll.addfirst(1);
        dll.addlast(1);
        
        dll.addlast(2);
        dll.addlast(3);
        dll.addlast(4);
        dll.addlast(5);
        dll.print();
        // dll.removefirst();
        // dll.print();
        dll.removelast();
        dll.print();
        // dll.reverse();
        // dll.print();
        DoubleLinkedlist ll=new DoubleLinkedlist();
        

        // System.out.println(dll.size);
    }
}
