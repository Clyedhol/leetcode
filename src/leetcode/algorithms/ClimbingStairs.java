package leetcode.algorithms;

public class ClimbingStairs {
	public int climbStairs(int n) {
		return ficcaside(1,2,n);
    }

	private int ficcaside(int i, int j, int n) {
		if(n > 2) {n--;return ficcaside(j,i+j,n);}
		if(n == 1) return i;
		return j;
	}
}
