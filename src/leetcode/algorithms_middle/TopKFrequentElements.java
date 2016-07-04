package leetcode.algorithms_middle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TopKFrequentElements {
    public List<Integer> topKFrequent(int[] nums, int k) {
        List<Integer> li = new ArrayList<Integer>();
        List<num2many> map = new ArrayList<num2many>();
        Arrays.sort(nums);
        int i = 1;
        int temp = nums[0];
        int many = 1;
        while(i<nums.length){
        	if(temp == nums[i]) many++;
        	else{
        		num2many nm = new num2many(temp,many);
        		map.add(nm);
        		temp = nums[i];
        		many = 1;
        	}
        	i++;
        }
        num2many nm = new num2many(temp,many);
		map.add(nm);
		Collections.sort(map, new Comparator<num2many>(){
			@Override
			public int compare(num2many arg0, num2many arg1) {
				if(arg0.many < arg1.many) return 1;
				if(arg0.many > arg1.many) return -1;
				return 0;
			}
		});
		for(int j = 0;j<k;j++){
			li.add(map.get(j).num);
		}
        return li;
    }
    
    class num2many{
    	int num;
    	int many;
    	public num2many(int num,int many){
    		this.num = num;
    		this.many = many;
    	}
    }
    
}
