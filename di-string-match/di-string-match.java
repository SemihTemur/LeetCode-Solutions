class Solution {
    public int[] diStringMatch(String s) {
        int maxCount = s.length(), minCount = 0, index = 0;
        int[] diStringMatch = new int[maxCount+1];
        for(char c:s.toCharArray()){
            if(c=='I'){
                diStringMatch[index]  = minCount;
                minCount++;
                index++;
            }
            else{
                diStringMatch[index]  = maxCount;
                maxCount--;
                index++;
            }
        }
        diStringMatch[index] = maxCount;
        return diStringMatch;
    }
}