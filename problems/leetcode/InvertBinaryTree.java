package leetcode;
import tree.TreeNode;
/*
Given the root of a binary tree, invert the tree, and return its root.
 */
public class InvertBinaryTree {
	public TreeNode invertTree(TreeNode root) {
		if(root != null)
		{
			TreeNode temp = root.left;
			root.left = invertTree(root.right);
			root.right = invertTree(temp);;
		}
		return root;
	}
}
