class Solution {
    public int findShortestSubArray(int[] nums) {
        Map<Integer,Integer> maps = new HashMap<Integer,Integer>();
        Map<Integer,Integer> lateIndexMap = new HashMap<Integer,Integer>();
        Map<Integer,Integer> firstIndexMap = new HashMap<Integer,Integer>();
        int i=0;
        for(i=0;i<nums.length;i++){
            maps.merge(nums[i],1,Integer::sum);
            lateIndexMap.put(nums[i],i);
            firstIndexMap.putIfAbsent(nums[i],i);
        }

        int maxRepeat = 0;
        int minLength = 0;
        int difference = 60000;
        boolean isEnter = false;
        for(Map.Entry<Integer,Integer> entry:maps.entrySet()){
            if(entry.getValue()>=maxRepeat){
                maxRepeat = entry.getValue();
            }
        }

         for(Map.Entry<Integer,Integer> entry:maps.entrySet()){
            if(entry.getValue()==maxRepeat){
                int end = lateIndexMap.get(entry.getKey());
                int start = firstIndexMap.get(entry.getKey());
                if(difference>end-start){
                    difference = end-start;
                    isEnter = true;
                    minLength=0;
                }
                while(isEnter && end>=start){
                   minLength++;
                   start++; 
                }
                isEnter = false;
            }
        }

        return minLength;


    }
}