package leetcode.algorithms;

//求5的模，得到n中一共有多少个5，即得到有多少个0；
public class FactorialTrailingZeroes {
	public int trailingZeroes(int n) {
		int i = 0;
        while(n>4){
            i = i + n/5;
            n=n/5;
        }
        return i;
    }
	
	public static void main(String[] args) {
		FactorialTrailingZeroes f = new FactorialTrailingZeroes();
		f.trailingZeroes(30);
	}
}
