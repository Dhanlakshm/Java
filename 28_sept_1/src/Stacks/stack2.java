package Stacks;

public class stack2 {
    static int stack[]=new int[5];
    static int top=-1;
    void push(int value){

        if(top==stack.length-1)
        {
            System.out.println("stack overflow");
            return;
        }
        top++;
        stack[top]=value;

    }
    int pop(){
        if(top==-1)
        {
            System.out.println("stack empty");
            return -1;
        }
        int value=stack[top];
        top--;
        return value;
    }
    int peek(){
        if(top==-1)
        {
            System.out.println("stack empty");
            return -1;
        }
        int value=stack[top];
        return value;
    }
    void diaply(){
        for(int i=top;i>=0;i--)
        {
            System.out.println(stack[i]);
        }
        System.out.println();
    }
    public static void main(String[] args) {

        stack2 s=new stack2();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.push(30);

        System.out.println("removed element: "+s.pop());
        System.out.println("peek ele: "+s.peek());
        s.diaply();


    }
}
