public class Main{
    public static void main(String[] args){
    int[] arr = {3,7,-5,1};
    System.out.println(MaxSubArray(arr));
    }
    public static int MaxSubArray(int[] arr){
    int maximum = Integer.MIN_VALUE;
    int n = arr.length;
    for(int i=0;i<n;i++){
        for(int j=i;j<n;j++){
            int sum = 0;
            for(int k=i;k<=j;k++){
                sum += arr[k];
                maximum = Math.max(sum,maximum);
            }
        }
    }
    return maximum;
  }
}