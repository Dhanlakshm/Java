package package1;

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
            return root;
        }
        if(value<root.data)
        {
            return insert(root.left,value);
        }
       else if(value> root.data)
        {
            return insert(root.right,value);
        }
        return root;
    }
    //search
    boolean search(Node root, int value)
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

    void inorder(Node root)
    {
        if(root==null)
        {
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    void postorder(Node root)
    {
        if(root==null)
        {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }
    void preorder(Node root)
    {
        if(root==null)
        {
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

    Node delete(Node root, int value)
    {
       if(root==null)
       {
           return null;
       }
       if(value<root.data)
       {
           return delete(root.left,value);
       }
       else if(value> root.data)
       {
           return delete(root.right,value);
       }
       else {
           if(root.left==null && root.right==null)
           {
               return null;
           }
       }
       return root;
    }
    public static void main(String[] args) {
        Node root=null;


    }
}
