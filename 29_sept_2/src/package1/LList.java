package package1;

public class LList {

    class Node{
        int data;
        Node next;

        Node (int data)
        {
            this.data=data;
            next=null;
        }
    }
    Node head;
    void add(int data) {
        Node newNode = new Node(data);
        //case-1: its the first node --> make it the head node
        if (head == null) {
            head = newNode;
            return;
        }
        //case-2: alredy some nodes are present ---> find the last node add the address of newNode to the "next" part of last node
        Node current = head;
        while (current.next != null)
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
        //case-1:if data is at first node
        if(head.data==data)
        {
            System.out.println("removed: "+head.data);
            head=head.next;
            return;
        }
        //case-2: if first node is empty
        if(head==null)
        {
            System.out.println("list empty");
            return;
        }
        //case-3: if the data is present in middle or at the end
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
        System.out.println("null");
        System.out.println();
    }
    public static void main(String[] args) {
        LList l=new LList();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        l.add(50);
        l.display();
        l.add_beginning(100);
        l.display();
        l.delete(10);
        l.display();

    }
}
