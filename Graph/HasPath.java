package Graph;

import java.util.ArrayList;
import java.util.Scanner;

public class HasPath {
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

    static boolean hasPath(ArrayList<Edge>[] graph, int vtx, int dest, boolean[] visited){
        visited[vtx] = true;

        if(vtx == dest) return true;

        for(Edge e : graph[vtx]){
            if(visited[e.nbr] == false){
                boolean res = hasPath(graph, e.nbr, dest, visited);
                if(res) return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int vtces = sc.nextInt();
        int edges = sc.nextInt();

        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph= new ArrayList[vtces];

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
        System.out.println(hasPath(graph, src, dest, visited));
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
