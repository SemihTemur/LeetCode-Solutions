class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int i=0,j=0;
        int countPrefixSuffixPairs = 0;
        for(i=0;i<words.length;i++){
            for(j=i+1;j<words.length;j++){
                if(Solution.isPrefixAndSuffix(words[i],words[j]))
                    countPrefixSuffixPairs++;
            }
        }
        return countPrefixSuffixPairs;
    }

    public static boolean isPrefixAndSuffix(String str1,String str2){
        return str2.startsWith(str1) && str2.endsWith(str1);
    }
}