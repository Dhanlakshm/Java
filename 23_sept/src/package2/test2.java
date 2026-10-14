package package2;

public class test2 {

    static void pair_sum(int a[], int target)
    {
        int sum=0;
        int left=0;
        int right=a.length-1;
      while (left<right)
        {
             sum=a[left]+a[right];
            if(sum==target)
            {
                System.out.println("found: "+a[left]+" + "+a[right]+" = "+sum);
                break;
            } else if (sum<target) {
                left++;
            }
            else {
                right--;
            }
//            left++;
//            right++;


        }
    }
    public static void main(String[] args) {

        int a[]={1,2,3,4,5,6,7,8,9,10};
        int target =12;

        pair_sum(a, target);
    }
}
