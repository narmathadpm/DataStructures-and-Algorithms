package tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeInorderTraversal {
    int val;
    BinaryTreeInorderTraversal left;
    BinaryTreeInorderTraversal right;
    BinaryTreeInorderTraversal() {}
    BinaryTreeInorderTraversal(int val) { this.val = val; }
    BinaryTreeInorderTraversal(int val, BinaryTreeInorderTraversal left, BinaryTreeInorderTraversal right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
    public List<Integer> inorderTraversal(BinaryTreeInorderTraversal root) {
        List<Integer> result=new ArrayList<>();
        Stack<BinaryTreeInorderTraversal> s=new Stack<>();

        if(root==null)
        {
            return result;
        }
        BinaryTreeInorderTraversal curr=root;
        while(curr!=null||!s.isEmpty())
        {
            while(curr!=null)
            {
                s.push(curr);
                curr=curr.left;
            }
            curr=s.pop();
            result.add(curr.val);
            curr=curr.right;
        }
        return result;
    }
}
