package package1;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        String s="123 456 789";
        System.out.println(s.replaceFirst(" ","-"));

        String s1=" Helo Java ";
        System.out.println(s1.trim());

        String x="JAva";
        String y="Python";
//        int y=10;
        System.out.println(x+y);
        System.out.println(x.concat(y));

        String sr[]={"Java","Python","C++"};
        System.out.println((String.join("-",sr)));

        //[A-Z],[a-z],[0-9]
        //^
        //$
        //.
        //*
        //+

        String p1="2Java";
        System.out.println(p1.matches("^[A-Z].*"));

        String p2="54765764"; //check if it only contains digits

        String p3="Java@123";
//        [^A-Z,a-z,0-9]
        System.out.println(p3.matches(".*[^A-Z,a-z,0-9].*"));
        System.out.println(p3.replaceAll("[^A-Z,a-z,0-9]",""));


        String p5="JAva123"; //-->[^0-9], ""

        String p6="JAva@gmail.com";  //Java@nitte.edu
        //"nsam@gmail.com" --> nsam@nitte.edu
        System.out.println(p6.replace("gmail.com","nitte.edu.in"));

        //Password strength--> string /weak
        String password="dhanlakshmi@123";

        //1. length>10   ---> password.length()>10
        //2. must contain UpperCase letters , Lowercase letters, --> password.matches(.*[A-Z,a-z,0-9].* )
        // SPecial characters --> password.matches(.*[^A-Z,a-z,0-9].* )

        //"Strong password" or "Weak password"
if(password.length()>10 && password.matches(".*[A-Z,a-z,0-9].*") && password.matches(".*[^A-Z,a-z,0-9].*"))
{
    System.out.println("strong password");
}
else{
    System.out.println("weak password");
}


//task--> validate the email
        String email="jaya@gmail.com";
    String parts[] =email.split("@");

//        System.out.println(parts[1]);
//        System.out.println(Arrays.toString(parts2));
//        System.out.println(Arrays.toString(parts));
        System.out.println("condition 1: "+(parts.length==2));
        System.out.println("condition 2: "+(parts[1].split("\\.").length==2)+" length: "+parts[1].split("0").length);
        System.out.println("condition 3: "+(parts[0]!=null));

        if(parts.length==2 && parts[1].split("\\.").length==2 && parts[0]!=null)
        {
            System.out.println("valid");
        }
        else{
            System.out.println("Invalid");
        }
//sr[]=[jaya, gmail.com]
        //sr[1]="gamil.com"

        //@ --> shd not appear twice
        //. --> shd not appear twice
        //before "@" string shd not be empty


//        String x1="j.hbvhm";
//String y1[]=x1.split(".");
//        System.out.println(Arrays.toString(y1));
//
//
//        String p="dha.nu";
//        String pr[]=p.split(".");
//        System.out.println(Arrays.toString(pr));

        String phone="1618587590";
        if(phone.matches("[6-9][0-9]{9}"))
        {
            System.out.println("valid phone number");
        }
        else {
            System.out.println("not valid");
        }
        System.out.println("ASBC".matches("[A-Z]{4}"));
    }
}
