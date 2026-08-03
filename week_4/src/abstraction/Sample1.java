package abstraction;

abstract class Animal{
    //abstract methods(without body)+concrete method(with bodu)
    abstract void eat();
    abstract void run();
    Animal(){
        System.out.println("Animal class constructor");
    }
}
class Cat extends Animal{
    @Override
    void eat() {
        System.out.println("cat class--eat()");
    }
    @Override
    void run() {
        System.out.println("cat class--run()");
    }
}
public class Sample1 {
    public static void main(String[] args) {
//        Animal a=new Animal();
       Cat c=new Cat();
       c.eat();
       c.run();
    }
}
