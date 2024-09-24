package Graph;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class PrimsAlgo {
    public static class Edge{
        int src, nbr, wt;

        Edge(int src, int nbr, int wt){
            this.src = src;
            this.nbr = nbr;
            this.wt = wt;
        }
    }

    public static class Pair implements Comparable<Pair>{
        int curr_vtx, parent_vtx, wt;

        public int compareTo(Pair other){
            return this.wt - other.wt;
        }

        Pair(int i, int j, int k){
            this.curr_vtx = i;
            this.parent_vtx = j;
            this.wt = k;
        }
    }

    static void prims(ArrayList<Edge>[] graph){
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(0, -1, 0));

        boolean[] visited = new boolean[graph.length];

        while(!pq.isEmpty()){
            Pair front = pq.poll();

            if(visited[front.curr_vtx] == false){
                visited[front.curr_vtx] = true;

                if(front.parent_vtx != -1) System.out.println(front.curr_vtx + "-" + front.parent_vtx + "@" + front.wt);
                
                for(Edge e : graph[front.curr_vtx]){
                    if(visited[e.nbr] == false){
                        pq.add(new Pair(e.nbr, front.curr_vtx, e.wt));
                    }
                }
            }
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

        prims(graph);
    }
}

/*
7
8
0 1 10
1 2 10
2 3 10
0 3 40
3 4 2
4 5 3
5 6 3
4 6 8
 */