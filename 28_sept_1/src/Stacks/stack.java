package Stacks;

public class stack {
    static int st[]=new int[5];
    static int top=-1;

    static void push(int value)
    {
        if(top==st.length-1)
        {
            System.out.println("stack Overflow");
            return;
        }
        top++;
        st[top]=value;
    }
    static void display(){
        System.out.println("Stack elements are: ");
        for(int i=top;i>=0;i--)
        {
            System.out.println(st[i]+" ");
        }
        System.out.println();
    }

    static int peek(){
        if(top==-1)
        {
            System.out.println("Stack empty");
        }
        return st[top];
    }
    static int pop()
    {
        if(top==-1)
        {
            System.out.println("Stack empty");
        }
        int value=st[top];
        top--;
        return value;
    }
    public static void main(String[] args) {

        push(10);
        push(20);
        push(30);
        push(40);

        System.out.println("Removed: "+pop());
        System.out.println("top element: "+peek());
        display();
        push(50);
        display();
        push(60);
        display();
        push(70);
        display();
    }
}
