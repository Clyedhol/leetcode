package leetcode.algorithms;
//java中int不能是无符号的啊。。超出范围怎么办？
public class NumberOf1Bits {
	public static int hammingWeight(int n) {
		   int result = 0;
		   while(n != 0) { 
		      result += (n & 1);
		      n >>>= 1;
		   }
		   return result;
    }
	public static void main(String[] args) {
		hammingWeight(0);
	}
}
