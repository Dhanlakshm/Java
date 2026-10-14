public class Test3 {
    static public boolean isPalindrome(String s) {

        //1.convert to lower case
        s=s.toLowerCase();  //a man, a plan, a canal: panama
        int left=0;
        int right=s.length()-1;
      while(left<right)
      {
          while (left<right && !Character.isLetterOrDigit(s.charAt(left)))
          {
              left++;
          }
          while (left<right && !Character.isLetterOrDigit(s.charAt(right)))
          {
             right--;
          }
          if(s.charAt(left)!=s.charAt(right))
          {
              return false;
          }
          left++;
          right--;
      }
        return true;
        //2. take to pointer left=0, right=s.length()-1
        //3. whenever you get some " " or special char just skip
    }
    public static void main(String[] args) {
//        System.out.println(Character.isLetterOrDigit('1'));
        String s="A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }
}
