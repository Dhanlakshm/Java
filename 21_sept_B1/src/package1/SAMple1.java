package package1;

import java.util.Arrays;

public class SAMple1 {
    public static void main(String[] args) {

        int a[]={50,32,4,6,83,1};

        for(int i=1;i< a.length;i++)
        {
            int key=a[i];           //pick the key
            int j=i-1;
            while(j>=0 && a[j]>key)     //compare
            {
                a[j+1]=a[j];        //shift
                j--;
            }
            a[j+1]=key;         //insert the key
        }
        System.out.println(Arrays.toString(a));
    }
}
