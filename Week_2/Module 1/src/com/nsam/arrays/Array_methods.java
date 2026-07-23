package com.nsam.arrays;

import java.util.Arrays;
import java.lang.Math;
public class Array_methods {
    public static void main(String[] args) {

       int num=12345;
        System.out.println(num%10); //extract the last digit
        System.out.println(num/10); //gives all the digits except the last digit


        //print the number of digits in the given number
     int count=0;
      while(num!=0){

           num=num/10;            //step 1: removes the last digit from the number
          count++;               //step-2: every time a one digit is removed, increment the count value
       }
       System.out.println("Count: "+count);

       System.out.println((int)(Math.log10(num)+1));  //alternate way to count the digits

        //comparing arrays
        int a[] = {10,20,30};
        int b[]={40,50,60};
        System.out.println(Arrays.equals(a,b)); //1D
        int c[][]={
                {10,20},
                {40,50}
        };
        int d[][]={
                {10,20},
                {40,50}
        };
        System.out.println(Arrays.deepEquals(c,d)); //2D

//sorting array elements using in-built methods
        int arr[]={16,511,51,215,1545,51};

        Arrays.sort(arr);
     //   Arrays.sort(arr,1,4);     //sort only some part of the array
        System.out.println(Arrays.toString(arr)); //prints the sorted array

//fill the array with specific value
        int x[]=new int[10];
        Arrays.fill(x, 7);
//        Arrays.fill(x, 1,5,7);  //fills the value=7 only in the specified indexes
        System.out.println(Arrays.toString(x));

        //create a copy of a array
        int y[]={10,20,30,40,50};   //make a copy of y[] and store it in a new array called z[]
        int p[]=Arrays.copyOf(y,y.length);   //copies all the elements
        int q[]=Arrays.copyOf(y,7);   //copies 5 elements from y[], and remaining indexes will be padded with 0
        int r[]=Arrays.copyOf(y,3);   //copies only 3 elements from y[], and remaining will be truncated(removed)
        System.out.println(Arrays.toString(p));
        System.out.println(Arrays.toString(q));
        System.out.println(Arrays.toString(r));


        //search an element in the array(binarySearch()-works only for sorted array)
      int s[]={10,20,30,450,652,700};
     System.out.println(Arrays.binarySearch(s,30)); //returns the index number if the element is found
     System.out.println(Arrays.binarySearch(s,7));  //If not found, returns -(insertion point)-1 —> negative number encoding where the key would go to keep the array sorted


    }
}
