
package package1;

public class CircularQueue {
    int queuee[];
    int front;
    int rear;
    int capacity;
    int size;
    public CircularQueue(int capacity) {
        this.capacity=capacity;
        queuee=new int[capacity];
        front=0;
        rear=-1;
        size=0;
    }

    void add(int value)
    {
        if(size==capacity)
        {
            System.out.println("queue is full");
            return;
        }
//        rear++;
        rear=(rear+1)%capacity;
        System.out.println("rear: "+rear);
        queuee[rear]=value;
        size++;
    }
    int poll(){
        if(size==0)
        {
            System.out.println("queue is empty");
            return -1;
        }
        int value=queuee[front];
        queuee[front]=-1;
        front=(front+1)%capacity;
        size--;
        return value;
    }
    int peek()
    {
        if(size==0)
        {
            System.out.println("queue is empty");
            return -1;
        }
        int value=queuee[front];
        return value;
    }
    void display()
    {
        System.out.print("Physical Array: ");
        for(int i = 0; i < capacity; i++)
        {
            if(queuee[i]==-1)
            {
                System.out.print("_"+" ");
            }
            else{
                System.out.print(queuee[i] + " ");
            }

        }
        System.out.println();
        System.out.print("Queue Order: ");
        for(int i = 0; i < size; i++) {
            System.out.print(queuee[(front + i) % capacity] + " ");
        }
//        for(int i=0;i<=size-1;i++)
//        {
//            System.out.print(queuee[(front+i)%capacity]+" ");
////            System.out.print(queuee[i]+" ");
//        }
        System.out.println();

    }

    public static void main(String[] args) {
        CircularQueue q=new CircularQueue(5);
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
//        q.add(60);
        q.display();

        System.out.println("removed: "+q.poll());
        q.display();
        System.out.println("removed: "+q.poll());
        q.display();
        q.add(60);
        q.display();
        q.add(70);
        q.display();
    }
}
/*
*
* q[]=[10,20,30,40,50]  <-- 60
* q[]=[ ,20,30,40,50]  <-- 60
* q[]=[60,20,30,40,50]  <-- 60
*
*
*
*
*
* */
