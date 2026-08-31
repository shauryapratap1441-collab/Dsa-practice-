class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        // Base case: we need at least 3 nodes to have a critical point
        if (head == null || head.next == null || head.next.next == null||head.next.next.next==null) {
            return new int[]{-1, -1};
        }

        int firstCritical = -1;
        int prevCritical = -1;
        int minDistance = Integer.MAX_VALUE;
        
        // Pointers to track the local neighborhood
        ListNode prev = head;
        ListNode curr = head.next;
        int index = 1; // 0-indexed tracking for nodes

        while (curr.next != null) {
            ListNode nextNode = curr.next;
            
            // Check if curr is a local maxima or local minima
            boolean isMax = curr.val > prev.val && curr.val > nextNode.val;
            boolean isMin = curr.val < prev.val && curr.val < nextNode.val;

            if (isMax || isMin) {
                if (firstCritical == -1) {
                    firstCritical = index;
                } else {
                    // Update minDistance with the distance between adjacent critical points
                    minDistance = Math.min(minDistance, index - prevCritical);
                }
                prevCritical = index;
            }

            // Move pointers forward
            prev = curr;
            curr = nextNode;
            index++;
        }

        // If fewer than two critical points were found, return [-1, -1]
        if (firstCritical == prevCritical) {
            return new int[]{-1, -1};
        }

        // Max distance is always between the very first and the very last critical point
        int maxDistance = prevCritical - firstCritical;

        return new int[]{minDistance, maxDistance};
    }
}
