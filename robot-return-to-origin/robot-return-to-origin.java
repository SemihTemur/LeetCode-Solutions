class Solution {
    public boolean judgeCircle(String moves) {
        int x = 0,y=0;
        for(char c:moves.toCharArray()){
            if(c=='L')
                x--;
            else if(c=='R')
                x++;
            else if(c=='U')
                y++;
            else
                y--;
        }

        if(x!=0 || y!=0)
            return false;
        return true;
            
    }
}