package com.floydWarShall;

public class FloydWarshall {
    public static void main(String[] args){
        int[][] graph={
                {0, 3, Integer.MAX_VALUE, 7},
                {8, 0,2, Integer.MAX_VALUE},
                {5, Integer.MAX_VALUE,0, 1},
                {2, Integer.MAX_VALUE, Integer.MAX_VALUE,0}
        };
        int[][] result=floydWarshall(graph);
        //Print the result
        for(int i=0;i<result.length;i++){
            for(int j=0;j<result[i].length;j++){
                System.out.println(result[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void printMatrix(int v,int[][]dist){

        for(int i=0;i<v;i++){
            for(int j=0;j<v;j++){
              System.out.print(dist[i][j]+" ");
            }
            System.out.println();
        }
    }
    private static int[][] floydWarshall(int[][] graph){
        int V= graph.length;
        int[][] dist=new int[V][V];
        for(int i=0;i<V;i++){
            for(int j=0;j<V;j++){
                dist[i][j]=graph[i][j];
            }
        }
        for(int k=0;k<V;k++){
            for(int i=0;i<V;i++){
                for(int j=0;j<V;j++){
                    if(dist[i][k]!=Integer.MAX_VALUE && dist[k][j]!=Integer.MAX_VALUE
                    && dist[i][j] + dist[k][j]<dist[i][j]){
                        dist[i][j]=dist[i][k]+dist[k][j];
                    }
                }
            }
            printMatrix(4,dist);
            System.out.println();
        }
        return dist;
    }
}
