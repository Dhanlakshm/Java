import java.util.Arrays;

public class Demo {

    static int[] bubble_sort(int a[])
    {
        for(int i=0; i<a.length;i++)
        {
            for(int j=0;j<a.length-i-1;j++)
            {
                if(a[j]>a[j+1])
                {
                   int temp=a[j];
                   a[j]=a[j+1];
                   a[j+1]=temp;
                }
            }
        }
       return a;
    }
    public static void main(String[] args) {
        //[20,30,50,5,30,7]
        int a[]={5,20,3,18,30,8105,94,2,50};
        int res[]=bubble_sort(a);
        System.out.println(Arrays.toString(a));
    }
}
