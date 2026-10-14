package LL;

public class LinkedList {

  static class Node{
        int data;
        Node next;

                Node(int data) {
                    this.data = data;
                    next = null;
                }
    }
    Node head;  //inital node ---> still the nodeobj is not create only the Node reference(of type Node) is created
    void add(int data){
        Node newNode=new Node(data);

        if(head==null)
        {
            head=newNode;       //[10|null]  //[10|AD200000] ---> [20|AD30000] ---> [30|AD40000] ---> [40|AD50000] --> [50|null]
            return;
        }
        Node current=head;  //current=addreddofHead
        while(current.next!=null)
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
        //case1-if the ll is empty
        if(head==null)
        {
            System.out.println("List is empty");
            return;
        }
        //case2-if head contains data--> delete that and change the head to next
        if(head.data== data)
        {
            System.out.println("removed: "+head.data);
            head=head.next;
            return;
        }
        //case3: if the data is present somewhere in the middle or at the end
        Node current=head;   //data=30
        while(current.next!=null && current.next.data!=data)
        {
            current=current.next;         //[10|AD200000] ---> [20|AD30000] ---> [30|AD40000] ---> [40|AD50000] --> [50|null]
        }                                 //                        cur
        if(current.next!=null)
        {
            System.out.println("removed: "+current.next.data);
            current.next=current.next.next;
        }
    }
    void display()
    {
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

       LinkedList l=new LinkedList();
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
        l.delete(30);
        l.display();
    }
}

