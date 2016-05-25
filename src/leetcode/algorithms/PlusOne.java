package leetcode.algorithms;

public class PlusOne {
	public int[] plusOne(int[] digits) {
		int size = digits.length;
		int i = size - 1;
		while(i != 0){
			if(digits[i] < 9){
				digits[i] = digits[i] + 1;
				return digits;
			}else{
				digits[i] = 0;
				i--;
			}
		}
		if(digits[i] == 9){
			int[] digitsChage = new int[size+1];
			digitsChage[0] = 1;
			return digitsChage;
		}else{
			digits[i] = digits[i] + 1;
			return digits;
		}
    }
}
