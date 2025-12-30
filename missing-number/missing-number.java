class Solution {
    public int missingNumber(int[] nums) {
      Arrays.sort(nums);
      int missingNumber = 0,i;
      for(i=0;i<nums.length;i++){
        if(nums[i]!=missingNumber)
            return missingNumber;
        missingNumber++;
      }
      return  missingNumber;   
    }
}