class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int count=0;
        for (int i = 0; i < nums.length; i++) {
            int k = Math.abs(nums[i]);
            do {
                if (k % 10 == digit) {
                    count++;
                }
                k /= 10;
            } while (k > 0);
        }
        return count;
    }
}