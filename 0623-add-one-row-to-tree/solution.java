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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        TreeNode n=null;
        if(depth==1)
        {
            n=new TreeNode(val);
            n.left=root;
            return n;
        }
        dfs(root,1,depth,val);
        return root;
    }
    public void dfs(TreeNode root,int cur,int depth,int val)
    {
        if(root==null)
        return;

        if(cur==depth-1)
        {
            TreeNode nleft=new TreeNode(val);
            nleft.left=root.left;
            root.left=nleft;
            TreeNode nright=new TreeNode(val);
            nright.right=root.right;
            root.right=nright;
            return;
        }

        dfs(root.left,cur+1,depth,val);
        dfs(root.right,cur+1,depth,val);
    }
}
