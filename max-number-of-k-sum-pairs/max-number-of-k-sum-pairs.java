class Solution {
    public int maxOperations(int[] nums, int k) {
        int maxOperations = 0;
        int left = 0;
        int right = nums.length-1;

        Arrays.sort(nums);

        while(left<right){
            int target = nums[left] + nums[right];
            
            if(target==k){
                maxOperations++;
                left++;
                right--;
            }
            else if(target<k)
                left++;
            
            else
                right--;
        }

        return maxOperations;
    }
}