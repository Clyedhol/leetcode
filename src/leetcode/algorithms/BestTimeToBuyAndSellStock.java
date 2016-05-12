package leetcode.algorithms;

import java.util.ArrayList;
import java.util.List;

public class BestTimeToBuyAndSellStock {

	public static int maxProfit(int[] prices) {
	   int n = prices.length;
       if(n == 0) return 0;
       List<Integer> l = new ArrayList<Integer>();
       for(int i = 0;i<n;i++){
    	   if(!l.contains(prices[i])) l.add(prices[i]);
       }
       int a = 0;
       for(int i = 0;i < l.size();i++){
    	   for(int j = i;j < l.size();j++){
    		   if(l.get(j) > l.get(i)){
    			   int temp = prices[j] - prices[i];
        		   if(temp>a) a = temp;
    		   }
    	   }
       }
       return a;
	}
	
	public static void main(String[] args) {
		int[] i ={1,4,2,1};
		System.out.println(maxProfit(i));
	}
}
