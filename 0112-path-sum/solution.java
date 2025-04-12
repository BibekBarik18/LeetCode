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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null)
        return false;
        return check(root,targetSum,0);
    }
    boolean check(TreeNode root,int target,int sum){
        if(root==null) return false;
        sum+=root.val;
        if(root.left==null && root.right==null){
            System.out.println(sum);
            return sum==target;
        }
        System.out.println(root.val);
        return check(root.left,target,sum) || check(root.right,target,sum);
    }
}
