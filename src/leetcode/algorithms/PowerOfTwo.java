package leetcode.algorithms;
//考虑大于int范围的数字
public class PowerOfTwo {
	public static boolean isPowerOfTwo(int n) {
		if(n < 1){return false;}
		int a = 0;
        while(n !=0 ){
        	if((n&1) == 1){a++;}
        	if(a > 1){return false;}
        	n>>>=1;
        }
        return true;
    }
	
	public static void main(String[] args) {
		isPowerOfTwo(-16);
	}
}
