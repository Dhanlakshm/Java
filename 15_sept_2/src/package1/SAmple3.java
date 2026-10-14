package package1;
//task
//Input: [1,2,3,4,5,6,7,8,9], target =12
//output : find 2 elements from the array that sum upto the target value using two-pointer

public class SAmple3 {
    static boolean check_target(int a[], int target)
    {

        int sum=0;
        int left=0;
        int right=a.length-1;
    while(left<right) {
        sum = a[left] + a[right];  //sum =1+9 =10, 2+9, 3+9=12
        if (sum == target) {
            return true;
        } else if (sum < target) {  //sorted
            left++;
        } else {
            right--;
        }
}
                return false;
    }
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7,8,9};
        int target =12;
        boolean res=check_target(a, target);
            if(res)
            {
                System.out.println("found");
            }
            else{
                System.out.println("not found");
            }
        }
}
