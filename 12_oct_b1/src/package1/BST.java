package package1;

public class BST {

    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
            left=null;
            right=null;
        }
    }
    static  Node add_bst(Node root, int data)
    {
        if(root==null)
        {
            return new Node(data);
        }
        if(data<root.data)
        {
            return add_bst(root.left, data);
        }
        else if(data> root.data) {
            return add_bst(root.right, data);
        }
        return root;
    }
    //display --inorder, preorder, post...
    static void inorder(Node root)
    {
        if(root==null)
        {
            //System.out.println("empty");
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static void main(String[] args) {
        BST tree=new BST();
        Node root=null;
        root=new Node(10);

        add_bst(root,20);


        inorder(root);
    }
}
