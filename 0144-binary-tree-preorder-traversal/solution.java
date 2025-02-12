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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> l=new ArrayList<Integer>();
        root=preorder(root,l);
        return l;
    }
    static TreeNode preorder(TreeNode node,List<Integer> l)
    {
        if(node==null)
        return null;
        l.add(node.val);
        preorder(node.left,l);
        preorder(node.right,l);
        return node;
    }
}
