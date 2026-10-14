package package1;

public class test2 {
    public static void main(String[] args) {
//        System.out.println(Character.isLetterOrDigit(':'));
        String s="JavaJava@gmail.com";

        String r=s.replaceAll("Java","Python");
        System.out.println(r);

        String s1="abc123def456";
        System.out.println(s1.replaceAll("\\d",""));


    }
}
