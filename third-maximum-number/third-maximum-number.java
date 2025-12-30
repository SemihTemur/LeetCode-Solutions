class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        int size = nums.length-1;
        int thirdMax=nums[size];
        int i;
        for(i=size;i>0;i--){
            if(nums[i]>nums[i-1])
                count++;
            if(count==2)
                return nums[i-1];
        }
        return thirdMax;
    }
}