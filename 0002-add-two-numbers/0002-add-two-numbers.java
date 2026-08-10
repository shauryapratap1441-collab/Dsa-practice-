import java.math.BigInteger; // Required for handling huge numbers

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        String sum1 = "";
        String sum2 = "";
        
        // Use l1 and l2 directly (no getHeadNode() method exists)
        ListNode head1 = l1;
        ListNode head2 = l2;
        
        // 1. Build the strings in REVERSE order because LeetCode lists are reversed
        while (head1 != null) {
            sum1 = head1.val + sum1; // Prepends the digit to reverse it
            head1 = head1.next;
        }
        
        while (head2 != null) {
            sum2 = head2.val + sum2; // Prepends the digit to reverse it
            head2 = head2.next;
        }
        
        // 2. Use BigInteger to prevent NumberFormatException overflow errors
        BigInteger num1 = new BigInteger(sum1);
        BigInteger num2 = new BigInteger(sum2);
        BigInteger totalSum = num1.add(num2);
        
        // Convert the total back to a string
        String s = totalSum.toString();
        
        // 3. Convert the string back into LeetCode's custom ListNode chain
        // Since LeetCode expects the answer reversed, we build it from the end of the string to the front
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        
        for (int i = s.length() - 1; i >= 0; i--) {
            // Convert character digit to integer value
            int digit = Character.getNumericValue(s.charAt(i)); 
            current.next = new ListNode(digit);
            current = current.next;
        }
        
        return dummy.next;
    }
}
