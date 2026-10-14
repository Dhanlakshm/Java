//[10, 20, 30, 40, 50]
//                 r    f
public class Queue {
    int queue[];
    int front;
    int rear;
    int capacity;

    public Queue(int capacity) {
        this.capacity=capacity;
        queue=new int[capacity];
        front=0;
        rear=-1;
    }

        void add(int data)
        {
            if(rear==capacity-1)
            {
                System.out.println("Queue is full");
                return;
            }
            rear++;     //rear=1
            queue[rear]=data;
        }
        int poll()
        {
            if(front>rear)
            {
                System.out.println("Queue is empty");
                return -1;
            }
            int value=queue[front];
           front++;
           return value;
        }
        int peek()
        {
            if(front>rear)
            {
                System.out.println("Queue is empty");
                return -1;
            }

            int value=queue[front];
//            front++;
            return value;
        }
        void display()
        {
            for(int i=front;i<=rear;i++)
            {
                System.out.print(queue[i]+" ");
            }
            System.out.println();
        }
    public static void main(String[] args) {
    Queue  q =new Queue(5);
    q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.display();
        q.add(60);
        q.display();
        System.out.println("removed: "+q.poll());
        q.display();
        System.out.println(q.peek());
    }
}
