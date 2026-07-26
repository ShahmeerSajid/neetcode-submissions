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

// class Solution {
//     public boolean hasCycle(ListNode head) {

//         Set<ListNode> visited = new HashSet<>();
//         ListNode current = head;

//         while (current != null) {

//             if (visited.contains(current)) {
//                 return true;
//             }

//             visited.add(current);
//             current = current.next;
//         }

//         return false;
//     }
// }


class Solution {
    public boolean hasCycle(ListNode head) {

        Map<ListNode, Integer> map = new HashMap<>();
        ListNode current = head;

        while (current != null) {

            if (map.containsKey(current)) {
                return true;
            }

            map.put(current, 1);
            current = current.next;
        }

        return false;
    }
}