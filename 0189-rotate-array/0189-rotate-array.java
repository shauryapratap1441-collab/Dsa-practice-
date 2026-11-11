class Solution {
    public void rotate(int[] nums, int k) {
        if(k==0)
        return;
        k=k%nums.length;
        if(k==0) return;
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
    }
    private int[] reverse(int a[],int start,int end){
        while(start<end){
           int temp=a[end];
           a[end]=a[start];
           a[start]=temp;
           start++; end--;
        }
        return a;
    }
}