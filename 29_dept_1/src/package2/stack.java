
package package2;

public class stack {
    int stacks[]=new int[5];
    int top=-1;

    void push(int data){
        if(top==stacks.length-1)
        {
            System.out.println("stack is overflow");
            return;
        }
        top++;
        stacks[top]=data;
    }
    int pop(){
        if(top==-1)
        {
            System.out.println("stack is empty");
            return -1;
        }
        int value=stacks[top];
        top--;
        return value;
    }
    int peek(){
        if(top==-1)
        {
            System.out.println("stack is empty");
            return -1;
        }
        int value=stacks[top];
        return value;
    }
    void display(){
        for(int i=top;i>=0;i--)
        {
            System.out.println(stacks[i]);
        }
    }
    public static void main(String[] args) {
       stack s=new stack();
       s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.display();
        System.out.println("removed: "+s.pop());
        System.out.println("top ele: "+s.peek());
        s.display();
    }
}
