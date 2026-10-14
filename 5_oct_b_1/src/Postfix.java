import java.util.Stack;

//48+53-
//Stack
//------
//    -->5-3=>2
//2   -->4+8 =>12
//12
public class Postfix {

    public static void main(String[] args) {
        String exp="4 8 + 5 3 -";
        String sr[]=exp.split(" ");  //sr[]=["4","8","+","5","3","-"]
        //1. first extract each digit and operator  from the STring input
        //2. whenever you find digit-->push it to the stack
        //3. if its a operator --->pop() 2 elements from the top and apply the operator
        //4. result of the operation is push backed to the stack
        //5. return the updated stack
        Stack<Integer> stack=new Stack<>();
        for(String s:sr)
        {
            if(s.matches("[0-9]+"))
            {
                stack.push(Integer.parseInt(s));
            }
            else{
                int a=stack.pop(); //second operand
                int b=stack.pop(); //first operand
                switch (s)
                {
                    case "+"->stack.push(b+a);
                    case "-"->stack.push(b-a);
                    case "*"->stack.push(b*a);
                    case "/"->stack.push(b/a);
                }
            }
        }
        for(int i=stack.size()-1;i>=0;i--)
        {
            System.out.println(stack.get(i));
        }
    }
}


//[ ]
// r f (front>rear) --> queue is empty












