public class Main{
    public static void main(String[] args){
        int n = 6; 
        printRow(n);
    }
    public static void printRow(int n){
        int ans = 1;
        System.out.println(ans);
        for(int i=1;i<n;i++){ 
            ans = ans * (n-i);
            ans = ans / i;
            System.out.println(ans);
        }
    }
}