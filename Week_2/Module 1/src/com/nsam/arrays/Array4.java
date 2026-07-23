package com.nsam.arrays;

import java.util.Arrays;

public class Array4 {

   static int count_factors(int num)
    {
        int count=0;
        for(int i=1;i<=num;i++)
        {
            if(num%i==0) {
               count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
//        int a[]={1,2,3};
//        int b[]=Arrays.copyOf(a,2);
//        System.out.println(Arrays.toString(b));
//        System.out.println(Arrays.toString(a));

        int num=11;
       int count= count_factors(num);
        System.out.println("count: "+count);
        if(count==2)
        {
            System.out.println(num+" is a Palindrome number");
        }
        else{
            System.out.println(num+" is not a Palindrome but Composite number");
        }

    }

}
