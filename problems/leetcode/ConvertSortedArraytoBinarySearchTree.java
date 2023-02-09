package leetcode;

import tree.TreeNode;

public class ConvertSortedArraytoBinarySearchTree {
	public TreeNode sortedArrayToBST(int[] num) {
		return treeForm(num, 0, num.length - 1);
	}

	public TreeNode treeForm(int[] num, int left, int right) {
		if (left <= right) {
			int mid = (left + right) / 2;
			TreeNode root = new TreeNode(num[mid], null, null);
			root.left = treeForm(num, left, mid - 1);
			root.right = treeForm(num, mid + 1, right);
			return root;
		}
		return null;
	}
}
