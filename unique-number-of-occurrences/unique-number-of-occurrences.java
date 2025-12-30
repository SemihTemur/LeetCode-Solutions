class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> maps = new HashMap<>();

        for(int num:arr)
            maps.merge(num,1,Integer::sum);
        
        Set<Integer> sets = new HashSet<Integer>();

        for(Map.Entry<Integer,Integer> entry:maps.entrySet()){
            if(!sets.add(entry.getValue()))
                return false;
        }

        return true;
    }
}