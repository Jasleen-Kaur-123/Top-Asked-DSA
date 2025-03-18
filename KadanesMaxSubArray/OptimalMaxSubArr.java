public class Main{
    public static void main(String[] args){
        int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(MaxSubArray(arr));
    }
    public static int MaxSubArray(int[] arr){
        int maximum = Integer.MIN_VALUE;
        int n = arr.length;
        int sum = 0;
        for(int i=0;i<n;i++){
            sum +=arr[i];
            if(sum>maximum){
                maximum=sum;
            }
            if(sum<0){
                sum=0;
            }
        }
        return maximum;
    }
}