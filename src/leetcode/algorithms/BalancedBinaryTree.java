package leetcode.algorithms;

public class BalancedBinaryTree {
	 public boolean isBalanced(TreeNode root) {
	        if(root == null) return true;
	        int leftdep = maxDepth(root.left);
	        int rightdep = maxDepth(root.right);
	        if(Math.abs(leftdep-rightdep) < 2){
	            boolean left = true,right = true;
	        	if(root.left != null) left = isBalanced(root.left);
	        	if(root.right != null) right = isBalanced(root.right);
	        	return left && right;
	        }
	        return false;
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
