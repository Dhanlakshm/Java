import java.util.HashMap;

public class Test {
    public static void main(String[] args) {
        int a[] = {10, 20, 30, 40, 50, 20};

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int n:a)
        {
            map.put(n,map.getOrDefault(n,0)+1);
        }
        System.out.println(map);
        System.out.println(map.getOrDefault(200, 0));
//        for (int i = 0; i < a.length; i++) {
//            int n = a[i];
//
//            map.put(n, map.getOrDefault(n, 0)+1);
////
////            if (map.containsKey(n)) {
////                map.put(n, map.get(n) + 1);
////            } else {
////                map.put(n, 1);
////            }
//        }
//        System.out.println(map);
    }
}
