package package1;

public class queuq {

    int queue[];
    int front;
    int rear;
    int capacity;

    public queuq(int capacity) {
        this.capacity=capacity;
        queue =new int[capacity];
        front=0;
        rear=-1;
    }

    void enqueue(int value)
    {
        if(rear== capacity-1)
        {
            System.out.println("queue is full");
            return;
        }
        rear++;
        queue[rear]=value;
    }
    int poll(){
        if(front>rear)
        {
            System.out.println("Queue is empty");
            return -1;
        }
        int value=queue[front];
        front++;
        return value;
    }
    int peek(){
        if(front>rear)
        {
            System.out.println("Queue is empty");
            return -1;
        }
        int value=queue[front];
        return value;
    }
    void display(){
        System.out.println("Queue elements are: ");
       for(int i=front;i<=rear;i++)
       {
           System.out.println(queue[i]);
       }
        System.out.println();
    }
    public static void main(String[] args) {
        queuq q1=new queuq(5);
        q1.enqueue(10);
        q1.enqueue(20);
        q1.enqueue(30);
        q1.enqueue(40);
        q1.enqueue(50);
        q1.enqueue(60);

        q1.display();
        System.out.println("removed ele: "+q1.poll());
        q1.display();
        System.out.println("top element: "+q1.peek());

    }
}
