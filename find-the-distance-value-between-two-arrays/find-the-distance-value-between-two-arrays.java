class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int findTheDistanceValue = 0;
        int i = 0,j=0;
        for(i=0;i<arr1.length;i++){
            boolean flag = false;
            for(j=0;j<arr2.length;j++){
                if(Math.abs(arr1[i]-arr2[j])<=d)
                    flag = true;
            }
            if(!flag)
                findTheDistanceValue++;
        }

        return findTheDistanceValue;
    }
}