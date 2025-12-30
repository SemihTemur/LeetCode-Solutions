class Solution {
    public boolean divideArray(int[] nums) {
       Map<Integer,Integer> map = new HashMap<>();

       int[] divideArray = new int[501];

       for(int num:nums)
           divideArray[num]++; 

        for(int num:nums){
            if(divideArray[num]%2!=0)
                return false;
        }

       return true; 
    }
}