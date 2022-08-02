package tree;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;

public class BinaryTreePostorderTraversal {
int val;
    BinaryTreePostorderTraversal left;
    BinaryTreePostorderTraversal right;
    BinaryTreePostorderTraversal() {}
    BinaryTreePostorderTraversal(int val) { this.val = val; }
    BinaryTreePostorderTraversal(int val, BinaryTreePostorderTraversal left, BinaryTreePostorderTraversal right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
    public void postorder(BinaryTreePostorderTraversal root, List<Integer> r)
    {
        if(root==null)
        {
            return;
        }
        postorder(root.left,r);
        postorder(root.right,r);
        r.add(root.val);

    }
    public List<Integer> postorderTraversal(BinaryTreePostorderTraversal root) {
        List<Integer> result=new ArrayList<>();
        postorder(root,result);
        return result;

    }
}
