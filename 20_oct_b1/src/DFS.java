import java.util.ArrayList;

public class DFS {
    static ArrayList<Integer> graph[];
    static boolean visited[];
    static void dfs(int node)
    {
        visited[node]=true;
        System.out.print(node+" ");
        for(int neigh:graph[node])
        {
            if(visited[neigh]==false)       //[t,f,f,f,f]
            {
              dfs(neigh);
            }
        }
    }
    public static void main(String[] args) {
        int vertices=6;
      graph=new ArrayList[vertices];  //[ [],[],]
        visited=new boolean[vertices];
    for(int i=0;i<vertices;i++)
    {
        graph[i]=new ArrayList<>();     //[[],[],[],[],[],[],[]]
    }

    graph[0].add(1);
    graph[0].add(2);

    graph[1].add(3);
    graph[1].add(4);

    graph[2].add(5);
    graph[3].add(1);
        graph[4].add(1);
graph[5].add(1);

dfs(0);

    }
}

//          1
//      2       3
//  4      5        6
//BFS---> 1,2,3,4,5,6
//DFS --->1,2,4,5,3,6
