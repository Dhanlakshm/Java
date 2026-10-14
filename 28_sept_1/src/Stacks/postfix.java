package Stacks;

import java.util.Arrays;
import java.util.Stack;

public class postfix {
    public static void main(String[] args) {
        String exp="2 3 + 8 7 -";

        Stack<Integer> stack=new Stack<>();
        String sr[]=exp.split(" ");

        for(String value:sr)
        {
            if(value.matches("[0-9]+"))
            {
                stack.push(Integer.parseInt(value));
            }
            else{
                 int a= stack.pop();
                 int b= stack.pop();
                switch (value)
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

//        System.out.println("5".matches("[0-9]+"));



    }
}
