package leetcode.algorithms_middle;

public class CountNumberswithUniqueDigits {
    public int countNumbersWithUniqueDigits(int n) {
    	if(n == 0) return 1;
     	int sum = 10;
    	for(int i = 2;i<n+1&&i<11;i++){//i为位数
    		int base = 9;
    		for(int j = 0;j<i-1;j++){//9-j表示乘数，根据排列组合的逻辑
    			base = base*(9-j);
    		}
    		sum = sum + base;
    	}
        return sum;
    }
}
