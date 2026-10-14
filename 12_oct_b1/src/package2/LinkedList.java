package package2;

public class LinkedList {
    class Node{
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
        Node newNOde=new Node(data);   //[10|null]
        //case1-if list is empty--> add the new node to head
        if(head==null)
        {
            head=newNOde;
            return;
        }
        //case2--> if alredy eles are present find the last node and attach the new node to that
        //[10|Add20]-->[20|Add30]-->[30|Add40]-->[40|AddnewNode]-->[newNode|null]
        //                                              curr
        Node current=head;
        while (current.next!=null)
        {
            current=current.next;
        }
        current.next=newNOde;
    }
    void add_beginning(int data)
    {
        //[1000|AddHead]--->[10|Add20]-->[20|Add30]-->[30|Add40]-->[40|AddnewNode]-->[newNode|null]
        Node newNode=new Node(data);
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
        //[1000|AddHead]--->[10|Add20]-->[20|Add30]-->[30|Add40]-->[40|AddnewNode]-->[newNode|null]
        //                                   cur
        //case2=> if the ele to be deleted is at the head node
        if(head.data==data)
        {
            System.out.println("removed: "+head.data);
            head=head.next;
            return;
        }
        //case3=> if the element is presnt somewhere in the middle
        Node current=head;
        while (current.next!=null && current.next.data!=data)
        {
            current=current.next;
        }

        System.out.println(current.next.data);
        current.next=current.next.next;

    }
    void display()
    {
        //[1000|AddHead]--->[10|Add20]-->[20|Add30]-->[30|Add40]-->[40|AddnewNode]-->[newNode|null]
        //                                              curr
        Node current=head;
        while (current!=null)
        {
            System.out.print(current.data+"-->");
            current=current.next;
        }
        System.out.print("null");
        System.out.println();
    }
    public static void main(String[] args) {
        LinkedList   list=new LinkedList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.display();
        list.add_beginning(1000);
        list.display();
        list.delete(1000);
        list.display();
    }
}
