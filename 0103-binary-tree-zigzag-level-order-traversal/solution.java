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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> li=new ArrayList<>();
        if(root==null)
        return li;
        Deque<TreeNode> q=new LinkedList<>();
        q.add(root);
        int level=1;
        while(!q.isEmpty())
        {
            int l=q.size();
            List<Integer> l1=new ArrayList<>();
            for(int i=0;i<l;i++)
            {
                if(level%2==0)
                {
                    TreeNode tmp=q.pollLast();
                    l1.add(tmp.val);
                    if(tmp.right!=null)
                    q.addFirst(tmp.right);
                    if(tmp.left!=null)
                    q.addFirst(tmp.left);
                }
                else
                {
                    TreeNode tmp=q.pollFirst();
                    l1.add(tmp.val);
                    if(tmp.left!=null)
                    q.addLast(tmp.left);
                    if(tmp.right!=null)
                    q.addLast(tmp.right);
                }                
            }
            level++;
            li.add(l1);
        }
        return li;
    }
}
