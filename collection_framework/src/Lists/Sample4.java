package Lists;

import java.util.Stack;

public class Sample4
{
    public static void main(String[] args) {
         Stack<Integer> s=new Stack<>();  //[]
         s.push(10);
         s.push(20);
         s.push(30);
        s.push(40);
        s.push(50);
        s.push(60);
        System.out.println(s);
        System.out.println(s.pop());
        System.out.println(s);
        System.out.println(s.peek());
        System.out.println(s.empty());
        System.out.println(s);
        System.out.println(s.search(40));  //stack position
        System.out.println(s.get(2));   //index value
    }
}
