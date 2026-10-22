class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        Set<Integer> set=new HashSet<>();
        int a[]=new int[2];
        int i=0;
        for(int num:nums){
            if(set.contains(num)) a[i++]=num;
            else
            set.add(num);
        }
        return a;
    }
}