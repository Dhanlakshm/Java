package package1;

import java.util.Arrays;

public class stacks {
    static int stack[]=new int[5];
    static int top=-1;
        //add the ele to stack
        void push(int value)
        {
            if(top == stack.length-1)
            {
                System.out.println("stack overflow");
                return;
            }
            top++; //top=1
            stack[top]=value;
        }

        //delete
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
//    //return top most element
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
        System.out.println("Current stack elements are: ");
        for(int i=top;i>=0;i--)
        {
            System.out.println(stack[i]);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        stacks s1=new stacks();
        s1.push(10);
        s1.push(20);
        s1.push(30);
        s1.push(40);
        s1.push(50);
        s1.push(60); //stack overflow

        s1.display();

        System.out.println("removed: "+ s1.pop());
        s1.display();
    }
}
