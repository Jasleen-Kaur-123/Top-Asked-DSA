public class Main{
    public static void main(String[] args){
        int n = 6;
        int r = 5;
        System.out.println(ncr(n-1,r-1));
    }
    public static int ncr(int n,int r){
        int res = 1;
        for(int i=0;i<r;i++){
            res = res*(n-i);
            res = res/(i+1);
        }
        return res;
    }
}