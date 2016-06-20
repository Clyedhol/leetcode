package leetcode.algorithms;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths {
    public List<String> binaryTreePaths(TreeNode root) {
    	List<String> ls = new ArrayList<String>();
        if(root == null) return ls;
        String temp = ""+root.val;
        TreePaths(ls,temp,root);
        return ls;
    }
    
    private void TreePaths(List<String> ls, String temp, TreeNode root) {
    	String temp1 = "";
		if(root.left != null) {
			temp1 = temp + "->" + root.left.val;
			TreePaths(ls,temp1,root.left);
		}
		if(root.right != null) {
			temp1 = temp + "->" + root.right.val;
			TreePaths(ls,temp1,root.right);
		}
		if(root.left == null && root.right == null)
			ls.add(temp1);
	}
}
