package leetcode.algorithms;

public class FirstBadVersion {
    public int firstBadVersion(int n) {
        if(n == 1) return 1;
        double pre = 1;
        double last = n+1;
    	while(pre != (last - 1)){
	        while(isBadVersion(n)){
	        	last = n;
	            n = (int) (pre/2 + (double)n/2);
	            if(n == 1) break;
	        }
	        pre = n;
	        n = (int) ((double)n/2 + last/2);
	    }
    	if(last != 2) return (int)last;
    	else {
    		if(isBadVersion((int)pre)) return 1;
    		return 2;
    	}
    }
    
    public boolean isBadVersion(int n){
    	if(n>=1) return true;
    	return false;
    }
    
    public static void main(String[] args) {
		FirstBadVersion fb = new FirstBadVersion();
		System.out.println(fb.firstBadVersion(2));
	}
}
