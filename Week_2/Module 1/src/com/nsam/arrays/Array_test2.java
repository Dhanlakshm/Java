package com.nsam.arrays;

public class Array_test2 {
    public static void main(String[] args) {
        int a[]={12,3,4,5,3,8};
        int sum=0;
        for(int i=0;i<a.length;i++)
        {
            sum=sum+a[i];
        }
        System.out.println("Sum: "+sum);
    }
}
