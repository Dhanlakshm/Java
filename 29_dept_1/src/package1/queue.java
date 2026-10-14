package package1;

public class queue {

    int queuee[];
    int front;
    int rear;
    int capacity;

    public queue(int capacity) {
        this.capacity = capacity;
        queuee = new int[capacity];
        front = 0;
        rear = -1;
    }

    void add(int value)
    {
        if(rear==queuee.length-1)
        {
            System.out.println("Queue full");
            return;
        }
        rear++;
        queuee[rear]=value;
    }

    int poll()
    {
        if(front>rear)
        {
            System.out.println("queue is empty");
            return -1;
        }
        int vaue=queuee[front];
        front++;
        return vaue;

    }
    int peek(){
        if(front>rear)
        {
            System.out.println("queue is empty");
            return -1;
        }
        int vaue=queuee[front];
        return vaue;
    }
    void display()
    {
        System.out.println("queue ele are: ");
        for(int i=front;i<=rear;i++)
        {
            System.out.print(queuee[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        queue q=new queue(5);
        q.add(10);
        q.add(30);
        q.add(40);
        q.add(50);
        q.add(60);
        q.add(70);

        q.display();
        System.out.println("removed: "+q.poll());
        q.display();
        System.out.println("top element: "+q.peek());
    }
}
