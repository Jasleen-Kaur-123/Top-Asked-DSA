import java.util.ArrayList;
public class Main{
    public static void main(String[] args){
        int row = 4;
        int N = 6;
         ArrayList<ArrayList<Integer>> triangle = pascalTriangle(N);
        for (ArrayList<Integer> r : triangle) {
            System.out.println(r);
        }
    }
    public static ArrayList<Integer> generateRow(int row){
        int value = 1;
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(1);
        for(int col=1;col<row;col++){
            value = value * (row-col);
            value = value / col;
            ans.add(value);
        }
        return ans;
    }
    public static ArrayList<ArrayList<Integer>> pascalTriangle(int N){
        ArrayList<ArrayList<Integer>> currentAns = new ArrayList<>();
        for(int i=1;i<=N;i++){
            currentAns.add(generateRow(i));
        }
        return currentAns;
    }
}