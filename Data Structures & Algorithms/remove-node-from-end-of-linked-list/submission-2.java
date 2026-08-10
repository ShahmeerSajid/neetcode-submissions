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
    public ListNode removeNthFromEnd(ListNode head, int n) {

        int length = 0;
        ListNode curr = head;
        ListNode fast = head;
        ListNode slow = head;

        // Find length
        while (curr != null) {
            curr = curr.next;
            length++;
        }

        // Position of node to remove
        int target = length - n;

        // Edge case: remove head
        if (target == 0) {
            return head.next;
        }

        // Move fast to target node
        for (int i = 0; i < target; i++) {
            fast = fast.next;
        }

        // Move slow until it is before fast
        while (slow.next != fast) {
            slow = slow.next;
        }

        // Remove fast
        slow.next = fast.next;
        fast.next = null;
        
        return head;
    }
}
