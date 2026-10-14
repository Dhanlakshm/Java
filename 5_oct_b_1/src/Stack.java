public class Stack {
    int stack[]=new int[5];
    int top=-1;

    //add elements
    void push(int data)
    {
        if(top== stack.length-1)
        {
            System.out.println("Stack overflow");
            return;
        }
        top++; //top=0
        stack[top]=data;
    }
    //delete
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
    int peek(){
        if(top==-1)
        {
            System.out.println("Stack is empty");
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
    }
    public static void main(String[] args) {
        Stack s=new Stack();

        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.display();
        s.push(60); //stack full/overflow
        System.out.println("removed: "+s.pop());  //50
        s.display();
    }
}
//50
//40
//30
//20
//10
//top -1

//2+3 --> infix
// 23+ --> postfix

//4563323+64-
//[] //6-4=2
//[2]--> top  //2+3 =5
//[5]
//
//[5,2]
//48+53-
//Stack
//------
//    -->5-3=>2
//2   -->4+8 =>12
//12










