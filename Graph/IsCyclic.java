package Graph;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Scanner;

public class IsCyclic {
    public static class Edge{
        int src, nbr;
        
        Edge(int src, int nbr){
            this.src = src;
            this.nbr = nbr;
        }
    }

    static void display(ArrayList<Edge>[] graph){
        int vtces = graph.length;

        for(int i = 0; i < vtces; i++){
            ArrayList<Edge> list = graph[i];
            System.out.print(i + " -> ");
            for(Edge e : list) System.out.print(e.nbr + " ");
            System.out.println();
        }
    }

    static boolean isCyclic(ArrayList<Edge>[] graph){
        int vtces = graph.length;
        boolean[] visited = new boolean[vtces];

        for(int vtx = 0; vtx < vtces; vtx++){
            if(visited[vtx] == false){
                boolean res = isCyclicHelper(graph, vtx, visited);
                if(res) return true;
            }
        }

        return false;
    }


    static boolean isCyclicHelper(ArrayList<Edge>[] graph, int vtx, boolean[] visited){

        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(vtx);

        while(!queue.isEmpty()){
            int front = queue.remove();

            if(visited[front] == false){
                visited[front] = true;
                for(Edge e : graph[front]) if(visited[e.nbr] == false) queue.add(e.nbr);
            }
            else return true;
        }

        return false;
    }
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int vtces = sc.nextInt();
        int edges = sc.nextInt();

        ArrayList<Edge>[] graph = new ArrayList[vtces];

        for(int i = 0; i < vtces; i++) graph[i] = new ArrayList<>();

        for(int i = 0; i < edges; i++){
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();

            graph[v1].add(new Edge(v1, v2));
            graph[v2].add(new Edge(v2, v1));
        }

        sc.close();

        display(graph);
        System.out.println(isCyclic(graph));
    }
}

/*
7
6
0 1
1 2
2 3
3 4
4 5
5 6
 */ 