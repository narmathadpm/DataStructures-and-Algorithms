package leetcode;

import tree.TreeNode;

public class DiameterofBinaryTree {
	int d = 0;
	public int diameterOfBinaryTree(TreeNode root) {
		checkBinaryTreeDiameter(root);
		return d;
	}

	public int checkBinaryTreeDiameter(TreeNode tree)
	{
		if(tree == null)
		{
			return 0;
		}
		int left = checkBinaryTreeDiameter(tree.left);
		int right = checkBinaryTreeDiameter(tree.right);
		d = Math.max(d, left+right);
		return Math.max(left,right)+1;
	}
}
