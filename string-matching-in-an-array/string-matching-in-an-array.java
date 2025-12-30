class Solution {
    public List<String> stringMatching(String[] words) {
        Set<String> stringMatching = new HashSet<>();
        int i=0,j=0;
        for(i=0;i<words.length;i++){
            for(j=0;j<words.length;j++){
                if(j==i)
                    continue;
                if(words[i].contains(words[j]))
                    stringMatching.add(words[j]);
            }
        }

        return new ArrayList<>(stringMatching);
    }
}