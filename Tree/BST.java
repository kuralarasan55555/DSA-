package Tree;

//IN BST A NODE HAS EITHER TWO CHILDREN OR ZERO 
//RESTRICTION LEFT CHILD<ROOT , RIGHT CHILD>ROOT

class Node{
    char key;
    Node left,right;

    Node(char key){
        this.key=key;
    }
}
class BinarySolution{
    Node root;
    void insertkey(char key){
        root=insertInTree(root,key);
    }

    Node insertInTree(Node root,char key){
        if(root==null){
            root=new Node(key);
            return root;
        }
        if(key<root.key){
            root.left=insertInTree(root.left, key);
        }
        else if(key>root.key){
            root.right=insertInTree(root.right, key);
        }
        return root;
    }
    void preorder(Node root){
        if(root!=null){
            System.out.print(root.key+" ");
            preorder(root.left);
            preorder(root.right);
        }
    }
     void inorder(Node root){
        if(root!=null){
            inorder(root.left);
            System.out.print(root.key+" ");
            inorder(root.right);
        }
    }
    void postorder(Node root){
        if(root!=null){
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.key+" ");
        }
    }
    
}

public class BST {
    public static void main(String[] args) {
        BinarySolution t1=new BinarySolution();
        t1.insertkey('C');
        t1.insertkey('I');
        t1.insertkey('B');
        t1.insertkey('G');
        t1.insertkey('M');
        t1.insertkey('A');

        
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
