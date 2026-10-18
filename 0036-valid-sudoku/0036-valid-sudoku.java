class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> s=new HashSet<>();
        for(int r=0;r<9;r++){
            for(int c=0;c<9;c++){
                char ch=board[r][c];
                if(ch!='.'){
                    if(!s.add(ch+"in row"+r)||!s.add(ch+"in column"+c)||!s.add(ch+"in box"+(r/3)+(c/3)))
                    return false;
                }
            }
        }
        return true;
    }
}