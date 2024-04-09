package RecursionArray;

import java.util.Scanner;

public class PrintMazePathWithJump {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nr = sc.nextInt();
        int nc = sc.nextInt();
        printMazePathWithJump(0, 0, nr - 1, nc - 1, "");
    } 
    public static void printMazePathWithJump(int sr, int sc, int dr, int dc, String path){
        if(sr == dr && sc == dc){
            System.out.println(path);
            return;
        }
        for(int jump = 1; sc + jump <= dc; jump++){
            printMazePathWithJump(sr, sc + jump, dr, dc, path + 'h' + jump);
        }
        for(int jump = 1; sr + jump <= dr; jump++){
            printMazePathWithJump(sr + jump, sc, dr, dc, path + 'v' + jump);
        }
        for(int jump = 1; sc + jump <= dc && sr + jump <= dr; jump++){
            printMazePathWithJump(sr + jump, sc + jump, dr, dc, path + 'd' + jump);
        }

    }
}
