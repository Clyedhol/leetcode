package leetcode.algorithms;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
 * Given a binary tree, 
 * return the bottom-up level order traversal of its nodes' values. 
 * (ie, from left to right, level by level from leaf to root).
 */
public class BinaryTreeLevelOrderTraversalII {
	public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if(root == null) return new ArrayList<List<Integer>>();
		int depth = maxDepth(root);
		List<List<Integer>> depthList = new ArrayList<List<Integer>>();
		for(int i = 0;i<depth;i++){
			List<Integer> depthListTemp = new ArrayList<Integer>();
			depthList.add(depthListTemp);
		}
		levelOrder(depthList,root,depth,1);
        return depthList;
    }
	
	private void levelOrder(List<List<Integer>> depthList, TreeNode root,int depth,int level) {
		depthList.get(depth-level).add(root.val);
		if(root.left != null) 
		    levelOrder(depthList,root.left,depth,level + 1);
		if(root.right != null)
		    levelOrder(depthList,root.right,depth,level + 1);
	}

	public int maxDepth(TreeNode root) {
		if(root == null){
			return 0;
		}
		int l = maxDepth(root.left);
		int r = maxDepth(root.right);
		l++;
		r++;
		return l<r?r:l;
	}
}
