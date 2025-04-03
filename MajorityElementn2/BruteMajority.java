public class Main{
    public static void main(String[] args){
    int arr[] = {1,1,1,1,3,2,2}; 
    int n = arr.length;
    for(int i=0;i<n;i++){ 
        int cnt = 0;
        for(int j=0;j<n;j++){ 
            if(arr[j]==arr[i]){
                cnt++;
                }
            }
            if(cnt>(n/2)){ 
            System.out.println(arr[i]+":"+cnt);
            break;
            }
            else{
            System.out.println("-1");
            break;
            }
        }
    }
}