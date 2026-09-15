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
        ListNode slow=head;
ListNode fast=head;
while(fast!=null && fast.next!=null){
    fast=fast.next.next;
    slow=slow.next;

}
if (fast!=null){
    slow=slow.next;

}
    slow=reverseList(slow);
   fast=head;
    while(slow!=null){
        if(fast.val!=slow.val){
            return false;
        }
   fast=fast.next;
   slow=slow.next;
    }
    return true;
    }
public ListNode reverseList(ListNode head) {
        ListNode temp=head;
        ListNode previous=null;
    while(temp!=null){
        ListNode front=temp.next;
        temp.next=previous;
        previous=temp;
        temp=front;
    }
    return previous;
    }
}

