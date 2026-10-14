package practise;

public class Sample {
    static void divide(int a, int b) throws ArithmeticException
    {
        if(b==0)
        {
            throw  new ArithmeticException("Cannot devide by zero");
        }
        System.out.println("quoitent: "+(a/b));
    }
    public static void main(String[] args) {
        int a=10;
        int b=0;
        try{
           divide(a,b);
        }
        catch(ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
