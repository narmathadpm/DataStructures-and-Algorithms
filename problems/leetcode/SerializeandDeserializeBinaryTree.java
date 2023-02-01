package leetcode;
import java.util.LinkedList;
import java.util.Queue;

import tree.TreeNode;

public class SerializeandDeserializeBinaryTree {
	public String serialize(TreeNode root) {
		StringBuilder sb = new StringBuilder();
		Queue<TreeNode> temp = new LinkedList<>();
		if(root != null)
		{
			temp.offer(root);
			sb.append(String.valueOf(root.val));
			while(!temp.isEmpty())
			{
				int size = temp.size();
				for(int i = 0; i < size; i++)
				{
					sb.append(",");
					TreeNode current = temp.poll();
					if(current.left != null)
					{
						sb.append(current.left.val);
						temp.offer(current.left);
					}else{
						sb.append("NULL");
					}
					sb.append(",");
					if(current.right != null)
					{
						sb.append(current.right.val);
						temp.offer(current.right);
					} else{
						sb.append("NULL");
					}
				}
			}
		}
		return sb.toString();
	}

	// Decodes your encoded data to tree.
	public TreeNode deserialize(String data) {

		if(!data.isEmpty())
		{
			String[] arr = data.split(",");
			Queue<TreeNode> temp = new LinkedList<>();
			TreeNode current = new TreeNode(Integer.parseInt(arr[0]));
			temp.offer(current);
			int i = 1;
			int n = arr.length;
			while(i < n)
			{
				TreeNode t = temp.poll();
				if(!arr[i].equalsIgnoreCase("NULL"))
				{
					TreeNode current1 = new TreeNode(Integer.parseInt(arr[i]));
					t.left = current1;
					temp.offer(current1);
				}
				i++;
				if(i < n && !arr[i].equalsIgnoreCase("NULL"))
				{
					TreeNode current1 = new TreeNode(Integer.parseInt(arr[i]));
					t.right = current1;
					temp.offer(current1);
				}
				i++;
			}
			return current;
		}
		return null;
	}
}
