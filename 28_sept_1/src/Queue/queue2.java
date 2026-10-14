package Queue;

public class queue2 {
    int queue[];
    int front;
    int rear;
    int capacity;

     queue2(int capacity) {
        this.capacity=capacity;
        queue=new int[capacity];
        front=0;
        rear=-1;
    }

    void enqueue(int value){
        if(rear == capacity-1)
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
            System.out.println("queue is empty");
            return -1;
        }
        int value= queue[front];
        front++;
        return value;
    }
    int peek(){
        if(front>rear)
        {
            System.out.println("queue is empty");
            return -1;
        }
        int value= queue[front];
        return value;
    }
    void display(){
        System.out.println("queue elemets are: ");
        for(int i=front;i<=rear;i++)
        {
            System.out.println(queue[i]);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        queue2 q=new queue2(5);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        q.enqueue(60);

        System.out.println("removed: "+q.poll());
        System.out.println("peek ele: "+q.peek());
        q.display();
    }
}
