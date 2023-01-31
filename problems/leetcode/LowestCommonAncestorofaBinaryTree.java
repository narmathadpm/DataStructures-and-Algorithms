package leetcode;
import tree.TreeNode;

public class LowestCommonAncestorofaBinaryTree {
	TreeNode ans = null;
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		traverse(root,p,q);
		return ans;
	}
	public boolean traverse(TreeNode root, TreeNode p,TreeNode q)
	{
		if(root == null)
		{
			return false;
		}

		int left = traverse(root.left,p,q) ? 1 : 0;
		int  right = traverse(root.right,p,q) ? 1 : 0;
		int current = 0;
		if(root == p || root == q)
		{
			current = 1;
		}
		if(left+right+current >= 2)
		{
			ans = root;
		}
		return  (left+right+current) > 0;


	}
}
