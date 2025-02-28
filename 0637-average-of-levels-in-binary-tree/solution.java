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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> li=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            double l=q.size();
            double s=0;
            for(int i=0;i<l;i++)
            {
                TreeNode tmp=q.poll();
                s+=tmp.val;
                if(tmp.left!=null)
                q.add(tmp.left);
                if(tmp.right!=null)
                q.add(tmp.right);
            }
            li.add(s/l);
        } 
        return li;
    }
}
