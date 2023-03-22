// import java.util.*;
// import java.util.*;
import java.util.*;
// import java.util.LinkedList;

// public class BinarytreeB {
//     static class Node{
//         int data;
//         Node left;
//         Node right;
//         public Node(int data){
//             this.data=data;
//             this.left=left;
//             this.right=right;
//         }
//     }
//     static class Binarytree{
//        static int idx=-1;
//         public static Node builtnode(int nodes[]){
//             idx++;

//             if (nodes[idx]==-1) {
//                 return null;
//             }
//             Node newnode=new Node(nodes[idx]);
//             newnode.left=builtnode(nodes);
//             newnode.right=builtnode(nodes);
//             return newnode;
//         }

//         public static void preorder(Node root){
//             if (root==null) {
//                 System.out.println("-1");
//                 return;
//             }
//             System.out.println(root.data);
//             System.out.println(root.left);
//             System.out.println(root.right);
//         }

//         public static void inorder(Node root){
//             if (root==null) {
//                 return;
//             }
//             inorder(root.left);
//             System.out.println(root.data);
//             inorder(root.right);
//         }

//         public static void postorder(Node root){
//             if (root==null) {
//                 return;
//             }
//             inorder(root.left);     
//             inorder(root.right);
//             System.out.println(root.data);
//         }
//         public static void levelorder(Node root){
//             if (root==null) {
//                 return;
//             }
//             Queue<Node>q=new LinkedList<>();
//             q.add(root);
//             q.add(null);
//             while (!q.isEmpty()) {
//                 Node currNode=q.remove();
//                 if (currNode == null) {
//                     System.out.println();
//                     if (q.isEmpty()) {
//                         break;
//                     } else {
//                         q.add(null);            
//                     }
//                 } else{
//                     System.out.print(currNode.data);
//                     if (currNode.left!=null) {
//                         q.add(currNode.left);
//                     }
//                     if (currNode.right!=null) {
//                         q.add(currNode.right);
//                     }
//                 }
//             }

//         }
//     }
//     public static void main(String[] args) {
//         int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
//         Binarytree tree=new Binarytree();
//       Node root= tree.builtnode(nodes);
//         // System.out.println(root);
//         // tree.preorder(root);
//         tree.inorder(root);
//     }
// }

// public class BinarytreeB {
//     static class Node {
//         int data;
//         Node left, right;
//         public Node(int data) {
//             this.data = data;
//             this.left = left;
//             this.right = right;
//         }
//     }
//     public static int height(Node root){
//         if (root==null) {
//             return 0;
//         }
//         int lh=height(root.left);
//         int rh=height(root.right);
//         return Math.max(lh, rh)+1;
//     }

//     public static void main(String[] args) {
//         Node root=new Node(1);
//         root.left=new Node(2);
//         root.right=new Node(3);
//         root.left.left=new Node(4);
//         root.left.right=new Node(5);
//         root.right.right=new Node(6);
//         System.out.println(height(root));
//     }
// }

// Diameter of a aTree (Approach 1) 
// public class BinarytreeB {
//     static class Node {
//         int data;
//         Node left, right;
//         public Node(int data) {
//             this.data = data;
//             this.left = left;
//             this.right = right;
//         }
//         }
//         public static int height(Node root) {
//             if (root == null) {
//                 return 0;
//             }
//             int lh = height(root.left);
//             int rh = height(root.right);
//             return Math.max(lh, rh) + 1;
//         }

//         public static int diam1(Node root){
//             if (root==null) {
//                 return 0;
//             }
//             int ldiam=diam1(root.left);
//             int rdiam=diam1(root.right);
//             int lh=height(root.left);
//             int rh=height(root.right);
//             int self=(lh+rh)+1;
//             return Math.max(self,Math.max(ldiam,rdiam));
//         }

//     public static void main(String[] args) {
//         Node root=new Node(1);
//         root.left=new Node(2);
//         root.right=new Node(2);
//         root.left.left=new Node(4);
//         root.left.right=new Node(5);
//         root.right.right=new Node(5);
//         System.out.println(diam1(root));

//     }
// }

