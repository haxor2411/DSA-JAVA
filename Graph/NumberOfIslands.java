package Graph;

public class NumberOfIslands {

    static int noOfIslands(int[][] board){
        int count = 0;
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                if(board[i][j] == 0){
                    count++;
                    helper(board, i, j);
                }
            }
        }
        return count;
    }

    static void helper(int[][] board, int i, int j){
        if(i < 0 || i > board.length - 1 || j < 0 || j > board.length - 1) return;
        if(board[i][j] == 2 || board[i][j] == 1) return;

        board[i][j] = 2;

        helper(board, i + 1, j);
        helper(board, i - 1, j);
        helper(board, i, j + 1);
        helper(board, i, j - 1);
    }
    public static void main(String[] args) {
        int[][] board = {{0,0,1,1,1,1,1,1},{0,0,1,1,1,1,1,1},{1,1,1,1,1,1,1,0},{1,1,0,0,0,1,1,0},{1,1,1,1,0,1,1,0},{1,1,1,1,0,1,1,0},{1,1,1,1,1,1,1,0},{1,1,1,1,1,1,1,0}};
        System.out.println(board.length + " " + board[0].length);

        System.out.println(noOfIslands(board));
    }
}
