package Graph;

import java.util.ArrayList;
import java.util.Scanner;

public class PrintAllPaths {
    public static class Edge{
        int src, nbr, wt;

        Edge(int src, int nbr, int wt){
            this.src = src;
            this.nbr = nbr;
            this.wt = wt;
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

    static void printPath(ArrayList<Edge>[] graph, int vtx, int dest, String path, boolean[] visited){
        if(vtx == dest){
            System.out.println(path);
            return;
        }
        
        visited[vtx] = true;
        
        for(Edge e : graph[vtx]){
            if(visited[e.nbr] == false) printPath(graph, e.nbr, dest, path + e.nbr, visited);
        }
        visited[vtx] = false;
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
            int wt = sc.nextInt();

            graph[v1].add(new Edge(v1, v2, wt));
            graph[v2].add(new Edge(v2, v1, wt));
        }

        int src = sc.nextInt();
        int dest = sc.nextInt();
        sc.close();

        display(graph);

        boolean[] visited = new boolean[vtces];

        printPath(graph, src, dest, "" + src, visited);
    }
}


/*
7
8
0 1 10
1 2 10
2 3 10
0 3 10
3 4 10
4 5 10
5 6 10
4 6 10
0
6
 */