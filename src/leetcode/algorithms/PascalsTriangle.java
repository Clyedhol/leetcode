package leetcode.algorithms;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
	public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> numRowsList = new ArrayList<List<Integer>>();
		int i = 0;
		while(i < numRows){
			List<Integer> numRowsListtemp = new ArrayList<Integer>();
			numRowsList.add(numRowsListtemp);
			i++;
		}
		numRowsList.get(0).add(1);
		i = 1;
		while(i < numRows){
			List<Integer> numRowsListNow = numRowsList.get(i);
			List<Integer> numRowsListPre = numRowsList.get(i-1);
			numRowsListNow.add(1);
			for(int j = 1;j < i;j++){
				numRowsListNow.add(numRowsListPre.get(j-1) + numRowsListPre.get(j));
			}
			numRowsListNow.add(1);
		}
        return numRowsList;
    }
}
