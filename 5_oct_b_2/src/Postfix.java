import java.util.Stack;

public class Postfix {
    public static void main(String[] args) {
        String exp="2 3 + 6 4 -";
        String sr[]=exp.split(" ");  //sr[]={"2","3","+","6","4","-"}
        Stack<Integer> stack=new Stack<>();

        for(String s:sr)
        {
            if(s.matches("[0-9]+"))
            {
                stack.push(Integer.parseInt(s));
            }
            else{
               int a= stack.pop(); //second op
                int b=stack.pop(); //first op
                switch (s)
                {
                    case "+"-> stack.push(b+a);
                    case "-"-> stack.push(b-a);
                    case "*"-> stack.push(b*a);
                    case "/"-> stack.push(b/a);
                }
            }
        }
        for(int i=0;i<=stack.size()-1;i++)
        {
            System.out.println(stack.get(i));
        }

    }
}
//postfix expression evaluation
//2+3-6+4 -->infix
//23+64- --> postfix
//stack
// -->6-4=>2
//2
//5  -->2 + 3 =>5
//
//
//digit --> push it to stack
//operator--> pop 2 recently added elemnts and apply the operator
//result --> push it back to the stack