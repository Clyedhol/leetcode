package leetcode.algorithms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
Given two arrays, write a function to compute their intersection.
Example:
Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2].
*/
public class IntersectionofTwoArrays {
	public int[] intersection(int[] nums1, int[] nums2) {
        if(nums1 == null || nums2 == null) return null;
        Arrays.sort(nums1);
		Arrays.sort(nums2);
		Set<Integer> numsInter = new HashSet<Integer>();
		int i=0,j=0;
		while(i<nums1.length && j<nums2.length){
			if(nums1[i] == nums2[j]){
				numsInter.add(nums1[i]);
				i++;
				j++;
			}else if(nums1[i] < nums2[j]){
				i++;
			}else{
				j++;
			}
		}
        int[] nums = new int[numsInter.size()];
        i = 0;
        for(int s:numsInter){
        	nums[i++] = s;
        }
        return nums;
    }
}
