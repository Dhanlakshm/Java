import java.util.HashMap;

public class Sample {
    public static void main(String[] args) {
        //HAspMap -- does not allow duplicate pairs,
        //{10: 2, 20: 3, ..}
        HashMap<Integer, Integer> map=new HashMap<>();

        //add
        map.put(10, 1);
        map.put(20, 1);
        map.put(30, 2);
        map.put(30, 5);
        System.out.println(map);

        System.out.println(map.get(10));
        System.out.println(map.isEmpty());

        map.remove(10);
        System.out.println(map);
        System.out.println(map.containsKey(20));
        System.out.println(map.containsValue(5));

        System.out.println(map.keySet());
        System.out.println(map.values());

        //{A:20, B:30, C:40}

    }

}
