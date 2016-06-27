package leetcode.algorithms;

public class RotateArray {
    public void rotate(int[] nums, int k) {
        k = k%nums.length;
        int[] in = new int[nums.length];
        for(int i = 0;i<nums.length;i++){
        	in[(i+k)%nums.length] = nums[i];
        }
        for(int i = 0;i<nums.length;i++){
        	nums[i] = in[i];
        }
    }
}
