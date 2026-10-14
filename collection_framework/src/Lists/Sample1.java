package Lists;

import java.util.LinkedList;

public class Sample1 {
    public static void main(String[] args) {

       LinkedList<Integer> l=new LinkedList<>();

       l.add(10);
        l.add(20);
        l.add(30);
        System.out.println(l);
        l.addFirst(100);
        System.out.println(l);
        l.addLast(3000);
        System.out.println(l);
        System.out.println(l.getFirst());
        System.out.println(l.getLast());
        l.removeLast();
        System.out.println(l);
        l.removeFirst();
        System.out.println(l);
    }
}
