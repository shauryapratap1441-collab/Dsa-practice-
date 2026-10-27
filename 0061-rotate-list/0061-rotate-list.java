class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        // 1. Handle base cases immediately
        if (head == null || head.next == null || k == 0) {
            return head;
        }
        
        // 2. Compute the length and find the actual tail node
        ListNode tail = head;
        int length = 1;
        while (tail.next != null) {
            tail = tail.next;
            length++;
        }
        
        // 3. Shrink k to its effective rotation count
        k = k % length;
        if (k == 0) {
            return head; 
        }
        
        // 4. Form a circular ring by linking tail to head
        tail.next = head;
        
        // 5. Advance to the node right before the new head
        int stepsToNewTail = length - k;
        ListNode newTail = head;
        for (int i = 1; i < stepsToNewTail; i++) {
            newTail = newTail.next;
        }
        
        // 6. Set the new head and sever the circular link
        ListNode newHead = newTail.next;
        newTail.next = null;
        
        return newHead;
    }
}
