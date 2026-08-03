package Poly;

class Animal{
    void eat(){
        System.out.println("Animal is eating");
    }
}
class Dog extends Animal{
    void eat(){
        System.out.println("Dog is eating");
    }
}
public class Sample2 {
    public static void main(String[] args) {
//       Dog d=new Dog();
//       d.eat();
        //Parent class ref=child class object
        Animal a=new Dog();  //upcasting
        a.eat();  //Dog is eating
    }
}
