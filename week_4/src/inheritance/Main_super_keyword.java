package inheritance;
//super keyword is used to access the var and methods from immediate parent class
class Parent1{
    int x=10;
    void display(){
        System.out.println("parent class display method");
    }
}
class Child extends Parent1{
    void print(){
        System.out.println(super.x);
        super.display();
    }
}
public class Main_super_keyword {
    public static void main(String[] args) {
        Child c=new Child();
        c.print();
    }
}
