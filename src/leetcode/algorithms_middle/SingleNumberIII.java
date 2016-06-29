package leetcode.algorithms_middle;

import java.util.HashMap;
import java.util.Map;

public class SingleNumberIII {
    public int[] singleNumber(int[] nums) {
    	Map<Integer,Integer> map = new HashMap<Integer,Integer>();
    	for(int i = 0;i<nums.length;i++){
    		if(map.get(nums[i]) == null) map.put(nums[i], 1);
    		else map.remove(nums[i]);
    	}
    	int[] temp = new int[2];
    	int j = 0;
    	for(int key : map.keySet()){
    		temp[j++] = key;
    	}
        return temp;
    }
    public static void main(String[] args) {
		SingleNumberIII sn = new SingleNumberIII();
		int[] nums = {1,2,1,3,2,5};
		int[] temp = sn.singleNumber(nums);
		for(int i : temp){
			System.out.println(i);
		}
	}
}
