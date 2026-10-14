package package2;

public class LinkedList {
    class Node{

        int data;
        Node next;

        Node(int data){
            this.data=data;
            next=null;
        }
    }
    Node head;

    void add(int data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
            return;
        }

        Node current=head;
        while (current.next!=null)
        {
            current=current.next;
        }

        current.next=newNode;
    }
    void add_beginning(int data)
    {
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
    }
    void delete(int data)
    {
        if(head==null)
        {
            System.out.println("List is empty");
            return;
        }
        if(head.data==data)
        {
            System.out.println("removed: "+head.data);
            head=head.next;
            return;
        }

        Node current=head;
        while (current.next!=null && current.next.data!=data)
        {
            current=current.next;
        }
        if(current.next!=null)
        {
            System.out.println("removed: "+current.next.data);
            current.next=current.next.next;
        }
    }
    void display(){
        Node current=head;
        while (current.next!=null)
        {
            System.out.print(current.data+"--->");
            current=current.next;
        }
        System.out.print("null");
        System.out.println();
    }
    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add_beginning(1000);
        list.display();
    }
}
