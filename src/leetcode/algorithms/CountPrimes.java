package leetcode.algorithms;

import java.util.ArrayList;
import java.util.List;

public class CountPrimes {
    public int countPrimes(int n) {
    	if(n <= 1) return 0;
        List<Integer> si = new ArrayList<Integer>();
        si.add(2);
        int i = 3;
        while(i<n){
        	int j = 0;
        	int pre = i;
        	for(;j<si.size();j++){
        		if(si.get(j) > pre) break;
        		if(i%si.get(j) == 0) {
        			j++;break;
        		}
        		pre = i/si.get(j);
        	}
        	if(i%si.get(j-1) != 0 ) si.add(i); 
        	i++;
        }
        return si.size();
    }
    
    public static void main(String[] args) {
		CountPrimes cp = new CountPrimes();
		System.out.println(cp.countPrimes(4));
	}
}
