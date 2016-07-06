package leetcode.algorithms_middle;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
class TreeNode {
	 int val;
	 TreeNode left;
	 TreeNode right;
	 TreeNode(int x) { val = x; }
}

public class BinaryTreePreorderTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        preorderTraversal(root,list);
        return list;
    }
	private void preorderTraversal(TreeNode root, List<Integer> list) {
		// TODO Auto-generated method stub
		if(root == null) return;
		list.add(root.val);
		preorderTraversal(root.left,list);
		preorderTraversal(root.right,list);
	}
	//using stack 
	public List<Integer> preorderTraversal1(TreeNode root) {
	        List<Integer> results = new ArrayList<>();
	        ArrayDeque<TreeNode> stack = new ArrayDeque<>();
	        TreeNode crt = root;
	        while (!stack.isEmpty() || crt != null) {
	            if (crt == null) {
	                crt = stack.pop();
	            } else {
	                results.add(crt.val);
	                if (crt.right != null) {
	                    stack.push(crt.right);
	                }
	                crt = crt.left;
	            }
	        }
	        return results;
	    }
}
