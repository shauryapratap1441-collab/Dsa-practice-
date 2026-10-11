class Solution {
    public boolean doesAliceWin(String s) {
        int vow=0;
        for(char ch:s.toCharArray()){
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') vow++;
        }
        return vow!=0;
    }
}