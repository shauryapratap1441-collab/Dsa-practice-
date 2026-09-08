class Solution {
    public boolean checkGoodInteger(int n) {
        int sum=0,square=0;
        while(n>0){
            sum+=n%10;
            square+=(n%10)*(n%10);
            n/=10;
        }
        return (square-sum)>=50;

    }
}