package leetcode;
import java.util.ArrayList;
import java.util.List;

import tree.TreeNode;

public class BinaryTreeRightSideView {
	List<Integer> result = new ArrayList<>();

	public List<Integer> rightSideView(TreeNode root) {
		helper(root, 0);
		return result;
	}

	public void helper(TreeNode root, int level)
	{
		if(root != null)
		{
			if(level == result.size())
				result.add(root.val);
			helper(root.right, level+1);
			helper(root.left, level+1);
		}
	}
}
