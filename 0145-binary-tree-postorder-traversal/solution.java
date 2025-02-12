/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int data;
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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> l=new ArrayList<Integer>();
        root=postorder(root,l);
        return l;
    }
    static TreeNode postorder(TreeNode node,List<Integer> l)
    {
        if(node==null)
        return  null;
        postorder(node.left,l);
        postorder(node.right,l);
        l.add(node.val);
        return node;
    }
}
