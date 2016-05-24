package leetcode.algorithms;

import java.util.ArrayList;
import java.util.List;
// 利用中序排列，以及第二层数对比相同
public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        if(root == null){return true;}
		List<Integer> valsList = new ArrayList<Integer>();
		inOrderTraverse(valsList,root);
		int i = 0,j = valsList.size() - 1;
		while(i != j){
			if(valsList.get(i) == valsList.get(j)){
				i++;
				j--; 
			}else{
				return false;
			}
		}
        return true;
    }
	
	private void inOrderTraverse(List<Integer> vals, TreeNode root) {
		if(root == null)
			return;
		inOrderTraverse(vals,root.left);
		vals.add(root.val);
		inOrderTraverse(vals,root.right);
	}
}
