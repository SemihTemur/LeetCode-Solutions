class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int countConsistentStrings = 0;

        for (String word : words) {
            boolean isAllowed=true;
            for(char c:word.toCharArray()){
                if(allowed.indexOf(c)==-1){
                    isAllowed=false;
                    break;
                }
            }
            if(isAllowed)
                countConsistentStrings++;
        }    

        return countConsistentStrings;
    }
}