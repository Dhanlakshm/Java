package package1;

public class Sample2 {
   static boolean check_palindrom(String s)
    {
        //"nsasn"
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
        String s="nsasn";

        boolean res=check_palindrom(s);
        if(res)
        {
            System.out.println("is plaindrome");
        }
        else {
            System.out.println("not palindrome");
        }
    }
}

//task
//Input: [1,2,3,4,5,6,7,8,9], target =12
//output : find 2 elements from the array that sum upto the target value using two-pointer















