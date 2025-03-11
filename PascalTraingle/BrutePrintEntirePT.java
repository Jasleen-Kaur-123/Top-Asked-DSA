import java.util.Arrays;
import java.util.ArrayList;
public class Main{
    public static void main(String[] args){
    ArrayList<Integer> ans = new ArrayList<>();
    int n= 5;
    int c= 1;
    }
    public static ArrayList<Integer> printPT(ArrayList<Integer> ans,int n,int c){
        for(int i=0;i<n;i++){
                ArrayList<Integer> temp = new ArrayList<>();
            for(int j=0;j<i;j++){
                temp.add(ncr(n-1,c-1));
            }
            ans.add(temp);
        }
        return ans;
    }
    public static int ncr(int n,int c){
        int res;
        for(int i=0;i<n;i++){
            res = res * (n-i);
            res = res / (i+1);
        }
    }
}