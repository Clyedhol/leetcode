package leetcode.algorithms;

public class ExcelSheetColumnTitle {
    public String convertToTitle(int n) {
    	StringBuilder sb = new StringBuilder();
    	char temp = ' ';
    	while(n!=0){
    		if(n%26 == 0) {
    			temp = 'Z'; 
    			n = n/26-1;
    		}
    		else {
    			temp = (char) (n%26+64);
    			n /= 26;
    		}
    		sb.append(temp);
    	}
    	return sb.reverse().toString();
    }
    public static void main(String[] args) {
    	ExcelSheetColumnTitle es = new ExcelSheetColumnTitle();
    	System.out.println(es.convertToTitle(52));
	}
}
