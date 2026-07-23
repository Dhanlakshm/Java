package com.nsam.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Array_test1 {
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        int arr[]=new int[5];
        System.out.println("Enter the array elemnts:");
        for (int i=0;i<arr.length;i++)
        {
            arr[i]=s.nextInt();
        }
        System.out.println(Arrays.toString(arr));

//        int a[]={10,20,30,40};
//        System.out.println(Arrays.toString(a));

//       for(int i=0;i<a.length;i++)
//       {
//           System.out.println(a[i]);
//       }



    }
}
