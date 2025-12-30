class Solution {
    public String[] findRelativeRanks(int[] score) {
        String[] findRelativeRanks = new String[score.length];
        List<Integer> findNumber = new ArrayList<Integer>(); 
        int i = 0,j=0;

        for(i=0;i<score.length;i++){
            int count = score.length;
            for(j=0;j<score.length;j++){
                if(score[i]>score[j])
                    count--;
            }
            findNumber.add(count);
        }

        for(i=0;i<score.length;i++){
            if(findNumber.get(i)==1){
                findRelativeRanks[i] = "Gold Medal" ;
            }
            else if(findNumber.get(i)==2){
                findRelativeRanks[i] = "Silver Medal";
            }
            else if(findNumber.get(i)==3){
                findRelativeRanks[i]="Bronze Medal";
            }
            else
                findRelativeRanks[i] = String.valueOf(findNumber.get(i));
        }
        
        return findRelativeRanks;
    }

}