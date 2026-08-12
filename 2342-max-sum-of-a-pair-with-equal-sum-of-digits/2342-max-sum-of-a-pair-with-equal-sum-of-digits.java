class Solution {
    public int maximumSum(int[] nums) {
        // Max possible digit sum for 10^9 is 9*9 = 81. Array size 82 is safe.
        int[] map = new int[82]; 
        int maxPairSum = -1;

        for (int num : nums) {
            int digitSum = 0;
            int temp = num;
            
            // Calculate sum of digits
            while (temp > 0) {
                digitSum += temp % 10;
                temp /= 10;
            }

            // If we already saw a number with the same digit sum, check the pair sum
            if (map[digitSum] > 0) {
                maxPairSum = Math.max(maxPairSum, map[digitSum] + num);
            }

            // Keep the largest number for this specific digit sum
            map[digitSum] = Math.max(map[digitSum], num);
        }

        return maxPairSum;
    }
}
