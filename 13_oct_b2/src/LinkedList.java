/// [10|Add20]-->[20|Add30]-->[30|null]
public class LinkedList {
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
        Node newNOde=new Node(data);    //[10|null]
        //case1--> list is empty
        if(head==null)
        {
            head=newNOde;
            return;
        }
        //case2--> already some eles are presnt
        // [10|Add20]-->[20|Add30]-->[30|Add40]-->[40|Add50]-->[50|null]
        //                                           cur
        Node current=head;
        while (current.next!=null)
        {
            current=current.next;
        }
        current.next=newNOde;
    }
    void add_beiginning(int data)
    {
        Node newNOde=new Node(data);  //[1000|null]
        //[1000|null] [10|Add20]-->[20|Add30]-->[30|Add40]-->[40|Add50]-->[50|null]
        newNOde.next=head;
        head=newNOde;
    }
    void delete(int data)
    {
        if(head==null)
        {
            System.out.println("List is empty");
            return;
        }
        //[10|Add20]-->[20|Add30]-->[30|Add40]-->[40|Add50]-->[50|null]
        //                cur
        //case1: if the node to be deleted is at the head
        if(head.data==data)
        {
            System.out.println("removing: "+head.data);
            head=head.next;
            return;
        }
        //case2: if the node to be deleted is somwhere in the middle
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
        LinkedList list=new LinkedList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.display();
        list.add(50);
        list.display();
        list.add_beiginning(1000);
        list.display();
        list.delete(30);
        list.display();
        list.delete(1000);
        list.display();
    }
}
