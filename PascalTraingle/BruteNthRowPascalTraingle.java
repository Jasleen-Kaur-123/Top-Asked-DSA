public class Main{
    public static void main(String[] args){
       int n = 6; 
       int c = 5;
       printNthRow(n,c);
    }
    public static void printNthRow(int n,int c){
        for(int i=0;i<n;i++){
            System.out.println(ncr(n-1,c-i)); //
        }
    }
    public static int ncr(int n,int c){
        int res=1;
        for(int i=0;i<c;i++){
            res=res*(n-i);
            res=res/(i+1);
        }
        return res;
    }
}