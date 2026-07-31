package com.nsam.strings;

public class Sample {
    int a;
    int b;
    int c;
    //Constructor overloading
    Sample(int a, int b){
        this.a=a;
        this.b=b;
        System.out.println("from first cinstructor"+a+" "+b);
    }
    Sample(int a, int b, int c)
    {
        this.a=a;
        this.b=b;
        this.c=c;
        System.out.println("from second constructor"+a+" "+b+" "+c);
    }
    public static void main(String[] args) {
        Sample s=new Sample(10,20);
        Sample s1=new Sample(10,20,30);

        //Constructor  --it is a specialized a method used ti initialize the objects
        //-- name of the constructor has to be same as the name of the class
        //-- no return type
    }
}


//1. Apti
//2. GD
//3. Technical-1
//4. Technical-2
//5. HR