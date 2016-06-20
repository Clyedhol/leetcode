package leetcode.algorithms;

public class CountandSay {
    public String countAndSay(int n) {
        String temp = "1";
        while(n!=1){
        	char[] tempforArray = temp.toCharArray();
        	temp = "";
        	char i = '0';
        	int m = 0;
        	for(int j = 0;j<tempforArray.length;j++){
        		if(i != tempforArray[j]) {
        			if(m>0)
        				temp = temp + m + String.valueOf(i);
        			i = tempforArray[j];
        			m = 1;
        		}else m++;
        	}
        	temp = temp + m + String.valueOf(i);
        	n--;
        }
        return temp;
    }
    
    public static void main(String[] args) {
		CountandSay cs = new CountandSay();
		System.out.println(cs.countAndSay(6));
	}
}
