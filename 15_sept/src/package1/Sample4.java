package package1;
//task-2
//Input : [1,2,3,4,5,6,7,8,9], target =12
//output : find 2 elements that sum upto target
public class Sample4 {
    static boolean check_target(int a[], int target)
    {
        int left=0;
        int right=a.length-1;

        while (left<right)
        {
            int sum=a[left]+a[right];
            if(sum==target)
            {
                return true;
            }
            else if (sum<target) {
                left++;
            }
            else {
                right--;
            }
        }
       return false;
    }
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7,8,9};
        int target=12;

    boolean res = check_target(a, target);
    if(res)
    {
        System.out.println("found");
    }
    else {
        System.out.println("not found");
    }


    }
}
