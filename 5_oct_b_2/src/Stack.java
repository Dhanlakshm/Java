public class Stack {
    int stack[]=new int[5];
    int top=-1;

    void push(int data)
    {
        if(top==stack.length-1)
        {
            System.out.println("Stack overflow");
            return;
        }
        //data=10
        top++; //top=1  [10,20,]
        stack[top]=data;
    }
    int pop()
    {
        if(top==-1)
        {
            System.out.println("Stack is empty");
            return -1;
        }
        int value=stack[top];
        top--;
        return value;
    }
    //get the top element
    int peek()
    {
        if(top==-1)
        {
            System.out.println("Stack is empty");
            return -1;
        }
        int value=stack[top];
        return value;
    }
    void diaplay()
    {
        for(int i=top;i>=0;i--)
        {
            System.out.println(stack[i]);
        }

    }
    public static void main(String[] args) {
        Stack s=new Stack();
        s.push(10);
        s.push(20);
        s.diaplay();
        s.push(30);
        s.push(40);
        s.push(50);
        s.diaplay();
        s.push(60);
        s.diaplay();
        System.out.println("removed: "+s.pop());
        s.diaplay();
        System.out.println("top ele: "+s.peek());
    }
}
//postfix expression evaluation
//2+3-6+4 -->infix
//23+64- --> postfix
//stack
// -->6-4=>2
//
//5  -->2 + 3 =>5
//
//
//digit --> push it to stack
//operator--> pop 2 recently added elemnts and apply the operator
//result --> push it back to the stack












