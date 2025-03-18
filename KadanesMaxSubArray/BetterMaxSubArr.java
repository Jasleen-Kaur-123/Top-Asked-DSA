public class Main{
    public static void main(String[] args){
        int arr[] = {5,4,-1,7,8};
        System.out.println(MaxSubArray(arr));
    }
    public static int MaxSubArray(int[] arr){
        int maximum = Integer.MIN_VALUE;
        int n = arr.length;
        for(int i=0;i<n;i++){
            int sum = 0;
            for(int j=0;j<=i;j++){
                sum += arr[j];
                maximum = Math.max(sum,maximum);
            }
        }
        return maximum;
    } 
}