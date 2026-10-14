public class BinaryTreeTraversal {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data=data;
            left=right=null;
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
            root.left=insert(root.left, value);
        }
        else if (value> root.data) {
            root.right=insert(root.right,value);
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
    //left, root, right
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
    static void preorder(Node root)
    {
        if(root==null)
        {
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    static void postorder(Node root)
    {
        if(root==null)
        {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }
    public static void main(String[] args) {
        Node root=new Node(10);
        root=insert(root,20);
        root=insert(root,5);
        root=insert(root,15);
        System.out.println("Inorder: ");
        inorder(root);


//        root.left=new Node(20);
//        root.right=new Node(30);
//        root.left.left=new Node(40);
//        root.left.right=new Node(50);
//
//        root.right.left=new Node(60);
//        root.right.right=new Node(70);


        System.out.println();
        System.out.println("Preorder: ");
        preorder(root);
        System.out.println();
        System.out.println("Postorder: ");
        postorder(root);


    }
}

//          10
//      20      30
//   40   50  60   70