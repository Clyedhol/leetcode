package leetcode.algorithms;

public class IsomorphicStrings {
	public boolean isIsomorphic(String s, String t) {
        char[] sforChar = s.toCharArray();
        char[] tforChar = t.toCharArray();
        int[] sforA = new int[sforChar.length];
        int[] tforA = new int[sforChar.length];
        getIsomorphic(sforA,sforChar);
        getIsomorphic(tforA,tforChar);
        return isequal(sforA,tforA);
    }
	
	private void getIsomorphic(int[] forA,char[] sforChar){
		int n = 1;
		int[] arrayforint = new int[128];
		for(int i = 0;i<sforChar.length;i++){
        	if(arrayforint[sforChar[i]] == 0) {
        		n++;
        		arrayforint[sforChar[i]] = n;
        	}
        	forA[i] = arrayforint[sforChar[i]];
        }
	}
	
	private boolean isequal(int[] s,int[] t){
		for(int i = 0;i<s.length;i++){
			if(s[i] != t[i]) return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		IsomorphicStrings is = new IsomorphicStrings();
		System.out.println(is.isIsomorphic("11", "25"));
		int a = 'z';
		System.out.println(a);
	}
}
