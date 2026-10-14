package package2;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        //split()
        String s="Java Python C++";
       String[] sr =s.split(" ");
        System.out.println(Arrays.toString(sr));

        String s2="divya@gmail.com";
        String res[]=s2.split("@");
        System.out.println(Arrays.toString(res));

    }
}
