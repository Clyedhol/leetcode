package leetcode.algorithms;

public class SingleNumber {
    public int singleNumber(int[] nums) {
    	int max = 0;
    	int min = 0;
    	for(int i = 0;i<nums.length;i++){
    		if(max < nums[i]) max = nums[i];
    		if(min > nums[i]) min = nums[i];
    	}
    	int[] temp = new int[max-min+1]; 
    	for(int i = 0;i<nums.length;i++){
    		temp[nums[i]-min]++;
    	}
        for(int i = 0;i<temp.length;i++){
        	if(temp[i] == 1) return i;
        }
        return 0;
    }
    
    //用异或，方法简直逆天，因为相同数字异或得到的一定为0；
    public int singleNumber1(int[] nums){
    	int reverse = 0;
    	for(int i = 0;i<nums.length;i++){
    		reverse = reverse ^ nums[i];
    	}
    	return reverse;
    }
    
    public static void main(String[] args) {
		SingleNumber sn = new SingleNumber();
		int[] i = {-1,1,1,9,9};
		System.out.println(sn.singleNumber1(i));
	}
}
