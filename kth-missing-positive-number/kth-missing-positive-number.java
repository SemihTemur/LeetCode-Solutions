class Solution {
    public int findKthPositive(int[] arr, int k) {
        int nonNumber = 1, i, j = 0;
        int[] nonNumbersArray = new int[1001];

        for (i = 0; i < arr.length;) {
            if (arr[i] != nonNumber) {
                nonNumbersArray[j] = nonNumber;
                j++;
            } else
                i++;
            nonNumber++;
        }
        if(k>j){
            for (j=j; j < k; j++) {
                nonNumbersArray[j] = nonNumber;
                nonNumber++;
            }
        }
        return nonNumbersArray[k - 1];
    }
}