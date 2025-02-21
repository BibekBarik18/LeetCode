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
    static Set<Integer> set;
    static boolean found;
    public boolean findTarget(TreeNode root, int k) {
        set=new HashSet<>();
        found=false;
        check(root,k);
        return found;
    }
    static void check(TreeNode root,int k)
    {
        if(root==null || found)
        return;
        check(root.left,k);
        if(set.contains(k-root.val) )
        {
            found=true;
            return;
        }
        set.add(root.val);
        
        check(root.right,k);
        return;
    }
}

