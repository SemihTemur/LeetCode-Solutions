class Solution {
    public int[] sumZero(int n) {
        int[] sumZero = new int[n];
        int i = 0;
        int numPositive = 1;
        int numNegative = -1;

        if(n%2==1)
            sumZero[i++] = 0;
        
        while(i<n){
            if(i%2==0){
                sumZero[i++] = numPositive;
                numPositive++;
            }
            else{
                sumZero[i++] = numNegative;
                numNegative--;
            }
            
        }

        return sumZero;
    }
}