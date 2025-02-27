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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        List<List<Integer>> l=new ArrayList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            int n=q.size();
            List<Integer> l1=new ArrayList<>();
            for(int i=0;i<n;i++)
            {
                TreeNode tmp=q.poll();
                if(tmp!=null)
                {
                    l1.add(tmp.val);
                    q.add(tmp.left);
                    q.add(tmp.right);
                }
            }
            if(l1.size()>0)
            l.add(l1);
        }
        return l;
    }
}
