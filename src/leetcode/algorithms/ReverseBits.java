package leetcode.algorithms;

public class ReverseBits {
    public int reverseBits(int n) {
    	int m = 0;
    	int l = 0;
    	int returnint = 0;
		m = n & 1;
    	returnint = returnint ^ m;
    	n >>>= 1;
    	l++;
        while(l != 32){
        	m = n & 1;
        	returnint = returnint ^ m;
        	returnint <<= 1;
        	n >>>= 1;
        	l++;
        }
        return returnint;
    }
}
