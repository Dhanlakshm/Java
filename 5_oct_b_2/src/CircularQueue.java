public class CircularQueue {
    int queue[];
    int front;
    int rear;
    int capacity;
int size;
    public CircularQueue(int capacity) {
        this.capacity=capacity;
        queue=new int[capacity];
        front=0;
        rear=-1;
        size=0;
    }

    void add(int data)
    {
        if(size==capacity)
        {
            System.out.println("Queue is full");
            return;
        }
        rear=(rear+1)%capacity;  //rear++
        queue[rear]=data;
        size++;
    }
    int poll()
    {
        if(size==0)
        {
            System.out.println("Queue is empty");
            return -1;
        }
        int value=queue[front];
        queue[front]=-1;  //[60,-,30,40,50]
        front=(front+1)%capacity; //front++
        size--;
        return value;
    }
    void display()
    {
        for(int i=0;i<=capacity-1;i++)
        {
            if(queue[i]==-1)
            {
                System.out.print("-"+" ");
            }
            else{
                System.out.print(queue[i]+" ");
            }

        }
        System.out.println();
    }
    public static void main(String[] args) {
    CircularQueue q=new CircularQueue(5);
    q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.display();
        q.add(60);
        System.out.println("removed: "+q.poll());
        q.display();
        q.add(60);
        q.display();
        System.out.println("removed: "+q.poll());
        System.out.println("removed: "+q.poll());
        q.display();
        q.add(70);
        q.display();
    }
}

