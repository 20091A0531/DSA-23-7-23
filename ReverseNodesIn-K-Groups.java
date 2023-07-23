/* Question 12: Reverse Nodes in k-Group

Skill Mapping: Basic

Description: Solve the LeetCode Problem given as a link below -

https://leetcode.com/problems/reverse-nodes-in-k-group/ */

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
    public ListNode reverseKGroup(ListNode head, int k) {
        int count=0;
        ListNode res=new ListNode();
        res.next=head;
        ListNode cur=res;
        ListNode prev=res;
        ListNode next=res;
        while(cur.next!=null)
        {
            cur=cur.next;
            count++;
        }
        while(count>=k)
        {
            cur=prev.next;
            next=cur.next;
            for(int i=1;i<k;i++)
            {
                cur.next=next.next;
                next.next=prev.next;
                prev.next=next;
                next=cur.next;
            }
            prev=cur;
            count-=k;
            
        }
        return res.next;
    }
}
