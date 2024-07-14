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

    public static boolean hasPath(ArrayList<Edge>[] graph, int src, int des){
        boolean[] visited = new boolean[graph.length];
        return hasPathHelper(graph, src, visited, des);
    }
    
    public static boolean hasPathHelper(ArrayList<Edge>[] graph, int vtx, boolean[] visited, int  des){
        if(vtx == des){
            return true;
        }
        visited[vtx] = true;

        for(Edge e : graph[vtx]){
            if(visited[e.nbr] == false){
                boolean res = hasPathHelper(graph, e.nbr, visited, des);
                if(res){
                    return true;
                }
            }
        }
        return false;
    }
    public static void display(ArrayList<Edge>[] graph){
        int vtces = graph.length;
        for(int i = 0; i < vtces; i++){
            System.out.print(i + " -> ");
            for(Edge e : graph[i]){
                System.out.print(e.nbr + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vtces = sc.nextInt();
        int edges = sc.nextInt();

        ArrayList<Edge>[] graph = new ArrayList[vtces];

        for(int i = 0; i < vtces; i++){
            graph[i] = new ArrayList<Edge>();
        }

        for(int i = 0; i < edges; i++){
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();
            int wt = sc.nextInt();

            graph[v1].add(new Edge(v1, v2, wt));
            graph[v2].add(new Edge(v2, v1, wt));
        }
        int src = sc.nextInt();
        int des = sc.nextInt();

        display(graph);
        System.out.println(hasPath(graph, src, des));
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
0
6
 */