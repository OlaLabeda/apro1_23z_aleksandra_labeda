package lab9;

/**
 * @author Aleksandra Łabęda
 */
public class Matrices {
    /**
     *
     * @return
     * a function returning reconstructed matrix
     */
        public static int[][] reconstructMatrix(int firstRowSum, int secondRowSum, int[] columnSum) {
            int c = columnSum.length;
            //create a new matrix to fill of number of columns = c and 2 rows
            int[][] matrix = new int[2][c];

            //iterating over columns of a matrix:
            for (int i = 0; i < c; i++) {
                //if a sum in a particular column is equal to 2
                //that means both rows need to be filled with one
                if (columnSum[i] == 2) {
                    matrix[0][i] = 1;
                    matrix[1][i] = 1;
                    firstRowSum--;
                    secondRowSum--;
                } // if first rown has bigger sum im picking  the bigger one to fill with one
                else if (firstRowSum > secondRowSum) {
                    matrix[0][i] = 1;
                    firstRowSum--;
                }
                //otherwise im choosing second row and decreading sum from row
                else {
                    matrix[1][i] = 1;
                    secondRowSum--;
                }
            }
            // if sum of both rows is zero that means i used all possible values and
            //i can return recieved matrix
            if (firstRowSum == 0 && secondRowSum == 0) {
                return matrix;
            }
            //returning empty matrix if couldnt fill the matrix properly
            return new int[0][0];
        }

    /**
     *
     * @param matrix
     * function for printing a given matrix
     */
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
