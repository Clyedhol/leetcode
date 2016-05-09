package leetcode.algorithms;

public class PowerOfThree {
	public boolean isPowerOfThree(int n) {
        if(n == 1||n == 3){return true;}
        if(n == 0){return false;}
        double rs = Math.log10(n)/Math.log10(3);
        if(rs == Math.floor(rs)){return true;}
        return false;
   }
}
