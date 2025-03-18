public class Main{
    public static void main(String[] args){
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
    public static int maxProfit(int[] prices){
        int minimum = prices[0];
        int maxProfit = 0;
        int n = prices.length;
        for(int i=1;i<n;i++){
            int cost = prices[i] - minimum;
            maxProfit = Math.max(maxProfit,cost);
            minimum = Math.min(minimum,prices[i]);
        }
        return maxProfit;
    }
}