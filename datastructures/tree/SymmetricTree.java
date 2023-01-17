/*
 public boolean isSymmetric(tree.TreeNode root) {
    if(root==null) return true;
    return isMirror(root.left,root.right);
}
public boolean isMirror(tree.TreeNode p, tree.TreeNode q) {
    if(p==null && q==null) return true;
    if(p==null || q==null) return false;
    return (p.val==q.val) && isMirror(p.left,q.right) && isMirror(p.right,q.left);
}
 */

package tree;

import java.util.Stack;

public class SymmetricTree {


	public boolean isSymmetric(TreeNode root) {
		Stack<TreeNode> s = new Stack<>();
		Stack<TreeNode> s1 = new Stack<>();
		boolean result = false;
		if (root == null) {
			return false;
		}
		if (root.left == null && root.right == null) {
			return true;
		} else if (root.left != null && root.right != null) {
			s.push(root.left);
			s1.push(root.right);
			while (!s.isEmpty() && !s1.isEmpty()) {
				TreeNode t = s.pop();
				TreeNode t1 = s1.pop();
				System.out.println(t.val);
				System.out.println(t1.val);
				if (t.val == t1.val) {
					if (t.left != null && t1.right != null) {
						s.push(t.left);
						s1.push(t1.right);
					} else if (t.left != null && t1.right == null) {
						return false;
					} else if (t.left == null && t1.right != null) {
						return false;
					}
					if (t.right != null && t1.left != null) {
						s.push(t.right);
						s1.push(t1.left);
					} else if (t.right != null && t1.left == null) {
						return false;
					} else if (t.right == null && t1.left != null) {
						return false;
					}


				} else {
					return false;
				}


			}
			if (s.isEmpty() && s1.isEmpty()) {
				return true;
			}
		} else {
			return false;
		}

		return result;

	}

}
