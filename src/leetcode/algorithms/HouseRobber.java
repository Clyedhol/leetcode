package leetcode.algorithms;

public class HouseRobber {
	//就对比每一步拿还是不拿，哪种多然后刷新最大总量
	public int rob(int[] nums) {
        int take = 0;
        int maxProfit = 0; 
        int nonTake = 0; 
        for(int i = 0 ; i < nums.length; ++i){
            take = nonTake + nums[i]; 
            nonTake = maxProfit; 
            maxProfit = Math.max(take,nonTake);
        }
        return maxProfit;
    }
}
