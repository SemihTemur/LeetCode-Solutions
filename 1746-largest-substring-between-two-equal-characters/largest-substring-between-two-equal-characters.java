class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int maxLengthBetweenEqualCharacters = -1;
        int i = 0,j = 0;

        for(i=0;i<s.length();i++){
            int count = -1;
            for(j=i+1;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                    count = j - i - 1;
                }
            }
            maxLengthBetweenEqualCharacters = Math.max(maxLengthBetweenEqualCharacters,count);
        }

        return maxLengthBetweenEqualCharacters;
    }
}