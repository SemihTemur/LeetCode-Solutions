class Solution {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int i=0,j=0,k=0,countGoodTriplets=0;

        for(i=0;i<arr.length;i++){
            for(j=i+1;j<arr.length-1;j++){
                for(k=j+1;k<arr.length;k++){
                    if(Math.abs(arr[i]-arr[j])<=a && Math.abs(arr[j]-arr[k])<=b && Math.abs(arr[i]-arr[k])<=c)
                        countGoodTriplets++;
                }
            }
        }

        return countGoodTriplets;
    }
}