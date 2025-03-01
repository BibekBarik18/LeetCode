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
    public boolean isCousins(TreeNode root, int x, int y) {
        TreeNode xx=find(root,x);
        TreeNode yy=find(root,y);

        System.out.println(level(root,x,0));
        if(level(root,x,0)==level(root,y,0) && !isSibling(root,xx,yy)) return true;
        return false;
    }
    TreeNode find(TreeNode root,int x)
    {
        if(root==null)
        return null;
        if(root.val==x)
        return root;
        TreeNode n=find(root.left,x);
        if(n!=null)
        return n;
        return find(root.right,x);
    }
    int level(TreeNode root,int x,int l)
    {
        if(root==null)
        return 0;
        if(root.val==x)
        return l;
        int le=level(root.left,x,l+1);
        if(le!=0)
        return le;
        return level(root.right,x,l+1);
    }
    boolean isSibling(TreeNode root,TreeNode x,TreeNode y)
    {
        if(root==null)
        return false;
        if((root.left==x && root.right==y) || (root.left==y && root.right==x) 
        || isSibling(root.left,x,y) || isSibling(root.right,x,y))
        return true;
        return false;
    }
}
