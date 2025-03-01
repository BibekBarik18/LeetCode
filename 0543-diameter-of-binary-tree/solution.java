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
    int diameter=0;
    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return diameter;
    }
    public int height(TreeNode root)
    {
        if(root==null)
        return 0;
        int leftheight=height(root.left);
        int rightheight=height(root.right);

        int dia=leftheight+rightheight;
        diameter=Math.max(diameter,dia);
        return Math.max(leftheight,rightheight)+1;
    }
}
