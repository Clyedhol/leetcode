package leetcode.algorithms;

public class LengthofLastWord {
	public int lengthOfLastWord(String s) {
		if(s.equals("")) return 0;
		s = s.trim();
		String s1 = s.substring(s.lastIndexOf(" ")+1);
		if(s1.equals(" ")) return 0;
		return s1.length();
    }
	
	public static void main(String[] args) {
		LengthofLastWord llw = new LengthofLastWord();
		System.out.println(llw.lengthOfLastWord("a "));
	}
}
