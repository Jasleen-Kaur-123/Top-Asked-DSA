public class Main{
    public static void main(String[] args) {
        int[][] matrix = { {1,1,1,1},
                           {1,0,1,1},
                           {1,1,0,1},
                           {1,0,0,1} };
        int n = matrix.length;
        int m = matrix[0].length;
        int[] row = new int[n];
        int[] col = new int[m];
        for(int i=0;i<n;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]==0){
                    row[i]=1;
                    col[j]=1;
                }
            }
        }
        convertRowCol(matrix, row, col);
        printMatrix(matrix);
    }
    public static void convertRowCol(int[][] matrix,int[] row,int[] col){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(row[i]==1||col[j]==1){
                    matrix[i][j]=0;
                }
            }
        }
    }
    public static void printMatrix(int[][] matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
