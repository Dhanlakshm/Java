package package1;

import java.util.Arrays;

public class Sample {
    public static void main(String[] args) {
//        String s="Jhon,60,IT,500000,SoftwareEngg";
//        String sr[]=s.split(" ");
//
////        System.out.println(Arrays.toString(sr));
//
//        System.out.println("NAme: "+sr[0]);
//        System.out.println("Age: "+sr[1]);
//        System.out.println("dept: "+sr[2]);
//        System.out.println("SAl: "+sr[3]);
//
//
//        String phone="123-456-7890";
//
//
        //replace
        //particular char ina string
        //string in one stenence

        String s1="Java Python Java Python";

        System.out.println(s1.replaceFirst("Java","C++"));

        String s2="012-456-789";
        System.out.println(s2.replace("-",""));

        String html="<p>Hello</p><p>World</p>";
        String s3=html.replace("<p>","").replace("</p>"," ");
        System.out.println(s3);

        //[A-Z],[a-z],[0-9],., *,[A-Z]+, ^,$
        //\\d, \s, \w(lettes, digits, _)

        String x="sgd123gvfgh123";
        System.out.println(x.replaceAll("\\d",""));

        String y="A1235484cngdgf";
        System.out.println(y.matches(".[0-9].*"));

//        "1JAVA";  ---> ceck if it begins with digit
        String p="1Java";
        System.out.println(p.matches("^[0-9].*"));
//        "16515@#";

        String q="Java236@";
        System.out.println(q.replaceAll("[^A-Z,a-z,0-9]",""));

        String z="jaya@gmail.com";

        //substring(start, end)
        String d="Hamsini jdg Shetty";
        int start =d.indexOf(" ")+1;
        int end=d.lastIndexOf(" ");
        System.out.println( d.substring(start, end));

        System.out.println(z.substring(z.indexOf("@")+1));
        //jaya@gmail.com --> gmail.com

        String a="JAva";
        String b="Puthon";
//        System.out.println(a.concat(165415));  //no diffe datatypes
        System.out.println(a+151);


String branches[]={"JAva","Python","C++"};
    String res=String.join("-",branches);
        System.out.println(res);

//        "Dhanlakshmi";  -->chek if it starts with capital letter
//        "26555515";  --> check it contains only digits

        //validate the given password
        //1. it shd have both capital and small letter
        //2. 0-9
        //3. special characters
        //4. length>10
        //if it passes all the conditions --> "Strong" or "Weak"

        System.out.println(Character.isLetterOrDigit('#'));

    }
}
