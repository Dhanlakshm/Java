package package1;
//Input:
//a[]={1,2,5,6,9,12,13,14};
//b[]={3,4,7,8,10,11,15};

//Output:
//res[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};

import java.util.Arrays;

public class Sample2 {
    public static void main(String[] args) {
        int a[]={1,2,5,6,9,12};  //i=0
    int b[]={3,4,7,8,10,11,15};  //j=0
    int res[]=new int[a.length+b.length];  //k=0

        int i=0, j=0, k=0;

        while(i<a.length && j<b.length){   //if the a nd b arrays have same length
            if(a[i]<b[j])
            {
                res[k]=a[i];
                i++;
                k++;
            }
            else{
                res[k]=b[j];
                j++;
                k++;
            }
        }

        while (i< a.length)  //if there are any extra elements in a array
        {
            res[k]=a[i];
            i++;
            k++;
        }
        while (i< b.length)  //if there are any extra elements in b array
        {
            res[k]=b[j];
            j++;
            k++;
        }
        System.out.println(Arrays.toString(res));



    }
}
