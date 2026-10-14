package package1;

public class Sample3 {
    static boolean check_palindrome(String s)
    {
        int left=0;
        int right=s.length()-1;

        while (left<right)
        {
            if(s.charAt(left)!=s.charAt(right))
            {
                return false;
            }
            left++;
            right--;
        }
        return true;

    }
    public static void main(String[] args) {
        //two pointers --
        String s="nsasn";
        boolean res=check_palindrome(s);
        if(res)
        {
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
    }
}
