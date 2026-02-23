class Solution {
    public int longestOnes(int[] nums, int k) {
        int i = 0,j = 0;
        int count = 0;
        int value = 0;
        int longestOnes = 0;

        for(i=0;i<nums.length;i++){
            for(j=i;j<nums.length;j++){
                if(count>=k && nums[j]==0)
                    break;
                else if(nums[j]==0)
                    count++;
                value++;
            }
            longestOnes = Math.max(longestOnes,value);
            value = 0;
            count = 0;
        }
       
        return longestOnes;
    }
}