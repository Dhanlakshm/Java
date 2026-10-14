
package package1;
//LinkedList
//[10|Add20]--->[20|Add30]--->[30|null]
//[10|null]
public class LinkedlIst {
    static class Node{
        int data;
        Node next;

        Node(int data)
        {
            this.data=data;
            next=null;
        }
    }
    Node head;  //
    void add(int data)
    {
      Node newNode=new Node(data); //[10|null]
        if(head==null)
        {
            head=newNode;
            return;
        }                   // [10|Add20]--->[20|Add30]--->[30|null]
      Node current=head;         //                               cur
        while(current.next!=null)
        {
            current=current.next;
        }
        current.next=newNode;
    }
    void add_beginning(int data)
    {
        Node newNode=new Node(data);    // [40|Add10]--->[10|Add20]--->[20|Add30]--->[30|null]
        newNode.next=head;
        head=newNode;
    }
    void delete(int data)
    {
        //case1=list is empty
        if(head==null)
        {
            System.out.println("list is empty");
            return;
        }
        //case2=data is at--> head node
        if(head.data== data)
        {
            System.out.println("removed: "+head.data);
            head=head.next;
            return;
        }
        //case3--> in tne middle
        Node current=head;         //
        while(current.next!=null && current.next.data!=data)
        {
            current=current.next;
        }
        if(current.next!=null)
        {
            System.out.println("removed: "+current.next.data);
            current.next=current.next.next;
        }
    }
    void display()
    {
        Node current=head;
        while(current.next!=null)
        {
            System.out.print(current.data+" ");
            current=current.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        LinkedlIst list=new LinkedlIst();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
//        list.add_beginning(50);
        list.display();
    }
}

//inorder --> Left, Root, Right
//preorder --> Root, Left, Right
//postorder --> Left, Right, Root
//
//












