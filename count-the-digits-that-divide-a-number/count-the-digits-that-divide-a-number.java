class Solution {
    public int countDigits(int num) {
        int countDigits = 0;
        int temp = num;
        while(temp!=0){
            int divideNum = temp %10;
            temp = temp /10;
            if(num%divideNum==0)
                countDigits++;
        }

        return countDigits;

    }
}