// Diameter of a aTree (Approach 2)
// public class BinarytreeB {
//     static class Node {
//         int data;
//         Node left, right;

//         public Node(int data) {
//             this.data = data;
//             this.left = left;
//             this.right = right;
//         }
//         }
//         static class Info{
//             int diam;
//             int ht;
//             public Info(int diam,int ht){
//                 this.diam=diam;
//                 this.ht=ht;
//             }
//         }
//         public static Info diam(Node root){
//             Info ldiam=diam(root.left);
//             Info rdiam=diam(root.right);

//             int diam=Math.max(Math.max(ldiam.diam, rdiam.diam),ldiam.ht+rdiam.ht+1);
//             int ht=Math.max(ldiam.ht, rdiam.ht)+1;
//             return new Info(diam, ht);

//         }

//     public static void main(String[] args) {
//         Node root=new Node(1);
//         root.left=new Node(2);
//         root.right=new Node(2);
//         root.left.left=new Node(4);
//         root.left.right=new Node(5);
//         root.right.right=new Node(5);
//         System.out.println(diam(root).diam);

//     }
// }

// Subtree of Another tree
// public class BinarytreeB{
//     static class Node{
//         int data;
//         Node left,right;
//         Node(int data){
//             this.data=data;
//             this.left=left;
//             this.right=right;
//         }
//     }

// public static boolean isIdentical(Node node,Node subroot){
//     if (node==null && subroot==null) {
//         return true;
//     }else if (node==null ||subroot==null||node.data!=subroot.data) {
//         return false;
//     }
//     if (!isIdentical(node.left, subroot.left)) {
//         return false;
//     }
//     if (!isIdentical(node.right, subroot.right)) {
//         return false;
//     }
//     return true;
// }
// public static boolean isSubtree(Node root,Node subroot){
//     if (root==null) {
//         return false;
//     }
//     if (root.data==subroot.data) {
//         if (isIdentical(root,subroot)) {
//             return true;
//         }
//     }
//     return isSubtree(root.left, subroot) || isSubtree(root.right, subroot);
// }

// Topview of a tree
//     static class info{
//         Node node;
//         int hd;
//         public info(Node info,int hd){
//             this.node=node;
//             this.hd=hd;
//         }
//     }
// public static void topview(Node root){
//     // level order
//     Queue<info>q=new LinkedList<>();
//     HashMap<Integer,Node> map=new HashMap<>();
//     int min,max;
//     q.add(new info(root, 0));
//     q.add(null);
//     while (!q.isEmpty()) {
//         info curr=q.remove();
//         if (curr==null) {0
//             if (q.isEmpty()) {
//                 break;
//             }else{
//                 q.add(null);
//             }
//         }
//         if (!map.containsKey(curr.hd)) {//first time occuring hd     
//             map.put(curr.hd, curr.node);
//         }
//         if (curr.node.left!=null) {
//             q.add(new info(curr.node.left, curr.hd-1));
//             min=Math.min(min, curr.hd-1);
//         }
//         if (curr.node.right!=null) {
//             q.add(new info(curr.node.right, curr.hd+1));
//             max=Math.max(max, curr.hd+1);
//         }
//     }
//     for (int i = min; i < max; i++) {
//         System.out.print(map.get(i).data);
//     }
//     System.out.println();

// }
//     public static void main(String[] args) {

/*
     1
  /    \
 2     3
/ \   / \
4  5     6 7

*/

// Node root=new Node(1);
// root.left=new Node(2);
// root.right=new Node(3);
// root.left.left=new Node(4);
// root.left.right=new Node(5);
// root.right.left=new Node(6);
// root.right.right=new Node(7);
// topview(root);

/*   
  2    
 / \   
4  5    
 */
// Node subroot=new Node(2);
// subroot.left=new Node(4);
// subroot.right=new Node(5);
// System.out.println(isSubtree(root, subroot));
//     }
// } 

