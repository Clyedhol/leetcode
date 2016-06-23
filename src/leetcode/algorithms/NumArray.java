package leetcode.algorithms;

//把得到的数字放到类似缓存中去，后面直接提取
public class NumArray{
	int[] table;
	public NumArray(int[] nums) {
	    int sum = 0;
	    table = new int[nums.length + 1];
	    for(int i = 0; i < nums.length; i++)
	    {
	        sum = sum + nums[i];
	        table[i + 1] = sum;
	    }
	}
	public int sumRange(int i, int j) {
	    return table[j + 1] - table[i];
	}
}
