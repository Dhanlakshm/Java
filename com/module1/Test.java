package com.module1;

public class Test {
    int age=20; //instance variable
    static String college="msanfgc"; //static

    static void display(){
        String name="Riya"; //Local variable
        System.out.println("name: "+name);
    }
    public static void main(String[] args) {
        //Static -- static segment
        //Instance -- Heap
        //Local --stack segemnt
//        Test t=new Test();
//        System.out.println(t.age);
//        t.display();

        System.out.println(college);
        display();




    }
}
