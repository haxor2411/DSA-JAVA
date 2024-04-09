package RecursionArray;

import java.util.Scanner;

public class PrintMazePath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nr = sc.nextInt();
        int nc = sc.nextInt();
        printMazePath(0, 0, nr - 1, nc - 1, "");
    }
    public static void printMazePath(int sr, int sc, int dr, int dc, String asf){
        if(sr == dr && sc == dc){
            System.out.println(asf);
            return;
        }
        if(sr > dr || sc >dc){
            return;
        }
        // if(sc + 1 <= dc){
        //     printMazePath(sr, sc + 1, dr, dc, 'h' + asf);
        // }
        // if(sr + 1 <= dr){
        //     printMazePath(sr + 1, sc, dr, dc, 'v' + asf);
        // }

        //OR

        
        printMazePath(sr, sc + 1, dr, dc, asf + 'h');
        printMazePath(sr + 1, sc, dr, dc, asf + 'v');
    }
}
