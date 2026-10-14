public class test3 {

    static boolean check_palindrome(String s)
    {
        int left=0;
        int right=s.length()-1;

        while(left<right)
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
        String s="nsasn";

        boolean res=check_palindrome(s);
        System.out.println(res);
    }
}
//INput: [1,2,3,4,5,6,7,8,9], target=12
//output : find 2 elemnts from array that sum upto the target value(using 2-pointers)









