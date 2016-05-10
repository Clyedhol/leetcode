package leetcode.algorithms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HappyNumber {
	public static boolean isHappy(int n) {
		List<Integer> s = new ArrayList<Integer>();
		int m = 0;
        while(true){
        	s.add(n);
        	m = 0;
        	while(n !=0 ){
        	    m = m + (n%10)*(n%10);
        	    n /= 10;
        	}
	        if(m == 1){
	        	return true;
	        }else if(s.contains(m)){
	        	return false;
	        }
	        n = m;
        }
    }
	public static void main(String[] args) {
		isHappy(4);
	}
}
