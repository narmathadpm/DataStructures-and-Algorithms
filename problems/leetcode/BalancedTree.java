package leetcode;

import tree.TreeNode;

public class BalancedTree {
	public class TreeInfo
	{
		int height;
		boolean isBalanced;
		TreeInfo(int height, boolean isBalanced)
		{
			this.height = height;
			this.isBalanced = isBalanced;
		}
	}

	public boolean isBalanced(TreeNode root) {
		return checkHeight(root).isBalanced;
	}

	public TreeInfo checkHeight(TreeNode root)
	{
		if(root == null)
			return new TreeInfo(0, true);
		TreeInfo left = checkHeight(root.left);
		TreeInfo right =  checkHeight(root.right);
		boolean isBalanced = left.isBalanced && right.isBalanced && Math.abs(left.height - right.height) <= 1;
		return new TreeInfo(Math.max(left.height,right.height)+1, isBalanced);
	}

}
