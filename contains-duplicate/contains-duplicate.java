class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> containsDuplicateNums = new HashSet<>();
        for(int num:nums){
            if(!containsDuplicateNums.add(num))
                return true;
        }
        // Arrays.sort(nums);
        // for(i=0;i<nums.length-1;i++){
        //     if(nums[i]==nums[i+1])
        //         return true;
        // }
        return false;
    }
}