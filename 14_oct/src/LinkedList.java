//[10|Add20]-->[20|Add30]-->[30|Add40]-->[40|null]-->[newNode]
public class LinkedList {
    static class Node{
        int data;
        Node next;

        Node(int data) {
            this.data=data;
            next=null;
        }
    }
    Node head;
    void add(int data)
    {
        Node newNode=new Node(data);  //[10|null]
        //case1: list is empty -->head node
        if(head==null)
        {
            head=newNode;
            return;
        }
        //case2: list alredy has some elems -->find the last node and attach that newNOde to that
        //[10|Add20]-->[20|Add30]-->[30|Add40]-->[40|null]  [newNode|null]
        //                                          cur
        Node current=head;
        while (current.next!=null)
        {
            current=current.next;
        }
        current.next=newNode;
    }
    void add_beginnig(int data)
    {
        Node newNode=new Node(data); //[1000|null]
        //[1000|Add10]-->[10|Add20]-->[20|Add30]-->[30|Add40]-->[40|null]
        newNode.next=head;
        head=newNode;
    }
    void delete(int data)
    {
        //case1: list is empty
        if(head==null)
        {
            System.out.println("list is empty");
            return;
        }
        //case2: the data to be deleted is at the first position
        //[1000|Add10]-->[10|Add20]-->[20|Add30]-->[30|Add40]-->[40|null]
        if(head.data==data)
        {
            System.out.println("removing :"+head.data);
            head=head.next;
            return;
        }
        //case3: the data to be deleted is somewhere in the middle
        //[1000|Add10]-->[10|Add20]-->[20|Add30]-->[30|Add40]-->[40|null]
        //                              cur
        Node current=head;
        while (current.next!=null && current.next.data!=data)
        {
            current=current.next;
        }
        System.out.println("removing: "+current.next.data);
        current.next=current.next.next;
    }
    void display()
    {
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
        LinkedList list =new LinkedList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.display();
        list.add_beginnig(1000);
        list.display();
        list.delete(30);
        list.display();
    }
}
