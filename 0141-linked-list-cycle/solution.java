/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ArrayList<ListNode> arr=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null)
        {
            if(arr.contains(temp.next))
            return true;
            arr.add(temp.next);
            temp=temp.next;
        }
        return false;
    }
}
