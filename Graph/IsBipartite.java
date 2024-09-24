package Graph;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Queue;
import java.util.Scanner;

public class IsBipartite {
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

    public static class Pair{
        int vtx, level;

        Pair(int vtx, int level){
            this.vtx = vtx;
            this.level = level;
        }
    }

    static boolean isBipartite(ArrayList<Edge>[] graph){
        int vtces = graph.length;
        int[] visited = new int[vtces];
        Arrays.fill(visited, -1);
        for(int i = 0; i < vtces; i++){
            if(visited[i] == -1){
                boolean res = isBipartiteHelper(graph, visited, i);
                if(!res) return false;
            }
        }
        return true;
    }

    static boolean isBipartiteHelper(ArrayList<Edge>[] graph, int[] visited, int vtx){

        Queue<Pair> queue = new ArrayDeque<>();
        queue.add(new Pair(vtx, 0));

        while(!queue.isEmpty()){
            Pair front = queue.remove();

            if(visited[front.vtx] == -1){
                visited[front.vtx] = front.level;
                for(Edge e : graph[front.vtx]){
                    if(visited[e.nbr] == -1){
                        queue.add(new Pair(e.nbr, front.level + 1));
                    }
                }    
            }
            else if(visited[front.vtx] != front.level){
                return false;
            }
        }

        return true;
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

        System.out.println(isBipartite(graph));
    }
}

/*

 */