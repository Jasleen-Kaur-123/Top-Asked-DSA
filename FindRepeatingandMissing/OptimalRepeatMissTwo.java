import java.util.ArrayList;
import java.util.*;
public class Main{
    public static void main(String[] main){
    ArrayList<Integer> list = new ArrayList<>(Arrays.asList(4,6,2,3,1,1));
    System.out.println("Repeating and Missing values : "+repeatMissing(list));
    }
    public static ArrayList<Integer> repeatMissing(List<Integer> A){
    int n = A.size();
    int xr= 0;
    for(int i=0;i<n;i++){
        xr ^= A.get(i);
    }
    for(int i=1;i<=n;i++){
        xr ^= i;
    }
    int number = xr & ~(xr-1);
    int one = 0; 
    int zero = 0;
    for(int i=0;i<n;i++){
        if((A.get(i) & number) != 0){
            one ^= A.get(i);
        }
        else{
            zero ^= A.get(i);
        }
    } 
    for(int i=1;i<=n;i++){
        if((i & number) != 0){
            one ^= i;
        }
        else{
            zero ^= i;
        }
    }
    int count = 0;
    for(int i=0;i<n;i++){
        if(A.get(i) == zero) count++;
    }
    if(count==2) return new ArrayList<>(Arrays.asList(zero,one));
    return new ArrayList<>(Arrays.asList(one,zero));
    }
}