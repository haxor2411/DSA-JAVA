package Graph;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Scanner;

public class InfectionSpread {
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
            for(Edge e : list)  System.out.print(e.nbr + " ");
            System.out.println();
        }
    }

    public static class Pair{
        int vtx, timeOfArrival;

        Pair(int vtx, int toi){
            this.vtx = vtx;
            this.timeOfArrival = toi;
        }
    }

    static int noOfInfected(ArrayList<Edge>[] graph, int infectedSrc, int responseTime){
        int count = 0;
        int vtces = graph.length;

        boolean[] visited = new boolean[vtces];
        Queue<Pair> queue = new ArrayDeque<>();

        queue.add(new Pair(infectedSrc, 1));

        while(!queue.isEmpty()){
            Pair front = queue.remove();

            if(visited[front.vtx] == false){
                visited[front.vtx] = true;
                if(front.timeOfArrival <= responseTime) count++;
                else return count;

                for(Edge e : graph[front.vtx]) if(visited[e.nbr] == false) queue.add(new Pair(e.nbr, front.timeOfArrival + 1));
            }
        }

        return count;
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

        int infectedSrc = sc.nextInt();
        int responseTime = sc.nextInt();

        sc.close();

        display(graph);

        System.out.println(noOfInfected(graph, infectedSrc, responseTime));
    }
}


/*
7
8
0 1
1 2
2 3
0 3
3 4
4 5
5 6
4 6
6
3
 */