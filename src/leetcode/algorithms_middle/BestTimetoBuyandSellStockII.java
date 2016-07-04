package leetcode.algorithms_middle;

public class BestTimetoBuyandSellStockII {
    public int maxProfit(int[] prices) {
        int profitall = 0;
        int n = prices.length;
        if(n == 0) return 0;
        int min = prices[0];
        for (int i = 1; i < n; i++) {
           if(prices[i]>min){
        	   profitall+= prices[i] - min;
        	   min = prices[i];
           }else{
        	   min = prices[i];
           }
        }
        return profitall;
	}
}
