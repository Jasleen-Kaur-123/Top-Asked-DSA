import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Main{
    public static void main(String[] args){
    ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,1,3));
    System.out.println("Repeating and Missing values : "+repeatMissing(list));
    }
    public static ArrayList<Integer> repeatMissing(List<Integer> list){
    int n = list.size();
    // S - SN => sum of my natural number
    // S2 - SN2 => sum of sqaure of N Natural number
    long SN = n * (n+1) / 2;
    long S2N = (long) n * (n+1) * (2*n+1) / 6;
    long S = 0;
    long S2 = 0;
    for(int i=0;i<n;i++){
        S += list.get(i);
        S2 += list.get(i) * list.get(i);
    }
    long val1 = S - SN ; //x-y
    long val2 = S2 - S2N ; 
    val2 = val2 / val1; //x+y
    long x = (val1+val2) / 2;
    long y = x - val1;
    return new ArrayList<>(Arrays.asList((int) x,(int) y));
    }
}