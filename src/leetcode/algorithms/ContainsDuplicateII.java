package leetcode.algorithms;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicateII {
	public boolean containsNearbyDuplicate(int[] nums, int k) {
		if(nums.length <= k){
			for(int i = 0;i < nums.length;i++){
				Set<Integer> si = new HashSet<Integer>();
				if(!si.add(nums[i])) return true;
			}
		}
		for(int i = 0;i < nums.length-k;i++){
			Set<Integer> si = new HashSet<Integer>();
			for(int j = i;j < i+k+1;j++){
				if(!si.add(nums[j])) return true;
			}
		}
        return false;
    }
}
