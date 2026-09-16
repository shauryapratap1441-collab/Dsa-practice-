class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        // Dummy node helps handle cases where the head itself needs to be deleted
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode prev = dummy;
        ListNode curr = head;
        
        while (curr != null) {
            // Check if curr is the start of a duplicate chain
            if (curr.next != null && curr.val == curr.next.val) {
                // Move curr forward until we hit the LAST duplicate of this value
                while (curr.next != null && curr.val == curr.next.val) {
                    curr = curr.next;
                }
                // Completely bypass the whole duplicate chain
                prev.next = curr.next;
            } else {
                // No duplicate detected, safe to move prev forward
                prev = curr;
            }
            // Move curr to the next candidate node
            curr = curr.next;
        }
        
        return dummy.next;
    }
}
