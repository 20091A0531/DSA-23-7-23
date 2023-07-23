/* Question 11: Swap Nodes in Pairs

Skill Mapping: Basic

Description: Solve the LeetCode Problem given as a link below -

https://leetcode.com/problems/swap-nodes-in-pairs/ */
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
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null)
            return head;
        ListNode res=head;
        ListNode next=res.next;
        while(res!=null && res.next!=null)
        {
            ListNode prev=res;
            res=res.next;
            prev.next=res.next;
            res.next=prev;
            res=prev.next;
            if(res!=null && res.next!=null) prev.next=res.next;
        }
        return next;
    }
}
