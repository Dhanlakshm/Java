import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) {
        int a[]={10,20,5,30,500};

        for(int i=1;i<a.length;i++)
        {
            int key=a[i];
            int j=i-1;

            while (j>=0 && a[j]>key)    //compare
            {
                a[j+1]=a[j];        //shift
                j--;
            }
            a[j+1]=key;         //insert
        }
        System.out.println(Arrays.toString(a));

    }
}


