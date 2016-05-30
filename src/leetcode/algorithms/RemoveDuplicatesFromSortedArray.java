package leetcode.algorithms;
//用两个指针进行比较
public class RemoveDuplicatesFromSortedArray {
	public int removeDuplicates(int[] nums) {
		int length = nums.length;
		if(length == 0 || length == 1) return length;
		int now = 0,next = 1,tail = length - 1;
		while(next<length){
			if(nums[now] == nums[next]){
				if(nums[next] == nums[tail]) break;
			}else{
				nums[++now] = nums[next];
			}
			next++;
		}
        return now+1;
    }
}
