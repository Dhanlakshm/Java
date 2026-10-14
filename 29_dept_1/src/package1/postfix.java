package package1;

import java.util.Stack;

public class postfix {

    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        String exp="2 3 + 6 4 - 8 6 *";
        String sr[] =exp.split(" ");
        for(String s:sr)
        {
            if(s.matches("[0-9]+"))
            {
                stack.push(Integer.parseInt(s));
            }
            else{
                int a=stack.pop();
                int b=stack.pop();

                switch (s)
                {
                    case "+"-> stack.push(b+a);
                    case "-"-> stack.push(b-a);
                    case "*"-> stack.push(b*a);
                    case "/"-> stack.push(b/a);
                }

            }
        }
            for(int i=stack.size()-1;i>=0;i--)
            {
                System.out.println(stack.get(i));
            }
    }
}
