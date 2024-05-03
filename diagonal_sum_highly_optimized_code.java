public class diagonal_sum_highly_optimized_code {
    public static int diagonalSum(int matrix[][]) {
        int sum = 0;
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            sum += matrix[i][i]; // Primary diagonal
            sum += matrix[i][n - i - 1]; // Secondary diagonal
        }
        // Adjust the sum if the middle element is counted twice
        if (n % 2 == 1) {
            sum -= matrix[n / 2][n / 2];
        }
        return sum;
    }

    public static void main(String args[]) {
        int matrix[][] = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        int sum = diagonalSum(matrix);
        System.out.println("Diagonal sum: " + sum);
    }
}
