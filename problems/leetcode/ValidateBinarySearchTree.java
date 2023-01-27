package leetcode;
import tree.TreeNode;

public class ValidateBinarySearchTree {
	public boolean isValidBST(TreeNode root) {
		return validateBST(root, null, null);
	}

	public boolean validateBST(TreeNode root, Integer min, Integer max) {
		if (root == null) return true;
		if ((min != null && root.val <= min) || (max != null && root.val >= max))
			return false;
        return validateBST(root.left, min, root.val) && validateBST(root.right, root.val, max);
	}
}