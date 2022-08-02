package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal {
    int val;
    BinaryTreeLevelOrderTraversal left;
    BinaryTreeLevelOrderTraversal right;
    BinaryTreeLevelOrderTraversal() {}
    BinaryTreeLevelOrderTraversal(int val) { this.val = val; }
    BinaryTreeLevelOrderTraversal(int val, BinaryTreeLevelOrderTraversal left, BinaryTreeLevelOrderTraversal right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
    public List<List<Integer>> levelOrder(BinaryTreeLevelOrderTraversal root) {
        List<List<Integer>> a=new ArrayList<List<Integer>>();
        Queue<BinaryTreeLevelOrderTraversal> q=new LinkedList<>();
        if(root==null)
        {
            return a;
        }
        q.offer(root);
        while(!q.isEmpty())
        {
            int s=q.size();
            List<Integer> a1=new ArrayList<Integer>();

            for(int i=0;i<s;i++)
            {
                BinaryTreeLevelOrderTraversal curr=q.poll();
                a1.add(curr.val);
                if(curr.left!=null)
                {
                    q.offer(curr.left);
                }
                if(curr.right!=null)
                {
                    q.offer(curr.right);
                }
            }
            a.add(a1);
        }

        return a;
    }
}
