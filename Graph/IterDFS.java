package Graph;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class IterDFS {
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

    static class Pair{
        int vtx;
        String path;

        Pair(int vtx, String path){
            this.vtx = vtx;
            this.path = path;
        }
    }
    static void DFS(ArrayList<Edge>[] graph, int vtx){
        Stack<Pair> stack = new Stack<>();
        boolean[] visited = new boolean[graph.length];

        stack.push(new Pair(vtx, vtx+""));

        while(!stack.isEmpty()){
            Pair top = stack.pop();

            if(visited[top.vtx] == false){
                visited[top.vtx] = true;
                System.out.println(top.vtx + "@" + top.path);
            }

            for(Edge e : graph[top.vtx]){
                if(visited[e.nbr] == false){
                    stack.push(new Pair(e.nbr, top.path + e.nbr));
                }
            }
        }
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

        sc.close();

        // display(graph);

        DFS(graph, src);
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
2
 */
