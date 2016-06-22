package leetcode.algorithms;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        int length = strs.length;
        if(length == 0) return "";
        if(length == 1) return strs[0];
        String temp = strs[0];
        for(int i=0;i<length - 1;i++){
        	String temp1 = contract(strs[i],strs[i+1]);
        	if(temp.length() > temp1.length()) temp = temp1;
        }
        return temp;
    }

	private String contract(String string, String string2) {
		int length = 0;
		if(string.length() < string2.length()) length = string.length();
		else length = string2.length();
		int i = 0;
		while(i<length){
			if(string.charAt(i) != string2.charAt(i)) break;
			i++;
		}
		return string.substring(0, i);
	}
	
	public static void main(String[] args) {
		LongestCommonPrefix lcp = new LongestCommonPrefix();
		String[] sa = {"a","b"};
		lcp.longestCommonPrefix(sa);
	}
}
