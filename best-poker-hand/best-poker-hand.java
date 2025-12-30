class Solution {
    public String bestHand(int[] ranks, char[] suits) {
        Map<Integer,Integer> rankMap = new HashMap<>();
        Set<Character> suitMap = new HashSet<>();
        int repeatRankSize = -1;
        int repeatSuitSize = 1;

        for (int rank : ranks) {
            rankMap.merge(rank,1,Integer::sum);
        }

        for (Character suit : suits) {
            if (!suitMap.add(suit))
                repeatSuitSize++;
        }

        for(Integer rank:rankMap.keySet()){
            if(rankMap.get(rank)>=3){
                repeatRankSize = 3;
                break;
            }
            else if(rankMap.get(rank)==2){
                repeatRankSize = 2;
            }
        }

        if(repeatSuitSize>=5)
            return "Flush";

        if(repeatRankSize>=3)
             return "Three of a Kind";

        if(repeatRankSize==2)
             return "Pair";

        return "High Card";
    }
}