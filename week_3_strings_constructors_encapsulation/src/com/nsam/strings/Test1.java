package com.nsam.strings;

import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) {
        //Strings-2types
        //Mutable - values can be changed further
        //Immutable - once initialized cannot be changed

        //Mutable strings --- StringBuilder, StringBuffer
        StringBuffer s1=new StringBuffer("Batchb2");
        System.out.println(s1);
        StringBuilder s2=new StringBuilder("batchb3");
        System.out.println(s2);

        //insert(), replace(), delete(), reverse(), append()
        s2.append("NSAM");
        System.out.println(s2);

        s2.insert(2,"ABDJ");
        System.out.println(s2);

        s2.replace(3,6,"xyz");
        System.out.println(s2);

        s2.delete(1,5);
        System.out.println(s2);
        s2.reverse();
        System.out.println(s2);


        //Immutable strings -- 2 ways create
        //1. Type-1 decalaration
        String s3="Java";
        //2. Type-2 decalaration
        String s4=new String("Java");

        String x="Java";
        String y="Java";
        System.out.println(x==y); //true

        String p= new String("Java");
        String q=new String("Java");
        System.out.println(p==q);   //false

        //String Pool -- String constnat pool, Non-constnat pool
        //Inbuilt methods in STring class
        String z="RajaRamMohanRoy";
        System.out.println(z.charAt(5));
        System.out.println(z.toLowerCase());
        System.out.println(z.toUpperCase());
        System.out.println(z.indexOf('R'));
        System.out.println(z.lastIndexOf('R'));
        String a="nsam";
        String b="Nsam";
//        System.out.println(a.equals(b));   //true
        System.out.println(a.equalsIgnoreCase(b));  //false
        char arr[]=z.toCharArray();
        System.out.println(Arrays.toString(arr));

    }
}
