
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

    void inorder(Node root)
    {       //left, root, right
        if(root==null)
        {
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    void preorder(Node root)
    {
        //root, left, right
        if(root==null)
        {
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    void postorder(Node root)
    {
        //root, left, right
        if(root==null)
        {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }
    public static void main(String[] args) {
        BinaryTreeTraversal t=new BinaryTreeTraversal();

       Node root= new Node(10);
       root.left=new Node(20);
       root.right=new Node(30);

        root.left.left=new Node(40);
        root.left.right=new Node(50);

        root.right.left=new Node(50);
        root.right.right=new Node(60);

        System.out.println("Inorder traversal: ");
        t.inorder(root);
        System.out.println();
        System.out.println("Preorder traversal: ");
        t.preorder(root);
        System.out.println();
        System.out.println("Postorder traversal: ");
        t.postorder(root);

    }
}
