package leetcode.algorithms;
//需要考虑数组长度为0或1的特殊情况，以及数组中没有需要除去的数和全是需要除去的数的情况；
public class RemoveElement {
	public int removeElement(int[] nums, int val) {
        if(nums.length == 0) {return 0;}
        if(nums.length == 1) {return nums[0] == val?0:1;}
        int i = 0,j = nums.length - 1;
		while(i<=j){
			while(nums[i] != val){
				if(i<nums.length - 1)
					i++;
				else
					return i+1;
			}
			while(nums[j] == val){
				if(j>0)
					j--;
				else
					return j;
			}
			if(i<j){
			  int temp = nums[i];
			  nums[i] = nums[j];
			  nums[j] = temp;
			  i++;
			  j--; 
			}
		}
        return i;
    }
}
