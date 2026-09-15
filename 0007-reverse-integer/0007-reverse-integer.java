class Solution {
    public int reverse(int x) {
        long sum=0;
        boolean q=false;
        if(x<0){
            x=-(x);
        q=true;}
        while(x>0)
        {
            sum=sum*10+x%10;
            x/=10;
        }
        if (sum > Integer.MAX_VALUE || sum < Integer.MIN_VALUE) 
            return 0;
            else{
        if(q==true)
        return -((int)sum);
        else
        return (int)sum;  }
    }
}