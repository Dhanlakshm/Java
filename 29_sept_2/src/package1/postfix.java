package package1;

import java.util.Stack;

public class postfix {
    public static void main(String[] args) {
        String exp="2 3 + 6 4 -";
        Stack<Integer> stack=new Stack<>();
        String sr[]=exp.split(" "); //["2","3","+","6","4","-"]
        for(String s:sr)
        {
            if(s.matches("[0-9]+"))
            {
                stack.push(Integer.parseInt(s));
            }
            else{
                int a =stack.pop(); //second operand
                int b =stack.pop(); //first operand

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
 /*
 * 2            (6-4)=2
 * 5         (2+3)=5
 * */

    }
}
