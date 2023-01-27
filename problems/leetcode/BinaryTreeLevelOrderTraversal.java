package leetcode;

import tree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal {
	public List<List<Integer>> levelOrder(TreeNode root) {
		Queue<TreeNode> temp = new LinkedList<>();
		List<List<Integer>> result = new ArrayList<>();
		if(root != null)
		{
			temp.offer(root);
			while(!temp.isEmpty())
			{
				List<Integer> currentList = new ArrayList<>();
				int size = temp.size();
				for(int i = 0; i < size; i++)
				{
					TreeNode currentTreeNode = temp.poll();
					currentList.add(currentTreeNode.val);
					if(currentTreeNode.left != null)
						temp.offer(currentTreeNode.left);
					if(currentTreeNode.right != null)
						temp.offer(currentTreeNode.right);
				}
				result.add(currentList);
			}
		}
		return result;
	}
}
