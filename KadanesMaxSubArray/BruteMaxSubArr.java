public class Main{
    public static void main(String[] args){
    int[] arr = {3,7,-5,1};
    }
    public static void MaxSubArray(int[] arr){
    int maximum = Integer.MIN_VALUE;
    int n = arr.length;
    for(int i=0;i<=n;i++){
        for(int j=i;j<n;j++){
            int sum = 0;
            for(int k=i;k<=j;k++){
                sum += arr[k];
                maximum = max(sum,maximum);
            }
        }
    }
  }
}