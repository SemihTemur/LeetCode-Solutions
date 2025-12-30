class Solution {
    public boolean isPowerOfTwo(int n) {
        int result = 1, i;
        if (n == 1)
            return true;
        else if (n%2!=0)
            return false;
        while(n!=0 && n%2==0){
             if(n==2)
                return true;
            n = n/2;
        }
        return false;
    }
}