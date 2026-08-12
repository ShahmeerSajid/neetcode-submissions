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

        private void inOrder(TreeNode root, List<Integer> values){
            if (root == null){return;}

            // Left -> Root -> Right

            inOrder(root.left, values);
            values.add(root.val); // since the list stores integers
            inOrder(root.right, values);
        }

        public int kthSmallest(TreeNode root, int k) {

            List <Integer> values = new ArrayList<>();
            inOrder(root, values);

            return (values.get(k-1));   // unboxing: Java automatially converts the Integer type to int type.
        }
}
