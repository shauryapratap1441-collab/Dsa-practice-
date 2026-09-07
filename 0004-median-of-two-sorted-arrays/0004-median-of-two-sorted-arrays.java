class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int a[]=new int[nums1.length+nums2.length];
          System.arraycopy(nums1, 0, a, 0,nums1.length);
          System.arraycopy(nums2, 0, a, nums1.length, nums2.length);
          Arrays.sort(a);
        if(a.length%2!=0)
        return (double) a[a.length / 2];
        else   
       return ((double) a[a.length/ 2] + (double) a[(a.length / 2) - 1]) / 2.0;

    }
}