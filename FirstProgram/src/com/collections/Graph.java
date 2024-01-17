package com.collections;
import java.util.*;

public class Graph {
    private Map<Integer, List<Integer>> map;
    public Graph(){
        map=new HashMap<Integer, List<Integer>>();
    }
    public void addVertex(int vertex){
        map.put(vertex,new ArrayList<Integer>());
    }
    public void addNewEdge(int source,int destination){
        //add destination to the arrayList of source
        // 1 get the arraylist of 1 and add the destination(2)
        if(!map.containsKey(source))
            addVertex(source);
        if(!map.containsKey(destination))
            addVertex(destination);
        map.get(source).add(destination);
        /*it can be also written as
        List<Integer> list=map.get(source);
        list.add(destination);//1 2 1-[2]
         */
    }
    public void findBFS(int source){
        //by getting the keyset from the map
        int vertices=map.keySet().size();
        //0 1 2 3 4 5 6 7 8
        //T T T F T T T F F
        boolean visited[]=new boolean[vertices];
        LinkedList<Integer> queue=new LinkedList<Integer>();
        visited[source-1]=true;
        queue.add(source);
        while(queue.size()!=0){
            source=queue.poll();
            System.out.print(source+" ");//1 3 5 2 7 4 9
            //find the adjacent vertices of source
            List<Integer> adjVertices=map.get(source);
            Iterator<Integer> itr= adjVertices.listIterator();
            while(itr.hasNext()){
                int v=itr.next();
                if(!visited[v-1]){
                    visited[v-1]=true;
                    queue.add(v);
                }
            }
        }
    }

    public void findDFS(int source){
        int vertices=map.keySet().size();
        boolean visited[]=new boolean[vertices];
        Stack<Integer> stack=new Stack<Integer>();
        visited[source-1]=true;
        stack.push(source);
        while(!stack.isEmpty()){
            source=stack.pop();
            System.out.println(source);
            List<Integer>adj=map.get(source);
            Iterator<Integer> itr=adj.listIterator();
            while(itr.hasNext()){
                int nextVertex=itr.next();
                if(!visited[nextVertex-1]){
                    visited[nextVertex-1]=true;
                    if(!stack.contains(nextVertex))
                        stack.push(nextVertex);
                }
            }
        }
    }
    public int countVertices(){
        return map.keySet().size();
    }
    public int noOfEdges(){
        Set<Integer> vertices = map.keySet();
        int count=0;
        for(Integer v:vertices){
            List<Integer> edges=map.get(v);
            count=count+edges.size();
        }
        return count;


    }

    public static void main(String[] args){
        Graph graph=new Graph();
        graph.addVertex(1);
        graph.addVertex(2);
        graph.addVertex(3);
        graph.addVertex(4);

        graph.addNewEdge(1,2);
        graph.addNewEdge(1,3);
        graph.addNewEdge(1,4);
        graph.addNewEdge(2,4);
        System.out.println(graph.map);
        System.out.println("No of vertices "+graph.countVertices());
        graph.findBFS(1);
        graph.addVertex(1);
        graph.addVertex(2);
        graph.addVertex(3);
        graph.addVertex(4);
        graph.addVertex(5);
        graph.addVertex(6);
        graph.addNewEdge(5,3);
        graph.addNewEdge(3,1);
        graph.addNewEdge(3,4);
        graph.addNewEdge(5,6);
        //graph.findBFS(1);
        graph.addVertex(1);
        graph.addVertex(2);
        graph.addVertex(3);
        graph.addVertex(4);
        graph.addVertex(5);
        graph.addVertex(6);
        graph.addVertex(7);
        graph.addVertex(8);
        graph.addNewEdge(1,2);
        graph.addNewEdge(2,1);
        graph.addNewEdge(1,4);
        graph.addNewEdge(4,1);
        graph.addNewEdge(1,3);
        graph.addNewEdge(3,1);
        graph.addNewEdge(2,5);
        graph.addNewEdge(5,2);
        graph.addNewEdge(3,6);
        graph.addNewEdge(6,3);
        graph.addNewEdge(4,5);
        graph.addNewEdge(5,4);
        graph.addNewEdge(4,6);
        graph.addNewEdge(6,4);
        graph.addNewEdge(5,7);
        graph.addNewEdge(7,5);
        graph.addNewEdge(6,7);
        graph.addNewEdge(7,6);
        graph.addNewEdge(7,8);
        graph.addNewEdge(8,7);
        graph.findDFS(1);



















    }

}
