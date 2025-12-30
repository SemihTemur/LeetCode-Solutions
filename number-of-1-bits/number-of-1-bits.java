class Solution {
    public int hammingWeight(int n) {
        int hammingWeightCount = 0;
        while(n!=0){
            if(n%2==1)
                hammingWeightCount++;
            n = n/2;
        }
        return hammingWeightCount;
    }
}