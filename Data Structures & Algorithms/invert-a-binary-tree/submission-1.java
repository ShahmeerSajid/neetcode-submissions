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
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }

        // Swap left and right
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;


        // invert subtrees using recursion
        invertTree(root.left);
        invertTree(root.right);

        return root;
    }
}


// Time: O(n) --> we visit every node once
// Space: O(h) --> Atmost h recursive calls are on the call stack where h is the height of the tree. For balanced tree h = log n approx and for binary it is n
