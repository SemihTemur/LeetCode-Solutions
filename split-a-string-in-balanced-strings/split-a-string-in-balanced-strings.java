class Solution {
    public int balancedStringSplit(String s) {
        int balancedStringSplit = 0;
        int Rcount = 0;

        for(char c:s.toCharArray()){
            if(c=='R')
                Rcount++;
            else
                Rcount--;
            if(Rcount==0)
                balancedStringSplit++;
        }
        return balancedStringSplit;
    }
}