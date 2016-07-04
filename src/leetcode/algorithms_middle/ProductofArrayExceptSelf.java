package leetcode.algorithms_middle;

public class ProductofArrayExceptSelf {
	public int[] productExceptSelf(int[] nums) {
        int[] p = new int[nums.length];
        int product = 1;
        for(int i=0;i<p.length;++i){
            p[i] = product;
            product *= nums[i];
        }
        product = 1;
        for(int i=p.length-1;i>=0;--i){
            p[i]*=product;
            product*=nums[i];
        }
        return p;
    }
    
    public static void main(String[] args) {
		ProductofArrayExceptSelf pae = new ProductofArrayExceptSelf();
		int[] nums = {0,0};
		int[] temp = pae.productExceptSelf(nums);
		for(int i : temp){
			System.out.print(i+",");
		}
	}
}
