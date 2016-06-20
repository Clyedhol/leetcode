package leetcode.algorithms;

import java.util.LinkedList;

public class ValidParentheses {
	public boolean isValid(String s) {
		char[] sc = s.toCharArray();
		LinkedList<Character> lc = new LinkedList<Character>();
		for(int i = 0;i<sc.length;i++){
			Character tempfirst = lc.peekFirst();
			if(tempfirst == null){
				lc.addFirst(sc[i]);
			}else if(tempfirst == ')' || tempfirst == ']' || tempfirst == '}'){
				return false;
			}else{
				String tempfor = String.valueOf(tempfirst) + String.valueOf(sc[i]);
				if(tempfor.equals("()") || tempfor.equals("[]") || tempfor.equals("{}")){
						lc.pollFirst();
				}else{
					lc.addFirst(sc[i]);
				}
			}
		}
        return lc.isEmpty();
    }
	
	public static void main(String[] args) {
		ValidParentheses vp = new ValidParentheses();
		System.out.println(vp.isValid("()"));
	}
}
