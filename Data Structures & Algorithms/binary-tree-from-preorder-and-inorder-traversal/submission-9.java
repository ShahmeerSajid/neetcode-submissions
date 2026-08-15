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




// preorder: root -> left -> right
// inorder: left -> root -> right


class Solution {

    int preIndex = 0; // This tells us which preorder element we should use next.

    Map<Integer, Integer> map = new HashMap<>();  // This helps us quickly find where a number is in inorder.


// Put everything from inorder into the map
    public TreeNode buildTree(int[] preorder, int[] inorder) {


        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }

        return build(preorder, 0, inorder.length - 1); // "Build the tree using the entire inorder array."
    }



    private TreeNode build(int[] preorder, int left, int right) {

       

        if (left > right) {
            return null;
        }

        int value = preorder[preIndex++]; // gives the root, Then preIndex++ moves to the next preorder value.

        TreeNode root = new TreeNode(value); // We create a tree node containing that value.

        int index = map.get(value); // find that root value's index in inorder

        root.left = build(preorder, left, index - 1); // Everything before the root in inorder belongs to the left subtree.
        root.right = build(preorder, index + 1, right); // Everything after the root in inorder belongs to the right subtree.

        return root;
    }
}
