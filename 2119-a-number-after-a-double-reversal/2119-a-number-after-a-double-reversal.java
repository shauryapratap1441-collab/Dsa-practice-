class Solution {
    public boolean isSameAfterReversals(int num) {
        if(num/10==0)
        return true;
        boolean flag=true;
        int c=0;
        while(num>0){
            int k=num%10;
            if(k!=0)
            c++;
            if(k==0&&c==0)
            flag=false;
            num/=10;
        }
        return flag;
    }
}