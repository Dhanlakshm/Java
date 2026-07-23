package com.nsam.arrays;

import java.util.Arrays;


public class Transpose {
    public static void main(String[] args) {

        int[][] a={
                {10,20,30},
                {40,50,60},
                {70,80,90}
        };

        int rows=a.length;
        int cols=a[0].length;
        int [][]result=new int[cols][rows];

        for(int i=0;i<result.length;i++)
        {
            for(int j=0;j<result[i].length;j++)
            {
                result[j][i]=a[i][j];
            }
        }
        System.out.println(Arrays.deepToString(a));
        System.out.println(Arrays.deepToString(result));
    }
}
