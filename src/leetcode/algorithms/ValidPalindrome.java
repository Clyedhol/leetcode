package leetcode.algorithms;

public class ValidPalindrome {
	public boolean isPalindrome(String s) {
		if(s == null||s.equals("")||s.length() == 1) return true;
		s = s.toLowerCase();
		StringBuilder sb = new StringBuilder(s);
		int length = sb.length();
		int i = 0,j = length-1;
		while(i < j){
			while(i<length && !(47<sb.charAt(i)&&sb.charAt(i)<58) && !(96<sb.charAt(i)&&sb.charAt(i)<123)) {
				i++;
			}
			if(i == length) return true;
			while(j<length && (!(47<sb.charAt(j)&&sb.charAt(j)<58) && !(96<sb.charAt(j)&&sb.charAt(j)<123))) {
				j--;
			}
			if(sb.charAt(i) != sb.charAt(j)) return false;
			i++;
			j--;
		}
        return true;
    }
	
	public static void main(String[] args) {
//		ValidPalindrome vp = new ValidPalindrome();
//		System.out.println(vp.isPalindrome("`l;`` 1o1 ??;l`"));
		char c = 'a';
		int i = c;
		System.out.println(Integer.MAX_VALUE);
	}
}
