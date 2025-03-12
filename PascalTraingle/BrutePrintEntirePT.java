import java.util.ArrayList;
public class Main{
    public static void main(String[] args){
    int n= 6;
    int c= 1;
    ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
     ans = printPT(ans, n);
        for (ArrayList<Integer> row : ans) {
            System.out.println(row);
        }
    }
    public static ArrayList<ArrayList<Integer>> printPT(ArrayList<ArrayList<Integer>> ans,int n){
        for(int i=0;i<n;i++){
            ArrayList<Integer> temp = new ArrayList<>();
            for(int j=0;j<=i;j++){
                temp.add(ncr(i,j));
            }
            ans.add(temp);
        }
        return ans;
    }
    public static int ncr(int n, int c){
        int res = 1;
        for(int i=0;i<c;i++){
            res = res * (n-i);
            res = res / (i+1);
        }
    return res;
    }
}