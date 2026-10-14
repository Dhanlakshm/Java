package package1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution {
        //[[1,2],[2,6],[1,3],[3,5],[1,5],[1,6],[3,3]]
        // Complete the freqQuery function below.
        static List<Integer> freqQuery(List<List<Integer>> queries) {

            List<Integer> result=new ArrayList<>();
            HashMap<Integer, Integer> freq=new HashMap<>();

            for(List<Integer> query:queries)
            {
                int operation=query.get(0);
                int value=query.get(1);

                if(operation==1)
                {
                    //insert
                    //.put(key, value)
                }
                if(operation==2)
                {
                    //delete
                    //.remove(key)
                }
                if(operation==3)
                {
                    //check the occurance
                    //use for loop to traverse through the map
                }
            }
            return result;


        }

        public static void main(String[] args) {
            List<List<Integer>> queries=new ArrayList<>();
//            queries.add();
            List<Integer> res=freqQuery(queries);

        }
}
