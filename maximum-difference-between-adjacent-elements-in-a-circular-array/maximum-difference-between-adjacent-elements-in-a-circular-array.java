class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int maxAdjacentDistance = Math.abs(nums[0]-nums[nums.length-1]),i=0;

        for(i=0;i<nums.length;i++){
            if(i!= nums.length-1 && Math.abs(nums[i]-nums[i+1])>maxAdjacentDistance)
                maxAdjacentDistance = Math.abs(nums[i]-nums[i+1]);
        }

        return maxAdjacentDistance;
    }
}