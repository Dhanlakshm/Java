package ququuquq;

public class CircularQueue {
    int ququq[];
    int front;
    int rear;
    int size;
    int capacity;

    public CircularQueue(int capacity) {
        this.capacity=capacity;
        ququq=new int[capacity];
        front=0;
        rear=-1;
        size=0;
    }
    void add(int value)
    {
        if(size==capacity)
        {
            System.out.println("Queue is full");
            return;
        }
        rear=(rear+1)%capacity;
        ququq[rear]=value;
        size++;
    }
    int poll(){
        if(size==0)
        {
            System.out.println("Quueue is empty");
            return -1;
        }
       int value=ququq[front];
        front=(front+1)%capacity;
        size--;
       return value;
    }
    void display(){
        for (int i=0;i<size;i++)
        {
            System.out.print(ququq[(front+i)%capacity]+" ");
        }
        System.out.println();

    }


    public static void main(String[] args) {
    CircularQueue c=new CircularQueue(5);
        c.add(10);
        c.add(20);
        c.add(30);
        c.add(40);
        c.add(50);
//        c.add(60);
    c.display();
        System.out.println(c.poll());
        c.display();
        c.add(60);
        c.display();


    }
}
