package practise;

public class Sample1 {

   static void divide(int a, int b) throws ArithmeticException
    {
        if(b==0)
        {
            throw new ArithmeticException("cannot divide by 0");
        }
        System.out.println("quotient: "+(a/b));
    }
    public static void main(String[] args) {
        int a=10;
        int b=0;
        try{
           divide(a,b);
        }
        catch (ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }

    }
}
