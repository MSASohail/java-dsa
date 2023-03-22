public class LinkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    // methods
    public void addfirst(int data) {
        Node newnode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
    }

    public void addlast(int data) {
        Node newnode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newnode;
            return;
        }
        tail.next = newnode;
        tail = newnode;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void add(int idx, int data) {
        if (idx == 0) {
            addfirst(data);
            return;
        }
        Node newnode = new Node(data);
        Node temp = head;
        int i = 0;
        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }
        newnode.next = temp.next;
        temp.next = newnode;
    }

    public int removefirst() {
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removelast() {
        if (size == 0) {
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }
        int val = prev.next.data;// tail.data
        prev.next = null;
        size--;
        tail = prev;
        return val;

    }

    public int itrSearch(int key) {
        Node temp = head;
        int i = 0;
        while (temp != null) {
            if (temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;
        }
        // not found case
        return -1;
    }

    public int helper(Node head, int key) {
        if (head == null) {
            return -1;
        }
        if (head.data == key) {
            return 0;
        }
        int idx = helper(head.next, key);
        if (head.data == -1) {
            return -1;
        }
        return idx + 1;

    }

    public int recSearch(int key) {
        return helper(head, key);

    }

    public void reverse() {
        // 3 VARIABLES
        // 4 STEPS
       Node prev=null;
       Node curr=head;
       Node next;
       while (curr!=null) {
        next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;
       }
       head=prev;
    }

    public void deletethenthnode(int n) {
        Node temp = head;
        int sz = 0;
        while (temp != null) {
            temp = temp.next;
            sz++;
        }
        if (sz == n) {
            head = head.next;// deletefirst
            return;
        }
        // sz-n
        int i = 1;
        Node prev = head;
        while (i < sz - n) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }

    // 2 pointer or Slow-Fast or tambel- kargoosh approch
    public Node findmid(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public boolean checkpalindrome() {
        // step 1 find mid\
        if (head == null || head.next == null) {
            return true;
        }
        Node midnode = findmid(head);
        // step2 reverse 2nd half
        Node prev = null;
        Node curr = midnode;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;
        Node left = head;

        // step3 check left==right
        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            right = right.next;
            left = left.next;
        }
        return true;
    }

    /*
     * public static void main(String[] args) {
     * LinkedList ll = new LinkedList();
     * ll.addfirst(2);
     * ll.addfirst(1);
     * ll.addlast(4);
     * ll.addlast(5);
     * ll.addlast(6);
     * ll.print();
     * System.out.println(ll.size);
     * ll.add(0, 1000);
     * ll.print();
     * ll.add(1, 2000);
     * ll.print();
     * ll.removefirst();
     * ll.print();
     * System.out.println(ll.size);
     * ll.removelast();
     * ll.print();
     * System.out.println(ll.size);
     * System.out.println(ll.recSearch(2));
     * // ll.reverse();
     * ll.print();
     * ll.deletethenthnode(3);
     * ll.print();
     * ll.addfirst(2);
     * ll.addfirst(1);
     * ll.addlast(2);
     * // ll.addlast(1);
     * ll.print();
     * System.out.println(ll.checkpalindrome());
     * 
     * }
     */

    public static boolean iscycle() {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    public static void removecycle() {
        // Detect the cycle
        Node slow = head;
        Node fast = head;
        Boolean cycle = false;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
                cycle = true;
                break;
            }
        }
        if (cycle == false) {
            return;
        }
        // Find the meeting point
        slow = head;
        Node prev = null;// last node
        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }
        // Remove the cycle->last.next=null
        prev.next = null;
    }

    private Node getmid(Node head) {
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private Node merge(Node head1, Node head2) {
        Node mergedll = new Node(-1);
        Node temp = mergedll;
        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }
        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return mergedll.next;
    }

    public Node mergesort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        // Find the mid
        Node mid = getmid(head);
        // divide the ll into 2 halfs
        Node righthead = mid.next;
        mid.next = null;
        Node newleft = mergesort(head);
        Node newright = mergesort(righthead);

        // merge
        return merge(newleft, newright);

    }
    public static void zigzag(){
        // Find the mid
        Node slow=head;
        Node fast=head.next;
        while (fast!=null && fast.next!=null ) {
            slow=slow.next;
            fast=fast.next.next;
        }
        Node mid=slow;
        // Reverse the 2nd half
        Node curr=mid.next;
        mid.next=null;
        Node prev=null;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node right=prev;
        Node left=head;
        Node nextl,nextr;
        // merge alternate
        while (left!=null && right!=null) {
            nextl=left.next;
            left.next=right;
            nextr=right.next;
            right.next=nextl;

            left=nextl;
            right=nextr;
        }
    }

    public  void linkdelete(Node head,int M,int N){
        Node curr=head;
        int count=0;
        
        while (curr!=null && curr.next!=null) {
            count++;     
            int x=N;
            if (count==M) {
                while (x>0) {                  
                    curr.next=curr.next.next;
                    if (curr.next==null) {
                        return;
                    }
                    x--;
                    count=0;
                }
            }
            x=N;
            curr=curr.next;
        }
    }
    
    public static void main(String[] args) {
        /*
         * head=new Node(1);
         * Node temp=new Node(2);
         * head.next=temp;
         * head.next.next=new Node(3);
         * head.next.next.next=temp;
         * // 1->2->3->2
         * System.out.println(iscycle());
         * removecycle();
         * System.out.println(iscycle());
         */
        LinkedList ll = new LinkedList();
        
        // ll.addfirst(1);
        // ll.addfirst(2);
        // ll.addfirst(3);
        // ll.addfirst(4);
        // ll.addfirst(5);
        // 4->3->2->1

        // ll.print();
        // ll.head=ll.mergesort(head);
        // ll.print();
        ll.addlast(1);
        ll.addlast(2);
        ll.addlast(3);
        ll.addlast(4);
        ll.addlast(5);
        ll.addlast(6);
        ll.addlast(7);
        ll.addlast(8);
        ll.print();
        ll.reverse();
        // ll.addlast(9);
        // ll.addlast(10);
        ll.print();
        // ll.linkdelete(head, 2, 2);
        ll.print();
        // ll.zigzag();
        // ll.print();
    }
}
