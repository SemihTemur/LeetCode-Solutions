class Solution {
    public long pickGifts(int[] gifts, int k) {
        int i = 0,j=0;

        
        for(i=0;i<k;i++){
            int maxValue = gifts[0];
            int index = 0;
            for(j=0;j<gifts.length;j++){
                if(gifts[j]>maxValue){
                    maxValue = gifts[j];
                    index = j;
                }
            }

            gifts[index] = (int) Math.sqrt(maxValue);
        }

        long pickGifts = 0l;

        for(int num:gifts){
            pickGifts = pickGifts + num;
        }

        return pickGifts;

    }

}