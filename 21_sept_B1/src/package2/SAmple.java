package package2;

public class SAmple {
    public static void main(String[] args) {
        String s="Java Python React";
        String sr[]=s.split("a");
        for(String x:sr)
        {
            System.out.println(x);
        }

        String s1="Java";
        String s2=s1.replace('a','A');
        System.out.println(s2);

        String s3="this is Java code";
        String s4=s3.replace("Java","Python");
        System.out.println(s4);

        String s5=" Hello Java ";
        String s6=s5.trim();
        System.out.println(s5);
        System.out.println(s6);

        String s7="dhanu";
        String s8="jangalekar";
        System.out.println(s7.concat(" ").concat(s8));

        String res=String.join(",","Java","python","REact");
        System.out.println(res);

    }
}
