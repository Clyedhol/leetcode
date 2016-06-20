package leetcode.algorithms;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {
	public boolean wordPattern(String pattern, String str) {
        String[] Strings = str.split(" ");
        char[] patternforchar = pattern.toCharArray();
        String patterntemp = getIsomorphic(patternforchar);
        String pattern2 = "";
        int n = 0;
        Map<String,Integer> map = new HashMap<String,Integer>();
        for(int i = 0;i<Strings.length;i++){
        	if(map.get(Strings[i]) == null) {
        		n++;
        		map.put(Strings[i], n);
        	}
        	pattern2 = pattern2 + String.valueOf(map.get(Strings[i]));
        }
        return patterntemp.equals(pattern2);
    }
	
	private String getIsomorphic(char[] sforChar){
		String patterntemp = "";
		int n = 0;
		int[] arrayforint = new int[128];
		for(int i = 0;i<sforChar.length;i++){
        	if(arrayforint[sforChar[i]] == 0) {
        		n++;
        		arrayforint[sforChar[i]] = n;
        	}
        	patterntemp = patterntemp + arrayforint[sforChar[i]];
        }
		return patterntemp;
	}
	
	public static void main(String[] args) {
		WordPattern wp = new WordPattern();
		System.out.println(wp.wordPattern("acca", "dog cat cat dog"));
	}
}
