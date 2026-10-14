package LinkedList;

public class linkedlIst {

    class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;     //[10|Adrs20] ---> [20|Adrs30] ---> [30|Adrs40] ---> [10|null]
            next=null;          //                                                      c
        }
    }
    Node head;  //head-data, next  --> first node

    void add(int value){

        Node newNode=new Node(value);  //1. create a new node toadd new value
        //case-1: its the first node ---> if its frist --> then head is null
        if(head==null)      //if first not only is null, just assign the newNode to it
        {
            head=newNode;
            return;
        }
        //case-2: if already some nodes are present---> find the last node and then attach the new node with data
        Node current=head;
        while (current.next!=null)  //current.next1=null wich means it contains the address of next, so next node is ther
        {
            current=current.next;
        }
        current.next=newNode;
    }
    void display(){
        Node current=head;
        while(current.next!=null)
        {
            current=current.next;
        }
    }
    public static void main(String[] args) {

        linkedlIst l1=new linkedlIst();
        l1.add(10);
    }
}
