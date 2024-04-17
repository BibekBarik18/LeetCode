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
    String small="";
    public String smallestFromLeaf(TreeNode root) {
        dfs(root,"");
        return small;
    }
    public void dfs(TreeNode root,String cur)
    {
        if(root==null) return;

        cur=(char)(root.val+'a')+cur;
        if(root.left==null && root.right==null)
        if(small=="" || small.compareTo(cur)>0)
        small=cur;

        dfs(root.left,cur);
        dfs(root.right,cur);
    }
}
