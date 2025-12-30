class Solution {
    public int countAsterisks(String s) {
        int countAsterisks = 0;
        int lCount = 0;
        for(char c:s.toCharArray()){
            if(c=='|')
                lCount++;
            if(lCount%2==0 && c=='*')
                  countAsterisks++;
        }
        return countAsterisks;
    }
}