import java.util.HashMap;

public class Sample1 {
    public static void main(String[] args) {

        //Input: NSAMN
        //{'N':2, 'S':1, 'A':1, 'M':1}
//        String s="nayana";
        int a[]={10,20,20,30,40,50};
        HashMap<Integer, Integer> map=new HashMap<>();

        for(int i=0; i<a.length;i++)
        {
                int n=a[i];
            if(map.containsKey(n))
            {
                map.put(n, map.get(n)+1);
            }
            else {
                map.put(n, 1);
            }
        }
//        System.out.println(map);

        for(int k:map.keySet())
        {
            if(map.get(k)>1)
            {
                System.out.println(k);
            }
        }

    }
}
//input: [Riya, Divya, Seema, Riya]
//output: Riya

//1. Bubble Sort -- compare it with next element, until the largest value is places at last position
//2. Insertion Sort -- take value as key compare it with previous element, and shift if the value is greater, and inster the key at correct index
//3. Merge sort









