class Solution {
    public int sumOfUnique(int[] nums) {
        int result = 0, i;
        HashMap<Integer,Integer> noRepeatNums = new HashMap<Integer,Integer>();
        for (i = 0; i < nums.length; i++) {
          noRepeatNums.merge(nums[i],1,Integer::sum);
        }

        for(Map.Entry<Integer,Integer> maps : noRepeatNums.entrySet()){
            if(maps.getValue()<2){
                result+=maps.getKey();
            }
        }
        return result;
    }
}