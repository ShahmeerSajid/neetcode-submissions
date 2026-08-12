/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {  

    private boolean isSameTree(TreeNode p, TreeNode q){
        
        if (p == null && q == null) {
            return true;
        }

        if (p == null || q == null){
            return false;
        }

        if (p.val != q.val) {
            return false;
        }
        

        boolean a1 = isSameTree(p.left, q.left);
        boolean a2 = isSameTree(p.right, q.right);

        return a1 && a2;

    }

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {

        // base cases
        if (subRoot == null) {
            return true;
        }

        if (root == null) {return false;}



        // solve for left subtree and right subtree
        boolean a1 = isSameTree(root, subRoot);
        boolean a2 = isSubtree(root.left, subRoot);
        boolean a3 = isSubtree(root.right, subRoot);

        return a1 || a2 || a3;

        

    }

    
}
