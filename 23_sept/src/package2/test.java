package package2;

public class test {
    public static void main(String[] args) {
        String s="nsan";
        int left=0;
        int right=s.length()-1;
        while(left<right)
        {
            if(s.charAt(left)!=s.charAt(right))
            {
                System.out.println("not palindrome");
                break;
            }
            left++;
            right--;
        }
        System.out.println("palindrome");
    }

}
