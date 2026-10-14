public class BST {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data)
        {
            this.data=data;
            left=null;
            right=null;
        }
    }

    static Node insert(int value, Node root)
    {
        if(root==null)
        {
            return new Node(value);
        }
        if(value<root.data)
        {
            root.left=insert(value,root.left);
        }
        else if (value> root.data) {
            root.right=insert(value,root.right);
        }
        return root;
    }

    static void inorder(Node root)
    {
        if(root==null)
        {
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static void main(String[] args) {

        Node root=new Node(10);
        root=insert(20,root);
        root=insert(5,root);
        root=insert(3,root);
        inorder(root);
    }


}
