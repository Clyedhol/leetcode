package leetcode.algorithms;
//需找最近的祖先节点

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
public class LowestCommonAncestor {
   public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
	   if(p == null){return q;}
	   if(q == null){return p;}
	   if(q == root||p==root||p==root.left||q==root.left||p==root.right||q==root.right) {return root;}
	   TreeNode lowestCommonl = null;
	   TreeNode lowestCommonr = null;
	   if(root.left != null)
		   lowestCommonl = lowestCommonAncestor(root.left, p, q);
	   if(root.right != null)
		   lowestCommonr = lowestCommonAncestor(root.right, p, q);
	   if(lowestCommonl == lowestCommonr){
		   return lowestCommonr;
	   }else{
		   return lowestCommonAncestor(root, lowestCommonl, lowestCommonr);
	   }
   }
}