package Companies.Capgemini;

public class P5 {
    public static void main(String[] args) {
        int m = 3;
        int n = 4;

        int[][] matrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        int totalElem = m * n;
        int rmin = 0, rmax = m - 1, cmin = 0, cmax = n - 1;
        int count = 0;

        while (count < totalElem) {
            // Traverse from left to right
            for (int col = cmin; col <= cmax && count < totalElem; col++) {
                System.out.print(matrix[rmin][col] + " ");
                count++;
            }
            rmin++; // Move the top boundary down

            // Traverse from top to bottom
            for (int row = rmin; row <= rmax && count < totalElem; row++) {
                System.out.print(matrix[row][cmax] + " ");
                count++;
            }
            cmax--; // Move the right boundary left

            // Traverse from right to left
            for (int col = cmax; col >= cmin && count < totalElem; col--) {
                System.out.print(matrix[rmax][col] + " ");
                count++;
            }
            rmax--; // Move the bottom boundary up

            // Traverse from bottom to top
            for (int row = rmax; row >= rmin && count < totalElem; row--) {
                System.out.print(matrix[row][cmin] + " ");
                count++;
            }
            cmin++; // Move the left boundary right
        }
    }
}
