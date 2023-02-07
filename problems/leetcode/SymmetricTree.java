package leetcode;

import tree.TreeNode;

public class SymmetricTree {
	public boolean isSymmetric(TreeNode root) {
		if (root == null) {
			return true;
		}

		return check(root.left, root.right);
	}

	public boolean check(TreeNode node, TreeNode node1) {
		if (node == null && node1 == null) {
			return true;
		}
		if (node != null && node1 != null) {
			if (node.val != node1.val)
				return false;
			return check(node.left, node1.right) && check(node.right, node1.left);
		} else {
			return false;
		}
	}
}
