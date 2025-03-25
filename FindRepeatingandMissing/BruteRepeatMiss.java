import java.util.*;
public class Main{
    public static void main(String[] args){
    ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,0));
    System.out.println("Repeating and Missing values :"+repeatMissing(list));
    }
    public static ArrayList<Integer> repeatMissing(List<Integer> A){
    int n = A.size();
    int[] hash = new int[n+1];
    for(int i=0;i<n;i++){
        hash[A.get(i)]++;
    }
    int repeating = -1;
    int missing = -1;
    for(int i=1;i<=n;i++){ // 
        if(hash[i]==2) repeating = i;
        else if(hash[i]==0) missing = i;
        if(repeating != -1 && missing != -1){
            break;
        }
    }
    return new ArrayList<>(Arrays.asList(repeating,missing)) ;
    }
}