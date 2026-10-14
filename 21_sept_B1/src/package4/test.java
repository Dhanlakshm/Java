package package4;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        String html="<p>hello</p><p>world</p>";
       String res =html.replace("<p>","").replace("</p>","");
        System.out.println(res);

        String s="Java Python Java Python Java";
        System.out.println(s.replace("a", "A"));

        String s1="ahjb123hbc456";
        System.out.println(s1.replace("\\d",""));

        String s4="Jon Deo  Smith";
        int strat =s4.indexOf(" ")+1;
        int last=s4.lastIndexOf(" ");
        System.out.println(s4.substring(strat, last));

        String email="jaya@gmail.com";
        System.out.println(email.substring(email.indexOf("@")+1));

        String s3="h e l l o";
        System.out.println(s3.replaceAll(" ",""));


        String s5="I love 3 Java";
        String num=s5.replaceAll("[^0-9]","");
        System.out.println(num);

        String text="JJJHelloworld";
        System.out.println(text.matches("J*Hello.*"));

        System.out.println(text.matches("[A-Z,a-z]+"));

        String num1="gr123rsg655vd";
        System.out.println(num1.matches(".*[0-9].*"));


        System.out.println(num1.replaceAll("[^0-9]",""));
        System.out.println( num1.indexOf('r',2));

        String password = "MyPass123!";

        boolean hasUppercase = password.matches(".*[A-Z].*");
        boolean hasLowercase = password.matches(".*[a-z].*");
        boolean hasDigit = password.matches(".*[0-9].*");
        boolean isLongEnough = password.length() >= 8;

        String res1=(hasUppercase && hasLowercase && hasDigit && isLongEnough) ? "STRONG" : "WEAK";
        System.out.println(res1);

        String withSpecial = "Hello@World#123!";
        System.out.println(withSpecial.replaceAll("[^A-Z,a-z,0-9]",""));

        String email1="jaya@gmail.com";
        String parts[]= email1.split("@");
        System.out.println(Arrays.toString(parts));


       boolean isValid =parts.length==2 && parts[1].contains(".") && (parts[0].length()!=0);
        System.out.println((isValid)?"isValid email":"is not valid email");
    }
}
