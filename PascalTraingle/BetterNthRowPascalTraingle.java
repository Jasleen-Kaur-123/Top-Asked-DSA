public class Main{
    public static void main(String[] args){
        int row = 4;
        int first = 1;
        System.out.print(first+" ");
        for(int i=1;i<row;i++){
            first = first * (row-i);
            first = first / i;
        System.out.print(" "+first+" ");
        }
    }
}