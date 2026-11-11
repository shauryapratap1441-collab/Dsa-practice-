class Solution {
    public int[] rotateElements(int[] nums, int k) {
        int count=0;
        for(int num:nums) if(num<0) count++;
        if(k==0||nums.length-count<=1) return nums;
        k=k%(nums.length-count);
        if(k==0) return nums;
        if(count==0){
            reverse(nums,0,nums.length-1);
            reverse(nums,0,nums.length-k-1);
            reverse(nums,nums.length-k,nums.length-1);
            return nums;
        }
        Map<Integer,Integer> map=new HashMap<>();
        int a[]=new int[nums.length-count];
        int p=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0) map.put(i,nums[i]);
            else a[p++]=nums[i];
        }
        p=0;
        reverse(a,0,a.length-1);
        reverse(a,0,a.length-k-1);
        reverse(a,a.length-k,a.length-1);
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(i)) nums[i]=map.get(i);
            else nums[i]=a[p++];
        }
        return nums;
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