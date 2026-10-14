package package1;

import java.util.HashMap;

public class Sample {
    public static void main(String[] args) {

        int a[]={10,20,30,30,40,50,50,30};
        HashMap<Integer, Integer> map=new HashMap<>();

        for(int i=0;i< a.length;i++)
        {
            int n=a[i];
            map.put(n,map.getOrDefault(n, 0)+1);   //use the default value
        }
        System.out.println(map);
    }
}

