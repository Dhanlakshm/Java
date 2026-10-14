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
    static void inorder(Node root)
    {
        if(root==null)
        {
            return;
        }
        inorder(root.left);  //
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
       Node root=new Node(1);    //
        root.left=new Node(2);
        root.right=new Node(3);

        root.left.left=new Node(4);
        root.left.right=new Node(5);

        root.right.left=new Node(6);
        root.right.right=new Node(7);

        System.out.println("Inorder: ");
        inorder(root);
        System.out.println();
        System.out.println("Preorder: ");
        preorder(root);
        System.out.println();
        System.out.println("Postorder: ");
        postorder(root);
    }
}

//       1
//     2    3
//    4 5  6  7
//Inorder --> 4,2,5,1,6,3,7
//preorder(Ro, L, Ri)-->1,2,4 5,3,6,7
//postorder(L,Ri,Ro) --> 4,5,2,3,1,6.7
