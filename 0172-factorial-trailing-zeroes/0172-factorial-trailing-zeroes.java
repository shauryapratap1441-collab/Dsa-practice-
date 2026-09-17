class Solution {
    public int trailingZeroes(int n) {
        int count = 0;
        // Count how many factors of 5 are in the numbers from 1 to n
        while (n >= 5) {
            count += n / 5;
            n /= 5;
        }
        return count;
    }
}
