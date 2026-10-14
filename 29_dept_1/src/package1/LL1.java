package package1;

public class LL1 {
    static class Node{
        int data;
        Node next;

        Node(int data)
        {
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
    void ad_beginning(int data)
    {
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
    }
    void delete(int data)
    {
        //case1: if list is empty
        if(head==null)
        {
            System.out.println("list null");
            return;
        }

        //case2: if the data is present in the head node
        if(head.data==data)
        {
            System.out.println("removed: "+head.data);
            head=head.next;
            return;
        }
        //case3: if its somewhere in the middle of list
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
            System.out.print(current.data+"---->");
            current=current.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        LL1 list=new LL1();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.display();
    }
}
