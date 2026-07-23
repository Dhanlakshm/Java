package com.nsam.arrays;

public class Arrays_sum {
    public static void main(String[] args) {
       int a[]={10,20,30,40};

       int b[][]={
               {10,20,30},
               {40,50,60},
               {70,80,90}
       };
        int sum=0;
        for(int i=0;i<a.length;i++)
        {
            sum=sum+a[i];
        }
        System.out.println("Sum 1D: "+sum);
        int sum2=0;
        for (int i=0;i<b.length;i++)
        {
            for(int j = 0; j<b[i].length ; j++)
            {
                sum2=sum2+b[i][j];
            }
        }
        System.out.println("Sum 2D: "+sum2);

    }
}
