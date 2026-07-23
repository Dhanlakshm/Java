package com.nsam.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays1 {
    public static void main(String[] args) {
        //1D array
        //2D array

        Scanner s=new Scanner(System.in);
        String a[]=new String[5];
        System.out.println("Enter the elements: ");
        for(int i=0;i<a.length;i++)
        {
            a[i]=s.next();
        }
        System.out.println("Array elements are: ");
        System.out.println(Arrays.toString(a));  //in-built method print 1D array
//        for(int i=0;i<a.length;i++)
//        {
//            System.out.print(a[i]+" ");
//        }


    }
}
