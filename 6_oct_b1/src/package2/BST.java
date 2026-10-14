package package2;

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

    static Node insert(Node root,int value)
    {
        if(root==null)
        {
            return new Node(value);
        }
        if(value<root.data)
        {
           insert(root.left, value);
        } else if (value>root.data) {
            insert(root.right,value);
        }
        return root;
    }

    static boolean search(Node root, int value)
    {
        if(root==null)
        {
           return false;
        }
        if(root.data==value)
        {
            return true;
        }
        if(value<root.data)
        {
            return search(root.left,value);
        }

        return search(root.right,value);
    }


    public static void main(String[] args) {
        BST tree=new BST();
        Node root=null;
        root=insert(root,10);

        System.out.println(search(root,100));
    }
}
