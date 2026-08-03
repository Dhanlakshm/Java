package Poly;


//polymorphism-2types
//1. compile-time poly --- Method overloading (once single class having multiple methods with the same name,but they differe in number, order, type of parameters )
//2. Run-time poly --- Method overrriding(parent class method having different implmentation in the child class)
public class Sample1 {
    void add(int a, int b){
        System.out.println("sum: "+(a+b));
    }
    void add(int a, float b){
        System.out.println("sum: "+(a+b));
    }
    void add(int a, int b, int c){
        System.out.println("sum: "+(a+b+c));
    }
    public static void main(String[] args) {
        Sample1 s=new Sample1();
        s.add(10,20);
        s.add(10,20.8f);
        s.add(10,20,30);
    }
}
