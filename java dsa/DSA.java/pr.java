import pr.Node.binary;

public class pr {
static class Node{
    int data;
    Node left;
    Node right;
    public Node(int data){
        this.data=data;
        this.left=left;
        this.right=right;
    }
    static class binary{
        static int idx=-1;
        public static Node builttree(int nodes[]){
            idx++;
            if (nodes[idx]==-1) {
                return new Node(idx) ;
            }
            Node newnode=new Node(nodes[idx]);
            newnode.left=builttree(nodes);
            newnode.right=builttree(nodes);
            return newnode;
        }
    }
}
    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        binary tree=new bi
    }
}