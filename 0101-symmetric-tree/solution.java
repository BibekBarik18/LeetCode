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
    public boolean isSymmetric(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            int n=q.size();
            List<String> l=new ArrayList<>();
            for(int i=0;i<n;i++)
            {
                TreeNode tmp=q.poll();
                
                if(tmp!=null)
                {
                    l.add(Integer.toString(tmp.val));
                    q.add(tmp.left);
                    q.add(tmp.right);
                }
                else
                l.add(null);
            }
            List<String> l1=new ArrayList<>(l);
            Collections.reverse(l1);
            if(!l.isEmpty() && !l.equals(l1))
            return false;
        }
        return true;
    }
}
