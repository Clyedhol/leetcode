package leetcode.algorithms;
//翻转数字，但是不翻转前面的负号（如果为负数），并且判断翻转后的数字是否溢出，溢出则返回0；
public class ReverseInteger {
    public int reverse(int x) {
        int num = x;
        if (x < 0)  num = -x;
        int ans = 0;
        int n = 0;
        int pre = num % 10;
        while ( num > 0) {
            ans = ans * 10 + num % 10;
            num = num / 10;
            n++;
        }
        if(x < 0) ans = -ans;
        if(n == 10) {
            if(pre > 3) return 0;
            if(x < 0 && ans >= 0) return 0;
            if(x > 0 && ans <= 0) return 0;
        }
        return ans;
    }
    public static void main(String[] args) {
		ReverseInteger ri = new ReverseInteger();
		System.out.println(ri.reverse(-2147483412));
	}
}
