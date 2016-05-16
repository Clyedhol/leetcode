package leetcode.algorithms;

public class ReverseVowelsOfAString {
	public String reverseVowels(String s) {
        StringBuilder sb = new StringBuilder(s.toLowerCase());
        StringBuilder st = new StringBuilder();
        StringBuilder sg = new StringBuilder(s);
        int n = sb.length();
        String temp = "aeiou";
        for(int i = 0;i<n;i++){
        	if(temp.contains(sb.charAt(i)+"")){
        		st.append(sg.charAt(i)+"");
        		sg.replace(i, i+1, "/");
        	}
        }
        st.reverse();
        System.out.println(st);
        System.out.println(sg);
        for(int i = 0;i<n;i++){
        	if("/".equals(sg.charAt(i)+"")){
        		sg.replace(i, i+1, st.charAt(0)+"");
        		st.deleteCharAt(0);
        	}
        }
        return sg.toString();
    }
	public static void main(String[] args) {
		ReverseVowelsOfAString ss = new ReverseVowelsOfAString();
		System.out.println(ss.reverseVowels("leetcode"));
		
//		haha();
	}
	
	public static void haha(){
		StringBuilder haha = new StringBuilder("jadksfa");
		haha.replace(7, 9, "/");
		System.out.println(haha);
	}
}
