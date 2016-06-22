package leetcode.algorithms;

public class AddBinary {
    public String addBinary(String a, String b) {
    	int jinwei = 0;
    	int length = a.length() > b.length()?b.length():a.length();
    	int alength = a.length();
    	int blength = b.length();
    	String c = "";
    	for(int i = 0;i<length;i++){
    		int temp = a.charAt(alength-i-1) + b.charAt(blength-i-1) - 96 + jinwei;
    		jinwei = jinwei(temp);
    		c = temp%2 + c;
    	}
		for(int i = 0;i<blength-length;i++){
    		int temp = b.charAt(blength-length-i-1) - 48 + jinwei;
    		jinwei = jinwei(temp);
    		c = temp%2 + c;
    	}
		for(int i = 0;i<alength-length;i++){
    		int temp = a.charAt(alength-length-i-1) - 48 + jinwei;
    		jinwei = jinwei(temp);
    		c = temp%2 + c;
    	}
    	if(jinwei == 1) c = jinwei + c;
    	return c;
    }
    
    public int jinwei(int temp){
    	if(temp < 2){
    		return 0;
		}else if(temp == 2){
			return 1;
		}else{
			return 1;
		}
    }
    
    public static void main(String[] args) {
		AddBinary ab = new AddBinary();
		String temp = ab.addBinary("10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101", "1010");
		System.out.println(temp);
	}
}
