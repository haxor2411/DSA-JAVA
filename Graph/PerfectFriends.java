package Graph;

import java.util.ArrayList;
import java.util.Scanner;

// No of ways to select 2 students such that they don't belong to same club.
public class PerfectFriends {
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

    static ArrayList<ArrayList<Integer>> getComponents(ArrayList<Edge>[] graph){
        int vtces = graph.length;
        boolean[] visited = new boolean[vtces];
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        for(int vtx = 0; vtx < vtces; vtx++){
            if(visited[vtx] == false){
                ArrayList<Integer> elem = new ArrayList<>();
                getElem(graph, visited, vtx, elem);
                result.add(elem);
            }
        }

        return result;
    }

    static void getElem(ArrayList<Edge>[] graph, boolean[] visited, int vtx, ArrayList<Integer> elem){
        visited[vtx] = true;
        elem.add(vtx);

        for(Edge e : graph[vtx]){
            if(visited[e.nbr] == false ) getElem(graph, visited, e.nbr, elem);
        }
    }

    static int perfectFriends(ArrayList<Edge>[] graph){
        int ways = 0;
        ArrayList<ArrayList<Integer>> components = getComponents(graph);

        for(int i = 0; i < components.size(); i++){
            for(int j = i + 1; j < components.size(); j++){
                ways += (components.get(i).size() * components.get(j).size());
            }
        }

        return ways;
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

        System.out.println(getComponents(graph));
        System.out.println(perfectFriends(graph));
    }
}

/*
7
5
0 1
2 3
4 5
5 6
4 6
 */