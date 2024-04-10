package RecursionArray;

import java.util.Scanner;

public class FloodFill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nr = sc.nextInt();
        int nc = sc.nextInt();
        int[][] maze = new int[nr][nc];
        for (int row = 0; row < nr; row++) {
            for (int col = 0; col < nc; col++) {
                maze[row][col] = sc.nextInt();
            }
        }
        printPath(0, 0, nr - 1, nc - 1, new boolean[nr][nc], "", maze);
    }

    public static void printPath(int sr, int sc, int dr, int dc, boolean[][] visited, String path, int[][] maze) {
        if (sr == dr && sc == dc) {
            System.out.println(path);
            return;
        }
        if (sr > dr || sc > dc ||sr < 0 || sc < 0 || visited[sr][sc] == true || maze[sr][sc] == 1) {
            return;
        }
    
        visited[sr][sc] = true;
        printPath(sr - 1, sc, dr, dc, visited, 't' + path, maze); // top
        printPath(sr, sc - 1, dr, dc, visited, 'l' + path, maze); // left
        printPath(sr + 1, sc, dr, dc, visited, 'd' + path, maze); // down
        printPath(sr, sc + 1, dr, dc, visited, 'r' + path, maze); // right
        visited[sc][dc] = false;
    }
}
