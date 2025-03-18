public class Main{
    public static void main(String[] args){
        int[][] matrix = { {1,2,3,4},
                           {5,6,7,8},
                           {9,10,11,12},
                           {13,14,15,16} };
        int[][] rotatedMatrix = rotateMatrix(matrix);  // Fix: Capture the returned matrix
        
        // Print rotated matrix
        System.out.println("Rotated Matrix:");
        for (int i = 0; i < rotatedMatrix.length; i++) {
            for (int j = 0; j < rotatedMatrix[i].length; j++) {
                System.out.print(rotatedMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int[][] rotateMatrix(int[][] matrix){
        int n = matrix.length;
        int[][] ans = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                ans[j][n-1-i]=matrix[i][j];
            }
        }
        return ans;
    }
}