package package1;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        String s="123-456-789-768";
        String sr[]=s.split("-",2);
        System.out.println(Arrays.toString(sr));

        String s2="jaya@gmail.com";
        String a[]=s2.split("@");
        System.out.println(Arrays.toString(a));

        //replace
        String x="java@gamil.com";
        System.out.println(x.replace("gamil.com","nitte.edu.in"));

        String y="Java Python Java C++";
        System.out.println(y.replaceFirst("Java", "c"));

        //
        String n="Java";
        System.out.println(n.replaceAll("J","j"));

        String ph="123-456-789";

        String html="<p>Hello</p><p>World</p>";
        System.out.println(html.replace("<p>","").replace("</p>"," "));

        String p="Java";
//        String q="Python";
        int q=10;
        System.out.println(p+q);
//        System.out.println(p.concat(q));

        String br[]={"Java", "Python", "C++"};

        System.out.println(String.join("-",br));

        //[A-Z]
        //[a-z]
        //[0-9]
        //^
        //$
        //.
        //*
        //+
        // \\d ---> digits
        // \\s --> space

        String p1="5uygJava";
        System.out.println((p1.matches("^[A-Z].*")));

        String p2="lhbvsjh&@jjcdb";
        System.out.println((p2.matches(".*[^A-Z,a-z,0-9].*")));

        String p3="Java#123";
        System.out.println((p3.replaceAll("[^A-Z,a-z,0-9]","")));

        String p4="JAva123";
        System.out.println(p4.replaceAll("\\d",""));

        String name="Johtgjn Detgo smith";
        //neha s bhat
        int start=name.indexOf(" ")+1;
        int end=name.lastIndexOf(" ");
        System.out.println(name.substring(start,end));

        String email="Jaya@gmail.com";
        System.out.println(email.substring(email.indexOf("@")+1));

        String p5="15451351";
        System.out.println(p5.matches(".*[0-9].*"));
        String p6="Java&546";

        //1. length >10
        //2. must have Uppercase letters, lowercase letter, digits
        //3. atleast special character
        //"Strong password: or else "Weak password"
        String pass="nsam@1233456";
        if(pass.length()>10 && pass.matches(".*[A-Z,a-z,0-9].*") && pass.matches(".*[^A-Z,a-z,0-9].*"))
        {
            System.out.println("Strong password");
        }
        else {
            System.out.println("weak");
        }

        //validate email,
        String mail="java@gmail.com";
        //[java, gmail.com]
        //@ --> shd not appear twice
        //. --> shd not appear twice
        //split()
    }
}
