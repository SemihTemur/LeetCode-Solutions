class Solution {
    public int distributeCandies(int[] candyType) {
        int differentCandies = 0;
        int maxEatCandy = candyType.length/2;
        Set<Integer> candyTypeSet = new HashSet<Integer>();
        int i;
        for(i=0;i<candyType.length;i++){
            if(candyTypeSet.add(candyType[i]))
                differentCandies++;
        }
        if(differentCandies<maxEatCandy)
            return differentCandies;
        
        return maxEatCandy;
    }
}