package Queue;

public class queue {
    int queu[];
    int front;
    int rear;
    int capacity;

    public queue(int capacity) {
        this.capacity=capacity;
        queu= new int[capacity];
        front=0;
        rear=-1;
    }

    //add elements --> enqueue
    void enqueue(int value)
    {
        if(rear==capacity-1)
        {
            System.out.println("Queue is full");
            return;
        }
        rear++;
        queu[rear]=value;
    }

    //remove elements --> dequeue
    int poll()
    {
        if(front>rear)
        {
            System.out.println("queue is empty");
            return -1;
        }
        int value=queu[front];
        front++;
        return value;
    }
    //view first elements
    int peek()
    {
        if(front>rear)
        {
            System.out.println("queue is empty");
        }
        return queu[front];
    }

    //display  all elements
    void display()
    {
        for (int i=front;i<=rear;i++)
        {
            System.out.print(queu[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        queue q1=new queue(5);
        q1.enqueue(10);
        q1.enqueue(20);
        q1.enqueue(30);
        q1.enqueue(40);
        q1.enqueue(50);
        q1.enqueue(60);

        System.out.println("Removed: "+q1.poll());
        System.out.println("Peek elem: "+q1.peek());
        q1.display();
    }
}
