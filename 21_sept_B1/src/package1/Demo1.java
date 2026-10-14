package package1;

public class Demo1 {
    public static void main(String[] args) {
        String s1="Apple";
        //"aPPLE"
        //A-65+32 = 97=a
        //B-66+32 = 98=b
        //a-97
        //A-Z ---> 65-91
        //a-z ---> 97-122
          String res="";
        for(int i=0; i< s1.length();i++)
        {
            char ch=s1.charAt(i);
            if(ch>=65 && ch<=91)
            {
                ch=(char)(ch+32);
                res+=ch;
            }
            else {
                ch=(char)(ch-32);
                res+=ch;
            }
        }
        System.out.println(res);

    }
}
