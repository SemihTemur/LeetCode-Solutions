class Solution {
    public int findLucky(int[] arr) {
        int findLucky = -1,i;
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        
        for(i=0;i<arr.length;i++){
            map.merge(arr[i],1,Integer::sum);
        }

        for(int key:map.keySet()){
            if(key==map.get(key))
                findLucky=map.get(key);
        }

        return findLucky;
    }
}