public class Main{
    public static void main(String[] args){
        int[][] matrix ={ {1,1,1,1},
                          {1,0,1,1},
                          {1,1,0,1},
                          {0,1,1,1} };
        int n = matrix.length;
        int m = matrix[0].length;
        int col0 = 1;
        for(int i=0;i<n;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]==0){
                    matrix[i][0]=0; //mark for i-th row
                    if(j!=0){       //mark for j-th col
                        matrix[0][j]=0; 
                    }
                    else{
                        col0=0;
                    }
                }
            }
        } 
        markingMatrix(matrix);
        markingUpperRowMatrix(matrix, m);
        markingUpperColMatrix(matrix, n, col0);
        printMatrix(matrix);
    }
    public static void markingMatrix(int[][] matrix){
        for(int i=1;i<matrix.length;i++){
            for(int j=1;j<matrix[i].length;j++){
                if(matrix[i][j]!=0){
                    if(matrix[i][0]==0||matrix[0][j]==0){
                        matrix[i][j]=0;
                    }
                }
            }
        }
    }
    public static void markingUpperRowMatrix(int[][] matrix,int m){
        if(matrix[0][0]==0){
            for(int j=0;j<m;j++){
                matrix[0][j]=0;
            }
        }
    }
    public static void markingUpperColMatrix(int[][] matrix,int n,int col0){
        if(col0==0){
            for(int i=0;i<n;i++){
                matrix[i][0]=0;
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