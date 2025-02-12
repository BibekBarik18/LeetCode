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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> l=new ArrayList<>();
        root=inorder(root,l);
        return l;
    }
    static TreeNode inorder(TreeNode node,List<Integer> l)
    {
        if(node==null)
        return null;
        inorder(node.left,l);
        l.add(node.val);
        inorder(node.right,l);
        return node;
    }
}
