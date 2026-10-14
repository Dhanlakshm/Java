package Lists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

class Student
{
    String name;
    int age;

//    Student(String name, int age)
//    {
//        this.name=name;
//        this.age=age;
//    }

}
public class practise {
    public static void main(String[] args) {
        Student s=new Student();
        s.name="riya";
        s.age=20;

        Student s1=new Student();
        s1.name="siya";
        s1.age=20;

       Vector<Student> a=new Vector<>();
        System.out.println(a.capacity());
        System.out.println(a.size());
        a.add(s);
        a.add(s1);
        for(Student x:a)
        {
            System.out.println(x.name+" "+x.age);
        }
    }

}
