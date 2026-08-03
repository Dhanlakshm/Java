package inheritance;

class Animal1{
    int age;
    String name;
    void animal_Details(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}
//child-1
class Dog extends Animal1{
    String breed;
    void dog_details(){
        System.out.println("Breed: "+breed);
    }
}
//child-2
class Cat extends Animal1{
    String color;
    void cat_Details(){
        System.out.println("Cat color: "+color);
    }
}
//child-3
class Bird extends Animal1{
    int wingspan;
    void bird_Details(){
        System.out.println("wingspan: "+wingspan);
    }
}
public class Sample_heri2 {
    public static void main(String[] args) {

        Dog d=new Dog();
        d.name="tuffy";
        d.age=2;
        d.breed="labrador";
        d.animal_Details();
        d.dog_details();

        Cat c=new Cat();
        c.name="tommy";
        c.age=2;
        c.color="black";
        c.animal_Details();
        c.cat_Details();
    }
}
