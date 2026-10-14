package package1;

import java.util.HashMap;

public class SAmple {
    public static void main(String[] args) {
        //{10:1, 20:2, 30:5}
        int a[]={10,20,30,40,50,10};
        //{10:2, 20:1, 30:1, 40:1, 50:1}
        HashMap<Integer, Integer> map =new HashMap<>(); //{}

        map.put(10, 1);
        map.put(10, 5);
        map.put(20, 4);
        map.put(50, 6);
        map.put(30, 1);
        map.put(40, 4);
        System.out.println(map);
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.containsKey(10));
        System.out.println(map.isEmpty());
        System.out.println(map.getOrDefault(10, 0));


    }
}
