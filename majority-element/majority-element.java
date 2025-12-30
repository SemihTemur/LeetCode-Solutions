class Solution {
    public int majorityElement(int[] nums) {
        int majorityElementCount = 0,majorityElement = 0;
        int i,j,size = nums.length;
        for(i=0;i<size;i++){
            int count = 0;
            for(j=0;j<size;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
            if(count>majorityElementCount && count>size/2){
                majorityElementCount = count;
                majorityElement = nums[i];
                break;
            }
        }
        return majorityElement;
    }
}