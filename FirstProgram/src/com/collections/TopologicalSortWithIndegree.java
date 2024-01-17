package com.collections;
import java.util.*;

public class TopologicalSortWithIndegree {

    private int vertices;
    private Map<Integer,List<Integer>>graph;
    private int[] inDegree;
    public TopologicalSortWithIndegree(int vertices){
        this.vertices=vertices;
        this.graph=new HashMap<>();
        this.inDegree=new int[vertices];
        for(int i=0;i<vertices;i++){
            graph.put(i,new LinkedList<>());
        }

    }
    public void addEdge(int u,int v){
        graph.get(u).add(v);
        inDegree[v]++;
    }
    public List<Integer> topologicalSort(){
        List<Integer> result=new ArrayList<>();
        Queue<Integer> queue=new LinkedList<>();
        //Add vertices with in-degree 0 to the queue
        for(int i=0;i<vertices;i++){
            if(inDegree[i]==0){
                queue.offer(i);
            }
        }
        while(!queue.isEmpty()){
            int current=queue.poll();
            result.add(current);
            //Reduce in-degree of adjacent vertices and enqueue if in-degree
            //becomes 0
            for(int neighbor:graph.get(current)){
                inDegree[neighbor]--;
                if(inDegree[neighbor]==0){
                    queue.offer(neighbor);
                }
            }
        }
        //check for cycles (if not all vertices are included in the result)
        if(result.size()!=vertices){
            throw new RuntimeException("Graph contains a cycle");
        }
        return result;
    }
    public static void main(String args[]){

        TopologicalSortWithIndegree g=new TopologicalSortWithIndegree(6);
        System.out.println(g);
        g.addEdge(5,2);
        g.addEdge(5,0);
        g.addEdge(4,0);
        g.addEdge(4,1);
        g.addEdge(2,3);
        g.addEdge(3,1);

        List<Integer> topologicalOrder = g.topologicalSort();
        System.out.println("Topological Sorting: "+topologicalOrder);

    }
}
