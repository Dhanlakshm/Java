package package2;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Sample1 {
    public static void main(String[] args) {
        String s="cat";

//        if(s.matches("ct"))
//        {
//            System.out.println(true);
//        }
//        System.out.println("aa".matches("a*"));
//        System.out.println("aa".matches("a+"));
//        System.out.println("a".matches("a?")); //? --> 0 or 1
//        System.out.println("".matches("a?"));
//        System.out.println("aa".matches("a?"));  //false
//        System.out.println("9".matches("\\d"));
//        System.out.println("I love aa".matches(".*a*$"));
//        System.out.println("a".matches("[aeiou]"));
////        System.out.println("a".matches("[abc]")); // true
//        System.out.println("545445".matches("[0-9]+"));

        System.out.println(" ".matches("\s"));
        System.out.println("123abc".matches(".*[a-z]"));


    }
}
