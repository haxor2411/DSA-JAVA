package Graph;

import java.util.ArrayList;
import java.util.Scanner;

public class Hamiltonian {
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

    static void DFS(ArrayList<Edge>[] graph, int src){
        int vtces = graph.length;
        boolean[] visited = new boolean[vtces];
        hamiltonian(graph, src, visited, "" + src, 1, src);
    }

    static void hamiltonian(ArrayList<Edge>[] graph, int vtx, boolean[] visited, String path, int alreadyVisited, int osrc){
        visited[vtx] = true;

        if(alreadyVisited == graph.length){
            boolean directEdge = false;
            for(Edge e : graph[vtx]){
                if(e.nbr == osrc){
                    directEdge = true;
                    break;
                }
            }

            if(directEdge) System.out.println("Hamiltonian Cycle: " + path);
            else System.out.println("Hamiltonian Path: " + path);
        }

        for(Edge e : graph[vtx]){
            if(visited[e.nbr] == false){
                hamiltonian(graph, e.nbr, visited, path + e.nbr, alreadyVisited + 1, osrc);
            }
        }

        visited[vtx] = false;
    }

    // this code ensure only the path with all nodes present
    // static int visitedNodes(boolean[] visited){
    //     int count = 0;
    //     for(int i = 0; i < visited.length; i++) if(visited[i] == true) count++;
    //     return count;
    // }

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

        display(graph);

        DFS(graph, src);
    }
}

/*
7
9
0 1 10
1 2 10
2 3 10
0 3 10
3 4 10
4 5 10
5 6 10
4 6 10
2 5 10
0
 */