package Queue;

public class queue {
    int queuee[];
    int front;
    int rear;
    int capacity;
    queue(int capacity)
    {
        queuee= new int[capacity];
        front=0;
        rear=-1;
    }

    void add(int data)
    {
        if(rear==queuee.length-1)
        {
            System.out.println("Queue is full");
            return;
        }
        //insert
        rear++;         //rear=0
        queuee[rear]=data;

    }
    int poll()
    {
        if(front>rear)
        {
            System.out.println("queue is empty");
            return -1;
        }
        int value=queuee[front];
        front++;
        return value;
    }
    void peek()
    {

    }
    void display(){
        System.out.println("Queue elements are: ");
        for(int i=front;i<=rear;i++)
        {
            System.out.print(queuee[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
     queue q1=new queue(5);
       q1.add(10);
        q1.add(20);
        q1.add(30);
        q1.add(40);
        q1.add(50);
        q1.display();
        System.out.println("removed: "+q1.poll());
        q1.display();
        System.out.println("removed: "+q1.poll());
        q1.display();
        q1.add(50);

    }
}
