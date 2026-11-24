class Solution {
    public String largestOddNumber(String num) {
        if(num.charAt(num.length()-1)=='1'||num.charAt(num.length()-1)=='3'||num.charAt(num.length()-1)=='5'||num.charAt(num.length()-1)=='7'||num.charAt(num.length()-1)=='9') return num;
        for(int i=num.length()-2;i>=0;i--){
            if(num.charAt(i)=='1'||num.charAt(i)=='3'||num.charAt(i)=='5'||num.charAt(i)=='7'||num.charAt(i)=='9')
              return num.substring(0,i+1);
        }
        return "";
    }
}