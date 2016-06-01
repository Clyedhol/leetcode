package leetcode.algorithms;
//用递归算法和深度优先
public class PathSum {
	public boolean hasPathSum(TreeNode root, int sum) {
		if(root == null) return false;
		return hasPathSumTemp(root,sum);
    }
	
	public boolean hasPathSumTemp(TreeNode root, int sum){
		if(root.right == null && root.left == null) return sum == root.val?true:false;
		else if(root.right != null && root.left != null)
			return hasPathSumTemp(root.left,sum - root.val) || hasPathSumTemp(root.right,sum - root.val);
		else if(root.right == null && root.left != null)
			return hasPathSumTemp(root.left,sum - root.val);
		else
			return hasPathSumTemp(root.right,sum - root.val);
	}
}
