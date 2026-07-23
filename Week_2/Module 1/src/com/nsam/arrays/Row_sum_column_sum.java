package com.nsam.arrays;

public class Row_sum_column_sum {
    public static void main(String[] args) {
        int a[][]={
                {10,20,30},
                {40,50,60},
                {70,80,90}
        };

        //calculating row-wise sum
        for(int i=0; i<a.length;i++) {
            int rowSum=0;
            for(int j=0;j<a[i].length;j++) {
                rowSum+=a[i][j];
            }
            System.out.println("Row sum: "+rowSum);
        }

        //calculating column-wise sum
      for(int j=0;j<a[0].length;j++)  {
            int colSum=0;
          for(int i=0; i<a.length;i++) {
              colSum+=a[i][j];
            }
            System.out.println("Column sum: "+colSum);
        }
    }
}
