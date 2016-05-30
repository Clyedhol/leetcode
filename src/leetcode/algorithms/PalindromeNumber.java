package leetcode.algorithms;



public class PalindromeNumber {
	//转换成字符串，用字符串的本地方法进行交换再比较
	public boolean isPalindrome(int x) {
		String temp = x+"";
        StringBuilder sb = new StringBuilder(temp);
        sb.reverse();
        if(sb.toString().equals(temp)) return true;
		return false;
    }
	public static void main(String[] args) {
		PalindromeNumber p = new PalindromeNumber();
		System.out.println(p.isPalindrome(0));
	}
	//网上大神的方法，很厉害
	 public boolean isPalindrome4(int x) {
	        if (x < 0) return false;
	        int ans = 0;
	        int num = x;
	        while ( num > 0) {
	            ans = ans * 10 + num % 10;
	            num = num / 10;
	        }
	        if (ans != x) return false;
	        return true;
	    }
}
