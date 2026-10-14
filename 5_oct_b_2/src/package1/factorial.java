package package1;

public class factorial {
    static int factorial1(int n)
    {
        if(n==1)
        {
            return 1;
        }
        return n*factorial1(n-1);
    }

    public static void main(String[] args) {
        System.out.println(factorial1(3));
    }
}
