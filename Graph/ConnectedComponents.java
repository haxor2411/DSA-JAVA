package Graph;

import java.util.ArrayList;
import java.util.Scanner;

public class ConnectedComponents {
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

    static ArrayList<ArrayList<Integer>> getComponent(ArrayList<Edge>[] graph){
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        boolean[] visited = new boolean[graph.length];

        for(int i = 0; i < graph.length; i++){
            if(visited[i] == false){
                ArrayList<Integer> ans = new ArrayList<>();
                markNbr(graph, visited, i, ans);
                result.add(ans);
            }
        }

        return result;
    }

    static void markNbr(ArrayList<Edge>[] graph, boolean[] visited, int vtx, ArrayList<Integer> ans){
        visited[vtx] = true;
        ans.add(vtx);

        for(Edge e : graph[vtx]){
            if(visited[e.nbr] == false){
                markNbr(graph, visited, e.nbr, ans);
            } 
        }
    }

    //This  func can be used to check if the fraph is fully connected or every vertex can be reached from each vertex;
    static boolean isGrapgConnected(ArrayList<Edge>[] graph){
        return getComponent(graph).size() == 1;
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

        sc.close();

        display(graph);

        System.out.println(getComponent(graph));

        System.out.println(isGrapgConnected(graph));
    }
}


/*
7
5
0 1 10
2 3 10
4 5 10
5 6 10
4 6 10
*/