public class BST {

    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data)
        {
            this.data=data;
            left=right=null;
        }
    }
    static Node insert(Node root, int value)
    {
        if(root==null)
        {
            return new Node(value);
        }
        if(value<root.data)
        {
            root.left=insert(root.left, value);
        } else if (value> root.data) {
            root.right=insert(root.right, value);
        }
        return root;
    }
    static boolean search(Node root, int value)
    {
        if(root==null)
        {
            return false;
        }
        if (root.data==value)
        {
            return true;
        }
        if(value<root.data)
        {
            return search(root.left,value);
        }
        return search(root.right, value);
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

        BST tree=new BST();

        Node root=new Node(10);
        root=insert(root,20);
        root=insert(root,5);

        inorder(root);


    }
}