// import java.util.*;
// class HelloWorld {
//         static class Node{
//    int data;
//    Node left,right;
//    public  Node(int data){
//    this.data=data;
//    this.left=left;
//    this.right=left;
//        }
//    }
//   static class Info
//   {
//     Node node;
//     int hd;
//     public Info (Node node, int hd)
//     {
//       this.node = node;
//       this.hd = hd;
//     }
//   }
//       public static void topview (Node root){
//     // level order
//     Queue < Info > q = new LinkedList <> ();
//     HashMap < Integer, Node > map = new HashMap <> ();
//     int min = 0, max = 0;
//     q.add (new Info (root, 0));
//     q.add (null);
//     while (!q.isEmpty ()){
// 	Info curr = q.remove ();
// 	if (curr == null){
// 	    if (q.isEmpty ()){
// 		break;
// 	      }
// 	    else{
// 		q.add (null);
// 	      }
// 	  }else{
// 	   if (!map.containsKey (curr.hd)){		 
// 		map.put (curr.hd, curr.node);
// 	      }
// 	    if (curr.node.left != null){
// 		q.add (new Info (curr.node.left, curr.hd - 1));
// 		min = Math.min (min, curr.hd - 1);
// 	      }

// 	    if (curr.node.right != null) {
// 		q.add (new Info (curr.node.right, curr.hd + 1));
// 		max = Math.max (max, curr.hd + 1);
// 	      }
// 	  }
// 	  }
// 	for (int i = min; i <= max; i++){
// 	    System.out.print (map.get(i).data+" ");
// 	  }
// 	System.out.println ();
//       }

//     public static void main(String[] args) {
//         // System.out.println("Hello, World!");
//      Node root = new Node (1);
//       root.left = new Node (2);
//       root.right = new Node (3);
//       root.left.left = new Node (4);
//       root.left.right = new Node (5);
//       root.right.left = new Node (6);
//       root.right.right = new Node (7);
//       topview (root);
//     }
// }

// Kth level
// public class BinarytreeB {
// static class Node{
//   int data;
//   Node left;
//   Node right;
//   public Node(int data){
//     this.data=data;
//     this.left=null;
//     this.right=null;
//   }
// }
// public static void klevel(Node root,int level,int k){
//   // base case
//   if (root==null) {
//     return;
//   }
//   if (level==k) {
//     System.out.println(root.data);
//     return;
//   }
//   klevel(root.left, level+1,k);
//   klevel(root.right,  level+1,k);
// }
//   public static void main(String[] args) {
//     Node root=new Node(1);
//     root.left=new Node(2);
//     root.right=new Node(3);
//     root.left.left=new Node(4);
//     root.left.right=new Node(5);
//     root.right.left=new Node(6);
//     root.right.right=new Node(7);
//     int k=2;
//    klevel(root, 1, k);
//   }

// }

// Last Common Ansector
// public class BinarytreeB {
//   static class Node {
//     int data;
//     Node left;
//     Node right;

//     public Node(int data) {
//       this.data = data;
//       this.left = null;
//       this.right = null;
//     }
//   }

//   public static boolean getpath(Node root, int n, ArrayList<Node> path) {
//     if (root == null) {
//       return false;
//     }

//     if (root.data == n) {
//       return true;
//     }
//     boolean Foundleft = getpath(root.left, n, path);
//     boolean Foundright = getpath(root.right, n, path);

//     if (Foundleft || Foundright) {
//       return true;
//     }
//     path.remove(path.size() - 1);
//     return false;
//   }

//   public static Node lca(Node root, int n1, int n2) {
//     ArrayList<Node> path1 = new ArrayList<>();
//     ArrayList<Node> path2 = new ArrayList<>();

//     getpath(root, n1, path1);
//     getpath(root, n2, path2);

//     // last common anscestor
//     int i = 0;
//     for (; i < path1.size() && i < path2.size(); i++) {
//       if (path1.get(i) != path2.get(i)) {
//         break;
//       }
//     }
//     // lowest common anscestor
//     Node lca = path1.get(i-1);
//     return lca;
//   }

//   public static Node lca2(Node root,int n1,int n2){

//     if(root==null){
//      return null;
//     }
//     if (root.data==n1||root.data==n2) {
//       return root;
//     }
//     Node leftlca2=lca2(root.left, n1, n2);
//     Node rightlca2=lca2(root.right, n1, n2);

