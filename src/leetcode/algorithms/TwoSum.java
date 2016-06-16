package leetcode.algorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TwoSum {
	public int[] twoSum(int[] nums, int target) {
		int[] result = new int[2];
		Set<Integer> existenceSet = new HashSet<Integer>();
		for(int i = 0;i<nums.length-1;i++){
			if(existenceSet.add(nums[i])){
				for(int j = i+1;j<nums.length;j++){
					if((nums[i] + nums[j]) == target){
						result[0] = i;
						result[1] = j;
						return result;
					}
				}
			}
		}
		return  result;
    }
	
	public int[] twoSum2(int[] nums, int target) {
		int[] result = new int[2];
		List<Mapfor> xulie = new ArrayList<Mapfor>();
		for(int i = 0;i<nums.length;i++){
			Mapfor mf = new Mapfor(i,nums[i]);
			xulie.add(mf);
		}
		Collections.sort(xulie,new Comparator<Mapfor>() {
			@Override
			public int compare(Mapfor o1, Mapfor o2) {
				if(o1.j > o2.j) return 1;
				if(o1.j < o2.j) return -1;
				return 0;
			}
		});
		for(int i = 0;i< nums.length-1;i++){
			for(int j = i+1;j < nums.length;j++){
				if((xulie.get(i).j+xulie.get(j).j) == target){
					result[0] = xulie.get(i).i;
					result[1] = xulie.get(j).i;
					return result;
				}else if((xulie.get(i).j+xulie.get(j).j) > target){
					break;
				}
			}
		}
		return result;
    }
	
	class Mapfor{
		public final int i;
		public final int j;
		public Mapfor(int i,int j){
			this.i = i;
			this.j = j;
		}
	}
	
	
}
