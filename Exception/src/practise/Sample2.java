package practise;

public class Sample2 {

    static void checkAge(int age) throws InvalidAgeException
    {
        if(age<18)
        {
            throw  new InvalidAgeException("Age cannot be less than 18");
        }
        System.out.println("Valid age");
    }
    public static void main(String[] args) {

        try{
            checkAge(15);
        }
        catch (InvalidAgeException e)
        {
            System.out.println(e.getMessage());
        }

    }
}
