public class Main{
    public static void main(String[] args) {
        int[][] matrix = { {1,1,1,1} , 
                           {1,0,0,1} ,
                           {1,1,0,1} ,
                           {1,1,1,1} };
            for(int i=0;i<matrix.length;i++){
                for(int j=0;j<matrix[i].length;j++){
                    if(matrix[i][j] == 0){
                        markRow(matrix,i);
                        markCol(matrix,j);
                    }
                }
            }
            printMatrix(matrix);
    }
    public static void markRow(int[][] matrix,int i){ //Mark the entire row with -1
        for(int k=0;k<matrix[i].length;k++){ //loop through columns
            if(matrix[i][k] != 0){
                matrix[i][k] = -1;
            }
        }
    }
    public static void markCol(int[][] matrix,int j){ //Mark the entire column with -1 
        for(int k=0;k<matrix[j].length;k++){ //loop through rows 
            if(j < matrix[k].length && matrix[k][j] != 0){ //check bounds for jagged array
                matrix[k][j] = -1;
            }
        }
    }
    public static void printMatrix(int[][] matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]==-1){
                    matrix[i][j]=0;
                }
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}