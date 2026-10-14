public class LL {
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
            System.out.println("list empty");
            return;
        }
        if(head.data==data)
        {
            System.out.println("removing: "+head.data);
            head=head.next;
            return;
        }
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
        LL list=new LL();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.display();
        list.delete(20);
        list.display();
    }
}
