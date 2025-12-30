class Solution {
    public int possibleStringCount(String word) {
        int possibleStringCount = 1,i=0;

        for(i=0;i<word.length();i++){
            if(i+1!=word.length() && word.charAt(i)==word.charAt(i+1))
                possibleStringCount++;
        }

        return possibleStringCount;
    }
}