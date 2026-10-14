package package1;

public class BinaryTreeTraversal {
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

    //left, root, right
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
    //root, left, right
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
    //left, right, root
    static void postorder(Node root)
    {
        if(root==null)
        {
            //System.out.println("empty");
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }


    public static void main(String[] args) {
       BinaryTreeTraversal t=new BinaryTreeTraversal();
       Node root=new Node(10);
       root.left=new Node(20);
        root.right=new Node(30);

        root.left.left=new Node(40);
        root.left.right=new Node(50);

        root.right.left=new Node(60);
        root.right.right=new Node(70);

        System.out.println("Inorder: ");
        inorder(root);
        System.out.println();
        System.out.println("Preorder: ");
        preorder(root);
        System.out.println();
        System.out.println("Postorder: ");
        postorder(root);

        //add(10);
    }
}

//     10
//  20    30
//40  50 60   70