package Lists;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

//List (I)  --> ArrayList, LinkedLIst, Vector, Stack
public class Sample {
    public static void main(String[] args) {
       //Insertion order is mainted , Duplicates are allowed , null values are allowed

        //ArrayList(C)
        ArrayList<String> a=new ArrayList<>();  //[]--empty arrayList  //default capacity === 10
        System.out.println(a);

        a.add("Mumbai");
        a.add("Banglore");
        a.add("Mumbai");
        a.add("Mumbai");
        System.out.println(a);
        a.add(1,"Hyd");
        System.out.println(a);

        //remove --- using index number, usig actual value
        a.remove("Hyd"); //a.remove(i);
        System.out.println(a);

        System.out.println(a.indexOf("Mumbai"));    //0 --- first occ
        System.out.println(a.lastIndexOf("Mumbai"));

        System.out.println(a.size()); //size -- number od elements that are currently present in list
        //capacity -- is how mnay ele it can hold


        System.out.println(a.get(0));
        System.out.println(a.set(1,"chennai"));
        System.out.println(a);
        System.out.println(a.subList(1,4));//1,2,3

        System.out.println(a.isEmpty());
        System.out.println(a.contains("chennai"));


        System.out.println("Elements of list: "+a);
        System.out.println("using for-loop");   //using foor loop
        for(int i=0;i<a.size();i++)
        {
            System.out.println(a.get(i));
        }
        System.out.println("using for-each loop");  //using for- each
        for(String s:a)
        {
            System.out.println(s);
        }
        //Iterator interface
        System.out.println("using Iterator interface");
        Iterator<String> i=a.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }
        //ListIterator Interface   --(bidirectional)
        System.out.println("original order");
        ListIterator<String> x=a.listIterator();
        while (x.hasNext())
        {
            System.out.println(x.next());
        }
        System.out.println("reverse order");
        while (x.hasPrevious())
        {
            System.out.println(x.previous());
        }

//        a.clear();
//        System.out.println(a);










//        ArrayList<Object> a1=new ArrayList<>();
//        a1.add("Manglore");
//        a1.add(1000);
//        a1.add(4.5);
//        a1.add(true);
//        System.out.println(a1);



    }
}
