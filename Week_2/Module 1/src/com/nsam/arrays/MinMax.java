package com.nsam.arrays;

public class MinMax {
    public static void main(String[] args) {
        int[] a={10,20,30,40,50,30,5,0};
        int min=a[0],max=a[0];

        for(int i=0;i<a.length;i++)
        {
            if(a[i]>max)
                max=a[i];
            if(a[i]<min)
                min=a[i];
        }
        System.out.println("Max: "+max);
        System.out.println("Min: "+min);
    }
}
