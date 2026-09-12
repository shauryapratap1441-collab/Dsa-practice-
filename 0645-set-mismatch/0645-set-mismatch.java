import java.util.*;

class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int[] counts = new int[n + 1];
        
        // Count frequencies of each number
        for (int num : nums) {
            counts[num]++;
        }
        
        int duplicate = 0;
        int missing = 0;
        
        // Look for the duplicate (count == 2) and missing (count == 0)
        for (int i = 1; i <= n; i++) {
            if (counts[i] == 2) {
                duplicate = i;
            } else if (counts[i] == 0) {
                missing = i;
            }
        }
        
        return new int[]{duplicate, missing};
    }
}