//     if (leftlca2==null) {
//       return rightlca2;
//     }
//     if (rightlca2==null) {
//       return leftlca2;
//     }
//     return root;
//   }

//   public static void main(String[] args) {
//     Node root = new Node(1);
//     root.left = new Node(2);
//     root.right = new Node(3);
//     root.left.left = new Node(4);
//     root.left.right = new Node(5);
//     root.right.left = new Node(6);
//     root.right.right = new Node(7);
//     /*
//      * 1
//      * / \
//      * 2 3
//      * / \ / \
//      * 4 5 6 7
//      * 
//      */
//     int n1 = 4,n2=6;
//     System.out.println(lca(root, n1, n2));
//   }

// }





// Mininmum Distance between 2 Nodes

// public class BinarytreeB {

//   static class Node{
//     int data;
//     Node left,right;
//     public Node(int data){
//         this.data=data;
//         this.left=null;
//         this.right=null;
//     }
//   }
//   public static Node lca2(Node root, int n1, int n2) {
//     if (root == null) {
//         return null;
//     }
    
//     if (root.data == n1 || root.data == n2) {
//         return root;
//     }
    
//     Node leftlca2 = lca2(root.left, n1, n2);
//     Node rightlca2 = lca2(root.right, n1, n2);

//     if (leftlca2 == null) {
//         return rightlca2;
//     }
//     if (rightlca2 == null) {
//         return leftlca2;
//     }
//     return root;
// }

//    public static int lcadis(Node root,int n){
//        if(root==null){
//            return -1;
//        }
//        if(root.data==n){
//            return 0;
//        }
//        int leftdis=lcadis(root.left,n);
//        int rightdis=lcadis(root.right,n);
//        if(leftdis==-1 && rightdis==-1){
//            return -1;
//        }else if(leftdis==-1){
//            return rightdis+1;
//        }else{
//            return leftdis+1;
//        }
//    }
//       public static int mindist(Node root,int n1,int n2){
//        Node lca=lca2(root,n1,n2);
//        int dist1=lcadis(root,n1);
//        int dist2=lcadis(root,n2);
//        return dist1+dist2;
//    }
//     public static void main(String[] args) {
//       Node root = new Node(1);
//       root.left = new Node(2);
//       root.right = new Node(3);
//       root.left.left = new Node(4);
//       root.left.right = new Node(5);
//       root.right.left = new Node(6);
//       root.right.right = new Node(7);
//       int n1=4;int n2=6;
//        System.out.println(mindist(root,n1,n2));
// }
// }




// Kth Ansector
// public static int kansector(Node root,int n,int k){
//   if(root==null){
//       return -1;
      
//   }
//   if(root.data==n){
//       return 0;
//   }
//   int left=kansector(root.left,n,k);
//   int right=kansector(root.right,n,k);
//    if(left==-1 && right==-1){
//        return -1;
//    }
//    int max=Math.max(left,right);
//    if(max+1==k){
//        System.out.println(root.data);
//    }
//    return max+1;
// }







import java.util.*;

public class BinarytreeB {
    static class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
      this.data = data;
      this.left = null;
      this.right = null;
    }
  }
  static class infor{
    Node node;
    int level;
    
    public infor(Node node,int level,int k){
      this.node=node;
      this.level=level;
      
    }
  }
public static void iterative(Node root,int k){
  if (root==null) {
    return ;
  }
  Queue<Node>q=new LinkedList<>();
            q.add(root);
            q.add(null);
            while (!q.isEmpty()) {
                   
                Node currNode=q.remove();
                if (currNode == null) {
                    System.out.println();
                    if (q.isEmpty()) {
                        break;
                    } else {
                        q.add(null);            
                    }
                } else{
                    System.out.print(currNode.data);
                    if (currNode.left!=null) {
                      q.add(currNode.left);
                    }
                    if (currNode.right!=null) {
                       q.add(currNode.right);
                    }
                }
            }
}
  public static void main(String[] args) {
      Node root = new Node(1);
      root.left = new Node(2);
      root.right = new Node(3);
      root.left.left = new Node(4);
      root.left.right = new Node(5);
      root.right.left = new Node(6);
      System.out.print(countnodes(root));
  }
}





