package package1;

// [20, 30, 40]
//  f            r
public class Queue {
    int queue[];
    int front;
    int rear;
    int capacity;
    int size;
    public Queue(int capacity) {
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
            System.out.println("queue is full");
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
            System.out.println("queue is empty");
            return -1;
        }
        int value=queue[front];
        queue[front]=-1;  //[-1,20,30,40,50]
        front=(front+1)%capacity; //front++;
        size--;
        return value;
    }
    void display()
    {
        for(int i=0;i<=capacity-1;i++)
        {
            if(queue[i]==-1)  //[-1,20,30,40,50]
            {
                System.out.print("-"+" ");
            }
            else {
                System.out.print(queue[i]+" ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Queue q=new Queue(5);
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
        q.display();
    }
}
//[10,20,30,40,50]<--60--full, c=5-->q[]
//r=4,r=0
//r++---> (r+1)%c
//r=4 -->(5)%5==>0=r q[0]=60
//        <--70,80,90
//

//LinkedList
//[10|Add20]--->[20|Add30]--->[30|null]








