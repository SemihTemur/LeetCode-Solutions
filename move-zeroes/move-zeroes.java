class Solution {
    public void moveZeroes(int[] nums) {
      int i,j,ZeroIndex=0;
      for(i=0;i<nums.length;i++){
        if(nums[i]!=0){
           nums[ZeroIndex]=nums[i];
           ZeroIndex++;
        }
      }
      for(j=ZeroIndex;j<nums.length;j++){
        nums[j]=0;
      }
    
    }
}