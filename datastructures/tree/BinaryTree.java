/*
tree will have root node and child nodes.
it will have n nodes and (n-1) edges .

binary tree means each node has at most two children which is referred as left node and right node

Traversal a Tree

Two types
1.Breadth first search

level by level search will happen

2.depth first search

so that one would start from a root and reach all the way down to certain leaf, and then back to root to reach another branch.


this is classified as 3 :

Pre-order Traversal

In this root will be visited first .then left sub tree then right sub tree

In-order Traversal

in this we will visit left sub tree first then root , finally right sub tree

Post-order Traversal

in this we will visit left sub tree first then right sub tree and root



 */

package tree;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

 //Definition for a binary tree node.
  public class BinaryTree {
     int val;
     BinaryTree left;
     BinaryTree right;
     BinaryTree() {}
     BinaryTree(int val) { this.val = val; }
     BinaryTree(int val, BinaryTree left, BinaryTree right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
     public List<Integer> preorderTraversal(BinaryTree root) {

         List<Integer> result=new ArrayList<>();
         Stack<BinaryTree> s=new Stack<>();
         if(root==null)
         {
             return result;
         }
         s.push(root);
         while(!s.isEmpty())
         {
             BinaryTree t=s.pop();
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


