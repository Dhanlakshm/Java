package package1;

import java.util.Arrays;

public class tes {
    public static void main(String[] args) {

        String s1="Java Python";
        String sr[]=s1.split(" ");
        System.out.println(Arrays.toString(sr));

        String a="Java Python Java C++";
        System.out.println(a.replaceFirst("Java","C"));
        System.out.println(a.replaceAll("Java","C"));

        String html="<p>Hello</p><p>world</p>";
        System.out.println(html.replace("<p>","").replace("</p>",""));

        //trim()
        String x=" Hello Java ";
        System.out.println(x.trim());

//join()
        String ar[]={"Java","Python","C++"};
        System.out.println(String.join("-",ar));

        String email="jaya@gmail.com";  //jaya@nitte.edu.in
        System.out.println(email.replace("gmail.com","nitte.edu.in"));

        //[A-Z]
        //[a-z]
        //[0-9]
        //. --> any single char
        //* ---> zero or any number of characters
        //\\d --> single digit
        //+ ---> any number of times
        //^ --> beginning
        //$ --> ending

        String p1="5dcfgJava"; //check if this string brgins with Upercase letter
        System.out.println(p1.matches("^[A-Z].*"));
        System.out.println(p1.matches(".*[A-Z].*"));

        String p2="Java2hjd";  //check if this string begins with digit
                                //check if it contains a digit
        System.out.println(p2.matches(".*[0-9].*"));

        String p3="Java%123";
        System.out.println(p3.matches(".*[^A-Z,a-z,0-9].*"));

        //replace the special character with ""
        System.out.println(p3.replaceAll("[^A-Z,a-z,0-9]",""));

        String ph="0123456789";
        System.out.println(ph.matches("[0-9]+"));

        //1. length=10
        //2. must have UpperCase letters, LowerCase letters, Special characters
        // Strong password, weak password
        String password="dhanLlakshmi@123";
        boolean hasUpper =password.matches(".*[A-Z].*");
        boolean hasLower =password.matches(".*[a-z].*");
        boolean hasDigits =password.matches(".*[0-9].*");
        System.out.println(hasUpper+" "+hasLower+" "+hasDigits);
        if(password.length()>=10 && password.matches(".*[A-Z].*") && password.matches(".*[a-z].*") && password.matches(".*[^A-Z,a-z,0-9].*"))
        {
            System.out.println("Strong password");
        }
        else{
            System.out.println("weak password");
        }

        String email_id="divya@gmail.com";
       String parts[]=email_id.split("@");
       if(parts.length==2 && parts[1].split("\\.").length==2 && parts[0]!=null)
       {
           System.out.println("Valid email");
       }
       else{
           System.out.println("Invalid email");
       }
        //[divya, gmail.com]
        //[gmail, com]
        //before @ shd not be emtpy

        String phone_num="86185887590";  //contains 10 digits, starts with (7,8,9)
        System.out.println(phone_num.matches("[0-9]{10}"));


    }
}
