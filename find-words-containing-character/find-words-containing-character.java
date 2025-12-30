class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> findWordsContaining = new ArrayList<Integer>();
        int index = 0;
        for(String word:words){
            if(word.indexOf(x)!=-1)
                findWordsContaining.add(index);
            index++;
        }
        return findWordsContaining;
    }
}