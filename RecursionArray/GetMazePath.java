package RecursionArray;

import java.util.ArrayList;
import java.util.Scanner;

public class GetMazePath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nr = sc.nextInt();
        int nc = sc.nextInt();
        ArrayList<String> path = getMazePath(0, 0, nr - 1, nc - 1);
        System.out.println(path);
    }
    public static ArrayList<String> getMazePath(int sr, int sc, int dr, int dc){
        if(sr == dr && sc == dc){
            ArrayList<String> res = new ArrayList<>();
            res.add("");
            return res;
        }
        ArrayList<String> myPath = new ArrayList<>();
        if(sc + 1 <= dc){
            ArrayList<String> hpath = getMazePath(sr, sc + 1, dr, dc);
            for(String path : hpath){
                myPath.add('h' + path);
            }
        }
        if(sr + 1 <= dr){
            ArrayList<String> vpath = getMazePath(sr + 1, sc, dr, dc);
            for(String path : vpath){
                myPath.add('v' + path);
            }
        }
        return myPath;
    }
}
