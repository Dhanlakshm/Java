package package2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class test3 {
    public static void main(String[] args) {
        String s="Java@Python@C++";
        String s1[]=s.split("@");
        System.out.println(Arrays.toString(s1));

        String a="Java, Python, C++, Java, C#";
        System.out.println(a.replace("Java","C"));

        String ph="123-456-789";
        System.out.println(ph.replaceFirst("-",""));



//        regular expression

        String ste="abc123";
        System.out.println(ste.replaceAll("\\d",""));

        String r1="0ello";
        System.out.println(r1.matches("^[A-Z].*"));
        String r2="jhbxbsA";
        System.out.println(r2.matches("[A-Z,a-z]+"));
        String r3="123jhbxbsA";
        System.out.println(r3.matches("^[0-9].*"));
        System.out.println(r3.replaceAll("[^A-z,a-z]",""));
    }
}
