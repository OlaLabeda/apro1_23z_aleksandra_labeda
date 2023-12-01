package lab9;

public class MatricesTest {
    public static void main(String[] args) {
        int firstRowSum = 4;
        int secondRowSum = 2;
        int[] columnSum = {1, 2, 1, 1, 1};

        int[][] result = Matrices.reconstructMatrix(firstRowSum, secondRowSum, columnSum);

        if (result.length > 0) {
            System.out.println("Solution:");
            Matrices.printMatrix(result);
        } else {
            System.out.println("No solution.");
        }
    }
}
