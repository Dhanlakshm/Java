package package1;

import java.util.HashMap;

public class test2 {
    public static void main(String[] args) {
        int a[]={10,20,30,30,40,50,20,60,60,40};

        int b[]={10,20,30,40,10};
        HashMap<Integer, Integer> map=new HashMap<>();

        for(int n:b)
        {
            map.put(n, map.getOrDefault(n,0)+1);
        }
        System.out.println(map);
//        System.out.println(map.getOrDefault(100,0));
//        System.out.println(map);

    }
}
