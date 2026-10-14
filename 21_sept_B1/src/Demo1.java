import java.util.Arrays;

public class Demo1 {
    public static void main(String[] args) {

        int a[]={40,50,30,4,6};

        for(int i=1;i<a.length;i++)
        {
            int key=a[i];       //pick a key elemnt
            int j=i-1;

            while(j>=0 && a[j]>key)  //compare
            {
                a[j+1]=a[j];        //shift
                j--;
            }
            a[j+1]=key;     //insert
        }
        System.out.println(Arrays.toString(a));

    }
}
//a1=[1,2,4,5,6,9,10,11,14]
//a2=[3,3,7,8,12,13,15]

//res=
