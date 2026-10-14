package Stacks;

public class stacks {
    int stack[]=new int[5];
    int top=-1;
    void push(int data)
    {
        if(top== stack.length-1)
        {
            System.out.println("stack overflow");
            return;
        }
        top++;      //top=
        stack[top]=data;
    }
    int pop()
    {
        if(top==-1)
        {
            System.out.println("stack is empty");
            return -1;
        }
        int value=stack[top];
        top--;
        return value;
    }

    //return the top most element
    int peek()
    {
        if(top==-1)
        {
            System.out.println("stack is empty");
            return -1;
        }
        int value=stack[top];
        return value;
    }
    void display()
    {
       for(int i=top;i>=0;i--)
       {
           System.out.println(stack[i]);
       }
//        System.out.println();
    }
    public static void main(String[] args) {
        stacks s1=new stacks();
        s1.push(10);
        s1.push(20);
        s1.push(30);
        s1.push(40);
        s1.push(50);  //top=4
        s1.display();
        s1.push(60);  //stack overflow
        s1.display();
        System.out.println("removed: "+s1.pop());
        s1.display();
        System.out.println("removed: "+s1.pop());
        s1.display();
        System.out.println("removed: "+s1.pop());
        s1.display();
        System.out.println("removed: "+s1.pop());
        s1.display();
        System.out.println("removed: "+s1.pop());
        s1.display();
        System.out.println("removed: "+s1.pop());
        s1.display();

    }
}






