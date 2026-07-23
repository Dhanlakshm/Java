package com.nsam.arrays;

//Types of methods
public class Methods {

//  1. Methods without parameter, without return type
    void display1()
    {
        System.out.println("Type-1");
    }

//   2. Methods without parameter, with return type
    int display2()
    {
        return 200;
    }

//   3. Methods with parameter, without return type
    void display3(int a , int b)
    {
        int sum=a+b;
        System.out.println("sum: "+sum);
    }

//   4. Methods with parameter, with return type
    int display4(int a, int b)
    {
        int sum=a+b;
        return sum;
    }

    public static void main(String[] args) {

//        1. Methods without parameter, without return type
//        2. Methods without parameter, with return type
//        3. Methods with parameter, without return type
//        4. Methods with parameter, with return type
         Methods obj=new Methods();

        obj.display1(); //type1

        int value= obj.display2();  //type2
        System.out.println(value);

         obj.display3(10,20);  //type3

        int returenValue= obj.display4(10,20);  //type4
        System.out.println(returenValue);


          }
}
