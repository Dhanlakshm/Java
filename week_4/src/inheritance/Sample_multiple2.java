package inheritance;
//parent-1
interface Vehical{
    int wheels=4;
    void drive();
}
//parent-2
interface Animal{
    String name="tuffy";
    void eat();
}
//child
class Car implements Vehical, Animal{

    @Override
    public void eat() {
        System.out.println("animal name: "+name);
        System.out.println("from animal-interface");
    }

    @Override
    public void drive() {
        System.out.println("wheels: "+wheels);
        System.out.println("from vehical-interface");
    }
}

public class Sample_multiple2 {
    public static void main(String[] args) {
        Car c=new Car();
        c.drive();
        c.eat();
    }
}
