package leetcode;

import java.util.LinkedList;
import java.util.Queue;

import tree.TreeNode;

public class SubtreeofAnotherTree {
	public boolean isSubtree(TreeNode root, TreeNode subRoot) {
		if (subRoot == null) {
			return true;
		}
		Queue<TreeNode> temp = new LinkedList<>();
		if (root != null) {
			temp.add(root);
			while (!temp.isEmpty()) {
				int size = temp.size();
				for (int i = 0; i < size; i++) {
					TreeNode current = temp.poll();
					if (current.val == subRoot.val) {
						if (checksubtree(current, subRoot)) {
							return true;
						}
					}
					if (current.left != null) {
						temp.add(current.left);
					}
					if (current.right != null) {
						temp.add(current.right);
					}
				}
			}
		}
		return false;

	}

	public boolean checksubtree(TreeNode root, TreeNode subRoot) {
		if (root == null && subRoot == null) {
			return true;
		}
		if (root == null || subRoot == null || root.val != subRoot.val) {
			return false;
		}
		return checksubtree(root.left, subRoot.left) && checksubtree(root.right, subRoot.right);
	}
}
