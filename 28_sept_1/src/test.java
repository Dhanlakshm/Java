import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        String s="jaya@gmail.com@nitte.edu";
        String sr[]=s.split("@", 2);
        System.out.println(Arrays.toString(sr));

        String ph="0123-446-789-58";
        String ph1[] =ph.split("-",2);
        System.out.println(Arrays.toString(ph1));

        //replace
        String a="Java";
        System.out.println(a.replace("a","A"));

        String b="Java Python Java Python C#";
        System.out.println( b.replaceFirst("Java", "C"));

        String c=" Hello Java ";
        System.out.println(c.trim());

        //
        String html="<p>Hello</p><p>World</p>";
        System.out.println(html.replace("<p>","").replace("</p>",""));


        String x="Java";
        String y="Python";
//        int y=10;
        System.out.println(x+y);
        System.out.println(x.concat(y));

        //
        String languages[]={"Java", "Python","C++"};
        System.out.println(String.join("@",languages));

        String n="Java@jamil.com";
        System.out.println(n.substring(0,3));

        String name="John Doe Smith";  //output: Deo
        int start=name.indexOf(" ")+1;
        int end=name.lastIndexOf(" ");
        System.out.println(name.substring(start, end));
        String name2="Neha sumith Jha"; //output: sumith

        String email="java@gamil.com";
        int start1=email.indexOf("@")+1;
        System.out.println(email.substring(start1));

        String s2="Cse";

        //^--> beginning
        //$ --> ending
        //. --> any single character
        //* --> previous char can occur 0 or any numver of times
        //[A-Z]
        //[a-z], [0-9]
        //[^A-Z], [^a-z], [^0-9]
        //[^A-Z,a-z,0-9]
        //  \\d --> digits
        //  \\s--> space
        // \\w --> a-z,A-Z,0-9, _
        // + --> [A-Z]+
        String r1="345se";
        System.out.println(r1.matches("^[A-Z].*"));

        String p2="165Ahdcvs"; //check id it starts with digit
        String p3="Java123";
        System.out.println( p3.replaceAll("\\d",""));

        String p4="jcbskh367Java";
        System.out.println(p4.matches(".*[A-Z].*"));

        String p5="JAva%ub4567i8c";
        System.out.println(p5.matches(".*[^A-Z,a-z,0-9].*"));

        String p6="abc342";
        //replace all non-digit character with ""
        System.out.println(p6.replaceAll("[^0-9]",""));


        String pass="nsam@1234Fv";

        //1. length greater than 10
        //2. must have UpperCase, LowerCase and special charcters

        //"Strong password"
        //"Weak password"


        if(pass.length()>=10){
        if(pass.matches(".*^[A-Z,a-z,0-9].*")){
            if(pass.matches((".*[^A-Z,a-z,0-9].*"))){
                System.out.println("STRONG PASS");
            }
            else{
                System.out.println("WEAK");
            }
        }
        else{
            System.out.println("WEAK");
        }
    }
    }
}
