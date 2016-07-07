package leetcode.algorithms_middle;

public class MaximumProductofWordLengths {
    public int maxProduct(String[] words) {
        int productmax = 0;
        for(int i = 0;i<words.length;i++){
        	for(int j = i+1;j<words.length;j++){
        		if(!isSimiliar(words[i],words[j]))
        		{
        			productmax = Math.max(productmax, words[i].length()*words[j].length());
        		}
        	}
        }
        return productmax;
    }

	private boolean isSimiliar(String string, String string2) {
		// TODO Auto-generated method stub
		StringBuilder sb1 = new StringBuilder(string);
		StringBuilder sb2 = new StringBuilder(string2);
		int[] charnum = new int[128];
		for(int i=0;i<sb1.length();i++){
			if(charnum[sb1.charAt(i)] == 0)
				charnum[sb1.charAt(i)]++;
		}
		for(int i=0;i<sb2.length();i++){
			if(charnum[sb2.charAt(i)]>0) return true;
		}
		return false;
	}
	//把字符串转换为二进制，比如ab-->11,ca-->101
	public int maxProduct1(String[] words) {
	    int len = words.length;
	    int[] mark = new int[len];
	    int[] leng = new int[len];
	    for (int i = 0;i<len;i++) {
	        int k = words[i].length();
	        leng[i] = k;
	        for (int j=0;j<k;j++) {
	            int p = (int)(words[i].charAt(j)-'a');
	            p = 1 << p;
	            mark[i] = mark[i] | p;
	        }
	    }
	    int ans = 0;
	    for (int i = 0;i<len;i++)
	     for (int j = i+1;j<len;j++) 
	     if ((mark[i]&mark[j])==0) 
	      if (ans<leng[i]*leng[j])
	         ans=leng[i]*leng[j];
	    return ans;
	    }
	
	public static void main(String[] args) {
		MaximumProductofWordLengths mpwl = new MaximumProductofWordLengths();
		String[] s = {"abc","a","b",""};
		System.out.println(mpwl.maxProduct(s));
	}
}
