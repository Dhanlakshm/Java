package Lists;

import java.util.Vector;

public class Sampl3 {
    public static void main(String[] args) {
        Vector<Integer> v1=new Vector<>();

        v1.add(10);
        v1.add(20);
        v1.add(30);
        System.out.println(v1);
        v1.add(3,50);
        System.out.println(v1);

        v1.addElement(10000);
        System.out.println(v1);
        v1.insertElementAt(50000,1);
        System.out.println(v1);
        v1.removeElementAt(1);
        System.out.println(v1);
        Vector<Integer> v2=new Vector<>();
        v2.add(100);
        v2.add(200);
        v2.add(300);
        System.out.println(v2);

        v1.addAll(v2);   //combine the v1 and v2
        System.out.println(v1);
        v1.removeAll(v2);   //remove v2  elements from v1
        System.out.println(v1);
        System.out.println(v1.firstElement());
        System.out.println(v1.lastElement());
        System.out.println(v1.capacity());
        System.out.println(v1.size());



    }
}
