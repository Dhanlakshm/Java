package package2;

import java.util.Stack;

public class postfix {
    public static void main(String[] args) {
        String exp="2 3 + 6 4 -";
        String sr[]=exp.split(" ");
        Stack<Integer> stack=new Stack<>();
        for(String s:sr)
        {
            if(s.matches("[0-9]+"))
            {
                stack.push(Integer.parseInt(s));
            }
            else {
                int a=stack.pop();
                int b=stack.pop();

                switch (s)
                {
                    case "+"->stack.push(b+a);
                    case "-"->stack.push(b-a);
                    case "*"->stack.push(b*a);
                    case "/"->stack.push(b/a);
                }
            }
        }
        for(int i=0;i<stack.size();i++)
        {
            System.out.println(stack.get(i));
        }
    }
}
