package Tree;
//Binary Tree
//EACH NODE HAS ATMOST 2 CHILD 
//3 WAYS TO TRAVERSE IN A BST SUCH AS INORDER,PREORDER,POSTORDER
class Node{
    char key;
    Node left;
    Node right;
    
    Node(char key){
        this.key=key;
    }
}
class TreeTraversal{
    Node root;

    void preorder(Node n)   //ROOT[PRINT] LEFT RIGHT
    {
       if(n!=null){
        System.out.print(n.key+" ");
        preorder(n.left);
        preorder(n.right);
       }
    }

    void inorder(Node n)   //LEFT  ROOT[PRINT] RIGHT
    {
       if(n!=null){
        inorder(n.left);
        System.out.print(n.key+" ");
        inorder(n.right);
       }
    }

    void postorder(Node n)   //LEFT RIGHT ROOT[PRINT]
    {
       if(n!=null){
        postorder(n.left);
        postorder(n.right);
        System.out.print(n.key+" ");
       }
    }

    
}
public class Traversal {
    public static void main(String[] args) {
        TreeTraversal t1=new TreeTraversal();

        //CREATE A BINARY TREE
        t1.root=new Node('A');
        t1.root.left=new Node('B');
        t1.root.right=new Node('C');
        t1.root.left.left=new Node('D');
        t1.root.left.right=new Node('E');

        System.out.print("PREORDER: ");
        t1.preorder(t1.root);

        System.out.println();
        System.out.print("INORDER: ");
        t1.inorder(t1.root);

        System.out.println();
        System.out.print("POSTORDER: ");
        t1.postorder(t1.root);


    }
}
