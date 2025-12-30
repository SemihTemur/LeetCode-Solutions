class Solution {
    public int[] findErrorNums(int[] nums) {
        Set<Integer> repeatNumbers = new HashSet<Integer>();
        int repeatNumber = 1,sum=0,resultNums=0,i,missingNumber;
        for(int num : nums){
            sum = sum +num;
            if(!repeatNumbers.add(num)){
                repeatNumber = num;
            }
        }

        for(i=1;i<=nums.length;i++){
            resultNums = resultNums + i;
        }

        if(resultNums>=sum){
            resultNums = resultNums - sum;
            missingNumber = repeatNumber+resultNums;
        }
        else{
            sum = sum -resultNums;
            missingNumber = repeatNumber-sum;
        }

        int[] findErrorNums = new int[]{repeatNumber,missingNumber};
        return findErrorNums;

    }
}