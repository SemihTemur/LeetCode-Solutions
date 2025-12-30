class Solution {
    public int findMiddleIndex(int[] nums) {
       int i = 0;
       int length = nums.length;

       for(i=0;i<length;i++){
          if(i==0 && 0==sumRight(i+1,length,nums))
            return 0;
          
          if(i==length-1 && 0==sumLeft(0,length-1,nums))
            return length-1;

          if(sumLeft(0,i,nums)==sumRight(i+1,length,nums)){
                return i;
          }
       } 

        return -1;
    }

    public static int sumLeft(int startIndex,int endIndex,int[] nums){
        int sum = 0;

        while(startIndex<endIndex){
            sum = sum + nums[startIndex++];
        }

        return sum;
    } 

      public static int sumRight(int startIndex,int endIndex,int[] nums){
        int sum = 0;

        while(startIndex<endIndex){
            sum = sum + nums[startIndex++];
        }

        return sum;
    } 

}