/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        StringBuilder sb=new StringBuilder();
        ListNode tmp=head;
        while(tmp!=null){
            sb.append(tmp.val);
            tmp=tmp.next;
        }
        String s=sb.toString();
        String s2=sb.reverse().toString();
        if(s.equals(s2))
        return true;
        else 
        return false;
    }
}
