package package1;

import java.util.HashMap;

public class Demo {
    public static void main(String[] args) {
        int a[]={10,20,30,40,50,10,30,20,50};
        String s="nsasn";   //{n=2, s=2, a=1}
        //{10:2, 20:1, 30:1, 40:1, 50:1}
        String sr[]={"Riya", "Divya", "Seema", "Riya"};
        //{Riya=2, Divya=1, Seema=1}
        HashMap<String, Integer> map =new HashMap<>(); //{}

        for(int i=0; i< sr.length;i++)
        {
            String ch=sr[i];
            if(map.containsKey(ch))
            {
                map.put(ch,map.get(ch)+1);
            }
            else{
                map.put(ch, 1); //{10:1, 20:1, 30:1, 40:1, 50:1, }
            }
        }
        System.out.println(map);

        for(String key:map.keySet())
        {
            if(map.get(key)>1)
            {
                System.out.println(key+" : "+ map.get(key));
            }
        }
    }
}
//["Riya", "Divya", "Seema", "Riya"]
