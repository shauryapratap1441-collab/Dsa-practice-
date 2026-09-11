import java.util.Arrays;

class Solution {
    public long minimalKSum(int[] nums, int k) {
        // Step 1: Sort the array to process elements in increasing order
        Arrays.sort(nums);
        
        // Cast k to long to avoid integer overflow during multiplication
        long longK = k; 
        long totalSum = (longK * (longK + 1)) / 2;
        
        // Track the last processed number to ignore duplicates in 'nums'
        int lastProcessed = -1;
        
        for (int num : nums) {
            // Only process if it's a unique element and falls within our current window
            if (num != lastProcessed && num <= longK) {
                totalSum -= num;    // Remove the existing element
                longK++;            // Shift the window to include the next available integer
                totalSum += longK;  // Add the newly included boundary integer
                
                lastProcessed = num; // Mark as processed
            }
        }
        
        return totalSum;
    }
}
