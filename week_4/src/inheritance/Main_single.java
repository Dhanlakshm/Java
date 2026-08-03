package inheritance;

class GrandParent{
    int x=20;
}
class Parent extends GrandParent{
    int a=10;
}
class child extends Parent{
    int b=30;
}
public class Main_single {
    public static void main(String[] args) {
        child c=new child();
        System.out.println(c.a); //parent class var
        System.out.println(c.b);
        System.out.println(c.x); //grandparent class vars
    }
}
