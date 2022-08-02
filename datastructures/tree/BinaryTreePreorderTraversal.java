/*
https://leetcode.com/explore/learn/card/data-structure-tree/134/traverse-a-tree/928/

root->left->right

top->bottom
we used stack
 */


package tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreePreorderTraversal {
       int val;
      BinaryTreePreorderTraversal left;
      BinaryTreePreorderTraversal right;
     BinaryTreePreorderTraversal() {}
      BinaryTreePreorderTraversal(int val) { this.val = val; }
      BinaryTreePreorderTraversal(int val, BinaryTreePreorderTraversal left, BinaryTreePreorderTraversal right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }

    public List<Integer> preorderTraversal(BinaryTreePreorderTraversal root) {

        List<Integer> result=new ArrayList<>();
        Stack<BinaryTreePreorderTraversal> s=new Stack<>();
        if(root==null)
        {
            return result;
        }
        s.push(root);
        while(!s.isEmpty())
        {
            BinaryTreePreorderTraversal t=s.pop();
            result.add(t.val);
            if(t.right!=null)
            {
                s.push(t.right);
            }
            if(t.left!=null)
            {
                s.push(t.left);
            }
        }
        return result;
    }

}
