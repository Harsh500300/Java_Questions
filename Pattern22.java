public class Pattern22 {
    public static void main(String[] args) {
        int n = 11; // Size of the pattern
        int[][] pattern = new int[n][n]; // 2D array to hold the pattern

        // Fill the pattern array
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Calculate the minimum distance from the current cell to any border
                int minDistance = Math.min(Math.min(i, j), Math.min(n - 1 - i, n - 1 - j));
                pattern[i][j] = n / 2 + 1 - minDistance;
            }
        }

        // Print the pattern
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(pattern[i][j] + " ");
            }
            System.out.println();
        }
    }
}
