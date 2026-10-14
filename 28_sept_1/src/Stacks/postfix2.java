package Stacks;

import java.util.Arrays;
import java.util.Stack;

public class postfix2 {
    public static void main(String[] args) {

        String exp="2 3 + 6 4 -";

        Stack<Integer> stack=new Stack<>();
        String sr[] =exp.split(" ");

        for(String s:sr)
        {
            if(s.matches("[0-9]+"))     //checks if it is number
            {
               stack.push(Integer.parseInt(s));
            }
            else{       //if it is a operation
                int a=stack.pop();  //second operand
                int b=stack.pop();  //first operand

                switch (s)
                {
                    case "+": stack.push(b+a);
                    break;
                    case "-": stack.push(b-a);
                        break;
                    case "*": stack.push(b*a);
                        break;
                    case "/": stack.push(b/a);
                        break;
                }
            }
        }
        for(int i=0;i<stack.size();i++)
        {
            System.out.println(stack.get(i));

        }
    }
}
