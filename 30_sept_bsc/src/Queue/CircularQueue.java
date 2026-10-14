package Queue;

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
        if(size == capacity)
        {
            System.out.println("queue is full");
                 return;
        }
      //rear++;
        rear=(rear+1)%capacity;         //(-1+1)%5 --->0%5=0
        queue[rear]=data;
        size++;
    }
    int poll()
    {
        if(size==0)
        {
            System.out.println("queue is empty");
            return -1;
        }
        int value=queue[front];     //increment  [,20,30,40]
        queue[front]=0;
        front=(front+1)%capacity; //(0+1)%5===> 0
        size--;
        return value;
    }
    void disaply(){
        for(int i=0;i<size;i++)
        {
            System.out.print(queue[i]+" ");
        }
//        for(int i=0;i<size;i++)
//        {
//            System.out.print(queue[(front+i)%capacity]+" ");
//        }
        System.out.println();
    }

    public static void main(String[] args) {
        CircularQueue q1=new CircularQueue(5);
        q1.add(10);
        q1.add(20);
        q1.add(30);
        q1.add(40);
        q1.disaply();
        q1.add(50);
        q1.disaply();
        q1.add(60);
        System.out.println("removed: "+q1.poll());
        q1.disaply();
        q1.add(60);
        q1.disaply();
        System.out.println("removed: "+q1.poll());
        q1.disaply();
        q1.add(70);
        q1.disaply();


    }
}
