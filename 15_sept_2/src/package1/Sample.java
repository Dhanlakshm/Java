package package1;

import java.util.HashMap;

public class Sample {
    public static void main(String[] args) {
        int a[]={10,20,30,30,40,50,20,60,60,40};

        HashMap<Integer, Integer> map=new HashMap<>();
        //{10=1, 20=2, 30=2......}
        for(int i=0; i< a.length;i++)
        {
            int n=a[i];
            map.put(n,map.getOrDefault(n,0)+1);   //if the data is preset, it will return its value, if not, it will return default value=0
//            if(map.containsKey(n))
//            {
//                map.put(n, map.get(n)+1);
//            }
//            else{
//                map.put(n, 1);
//            }

        }
//        System.out.println(map);

        for(int key : map.keySet())  //[10,20,30,40,50,60]
        {
            if(map.get(key)>1)
            {
                System.out.print(key+" ");
            }
        }
    }
}
