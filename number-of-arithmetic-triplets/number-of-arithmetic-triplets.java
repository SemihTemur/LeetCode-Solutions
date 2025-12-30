class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        int i = 0,j = 0,k = 0;
        int arithmeticTriplets = 0;

        for(i=0;i<nums.length;i++){
            for(j=i+1;j<nums.length;j++){
                for(k=j+1;k<nums.length;k++){
                    if(nums[j]-nums[i]==diff && nums[k]-nums[j]==diff)
                        arithmeticTriplets++;
                }
            }
        }

        return arithmeticTriplets;
    }
}