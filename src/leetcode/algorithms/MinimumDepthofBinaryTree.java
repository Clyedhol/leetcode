package leetcode.algorithms;

public class MinimumDepthofBinaryTree {
	public int minDepth(TreeNode root) {
		if(root == null) return 0;
        return minTreeD(root,0);
    }

	private int minTreeD(TreeNode root, int i) {
		i++;
		if(root.left == null && root.right == null) return i;
		if(root.left != null && root.right == null){
			return minTreeD(root.left,i);
		}
		if(root.left == null && root.right != null){
			return minTreeD(root.right,i);
		}
		int l = minTreeD(root.left,i);
		int r = minTreeD(root.right,i);
		return l<r?r:l;
	}
	
	
}
