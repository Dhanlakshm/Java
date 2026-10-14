
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {

    static void bfs(ArrayList<ArrayList<Integer>> graph, int start, int vertices)
    {
        //create a boolean arry
        boolean visited[]=new boolean[vertices];  //[f,f,f,f,f,f,f]
        Queue<Integer> queue =new LinkedList<>();   //LinkedList as Queue

        visited[start]=true;  //[t,f,f,f,f,f,f]
        queue.add(start);   //queue=[,1,2]

        while (!queue.isEmpty())
        {
            //queue=[2]
            int current=queue.poll();  //cur=1
            //graph=[ [1,2],[0,3,4],[0,5,6],[1],[1],[2],[2] ]
            System.out.print(current+"-->");
            for(int neighb:graph.get(current))
            {
                // neighb=3-->  //[t,t,t,f,f,f,f]
                if(visited[neighb]==false)
                {
                    visited[neighb]=true;   ////[t,t,t,f,f,f,f]
                    queue.add(neighb);      //queue=[1,2]
                }
            }

        }
   }


    public static void main(String[] args) {
        int vertices=7;
        ArrayList<ArrayList<Integer>> graph=new ArrayList<>(); //[ ]
        //i=0--> new ArrayList()
        //i=1--> new ArrayList...
        for(int i=0;i<vertices;i++)
        {
            graph.add(new ArrayList<>());
        }
        //[ [],[],[],[],[],[] ]
        graph.get(0).add(1); //[ [1],[],[],[],[],[] ]
        graph.get(0).add(2);    //[ [1,2],[],[],[],[],[] ]

        graph.get(1).add(0); //[ [1,2],[0,3,4],[],[],[],[] ]
        graph.get(1).add(3);
        graph.get(1).add(4);

        graph.get(2).add(0); //[ [1,2],[0,3,4],[0,5,6],[],[],[] ]
        graph.get(2).add(5);
        graph.get(2).add(6);

        graph.get(3).add(1);
        graph.get(4).add(1);

        graph.get(5).add(2);
        graph.get(6).add(2);

        bfs(graph,0,vertices);
    }
}

//         0
//      1    2
//    3   4 5  6

//0--> [1,2]
//1--> [0,3,4]
//2--> [0,5,6]
//3--> [1]
//4--> [1]
//5--> [2]
//6--> [2]

//graph=[ [1,2],[0,3,4],[0,5,6],[1],[1],[2],[2] ]
//graph.get(0) --> [1,2]


