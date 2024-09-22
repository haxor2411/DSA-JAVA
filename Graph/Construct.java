package Graph;

import java.util.ArrayList;
import java.util.Scanner;

public class Construct {
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

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int vtces = sc.nextInt();
        int edges = sc.nextInt();

        ArrayList<Edge>[] graph = new ArrayList[vtces];

        for(int i = 0; i < vtces; i++) graph[i] = new ArrayList<Edge>();

        for(int i = 0; i < edges; i++){
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();
            int wt = sc.nextInt();

            graph[v1].add(new Edge(v1, v2, wt));
            graph[v2].add(new Edge(v2, v1, wt));
        }

        sc.close();

        display(graph);
    }
}


/*
7
8
0 3 40
0 1 10
1 2 10
2 3 10
3 4 4
4 5 3
5 6 3
4 6 8
 */
