package leetcode.algorithms;

public class ReverseVowelsOfAString {
	public String reverseVowels(String s) {
        StringBuilder st = new StringBuilder();
        StringBuilder sg = new StringBuilder(s);
        int n = sg.length();
        for(int i = 0;i<n;i++){
        	if("AEIOUaeiou".indexOf(s.charAt(i)) != -1){
        		st.append(sg.charAt(i)+"");
        		sg.replace(i, i+1, "/");
        	}
        }
        if(st.length() == 0 || st.length() == 1){return s;}
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
	
	//这个方法很屌！！
	public String reverseVowels1(String s) {
        StringBuilder sb = new StringBuilder();
       int j = s.length() - 1;
       for (int i = 0; i < s.length(); i++)
       {
           if ("AEIOUaeiou".indexOf(s.charAt(i)) != -1)
           {
               while (j >= 0 && "AEIOUaeiou".indexOf(s.charAt(j)) == -1)
               {
                   j--;
               }
               sb.append(s.charAt(j));
               j--;
           }
           else
               sb.append(s.charAt(i));
       }
       return sb.toString();
       }
}
