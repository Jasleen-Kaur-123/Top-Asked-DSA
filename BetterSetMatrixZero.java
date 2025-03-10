public class Main{
    public static void main(String[] args) {
        int[][] matrix = { {1,1,1,1},
                           {1,0,1,1},
                           {1,1,0,1},
                           {1,0,0,1} };
        int rows = matrix.length;
        int columns = matrix[0].length;
        int row[] = new int[rows];
        int col[] = new int[columns];
                for(int i=0;i<rows;i++){
                for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]==0){
                    row[i]=1;
                    col[j]=1;
                }
            }
        }
        convertSetMatrix(matrix,row,col);
        printMatrix();
    }
    public static void convertSetMatrix(){
        for(int i=0;i<matrix.length;i++){
            for(int j =0;j<matrix[i].length;j++){
                if(row[i]||column[j]==1){
                    matrix[i][j]=0;
                }
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        int[][] matrix = { 
            {1, 1, 1, 1},
            {1, 0, 1, 1},
            {1, 1, 0, 1},
            {1, 0, 0, 1} 
        };

        int rows = matrix.length;
        int cols = matrix[0].length; // Assume at least one row exists

        int[] row = new int[rows]; // Stores which rows should be set to 0
        int[] column = new int[cols]; // Stores which columns should be set to 0

        // Step 1: Find zeros and mark rows & columns
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    row[i] = 1;
                    column[j] = 1;
                }
            }
        }

        // Step 2: Modify the matrix based on row[] and column[]
        modifyMatrix(matrix, row, column);

        // Step 3: Print the updated matrix
        printMatrix(matrix);
    }

    // Modify matrix based on marked rows and columns
    public static void modifyMatrix(int[][] matrix, int[] row, int[] column) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (row[i] == 1 || column[j] == 1) { // Fix logical condition
                    matrix[i][j] = 0;
                }
            }
        }
    }

    // Print the matrix
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
