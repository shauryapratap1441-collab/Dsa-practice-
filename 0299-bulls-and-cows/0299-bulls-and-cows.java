
class Solution {
    public String getHint(String secret, String guess) {
        int secretc[]=new int[10];
        int guessc[]=new int[10];
        int bull=0,cow=0;
        for(int i=0;i<secret.length();i++){
            if(secret.charAt(i)==guess.charAt(i))
            bull++;
            else {
              guessc[guess.charAt(i)-'0']++;
              secretc[secret.charAt(i)-'0']++;
            }
        }
        for(int i=0;i<10;i++)
        cow+=Math.min(secretc[i],guessc[i]);
        String sb=bull+"A"+cow+"B";
        return sb;
    }
}